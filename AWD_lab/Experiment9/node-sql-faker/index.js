// index.js
const fs = require('fs');
const path = require('path');
const Database = require('better-sqlite3');
const { faker } = require('@faker-js/faker');

// Config
const DB_FILE = path.join(__dirname, 'employees.db');
const HTML_FILE = path.join(__dirname, 'employees.html');
const N = 100; // number of employees to create

// Remove existing DB (optional)
try { fs.unlinkSync(DB_FILE); } catch (e) { /* ignore if doesn't exist */ }

// Open / create DB
const db = new Database(DB_FILE);

// Create table
db.exec(`
CREATE TABLE employees (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  first_name TEXT NOT NULL,
  last_name TEXT NOT NULL,
  email TEXT NOT NULL UNIQUE,
  phone TEXT,
  job_title TEXT,
  department TEXT,
  salary REAL,
  hire_date TEXT,
  city TEXT,
  country TEXT
);
`);

// Prepare insert statement
const insert = db.prepare(`
  INSERT INTO employees
    (first_name, last_name, email, phone, job_title, department, salary, hire_date, city, country)
  VALUES
    (@first_name, @last_name, @email, @phone, @job_title, @department, @salary, @hire_date, @city, @country)
`);

// Static lists
const departments = ['Engineering','HR','Sales','Marketing','Finance','Customer Success','IT','Operations'];
const jobTitles = [
  'Software Engineer','Senior Software Engineer','QA Engineer','Product Manager','Business Analyst',
  'HR Manager','Sales Executive','Marketing Specialist','Finance Associate','Support Engineer'
];

// Transaction for faster inserts
const insertMany = db.transaction((rows) => {
  for (const r of rows) insert.run(r);
});

// Generate fake employee data
const rows = [];
for (let i = 0; i < N; i++) {
  const gender = faker.person.sexType(); // ✅ corrected
  const first_name = faker.person.firstName(gender);
  const last_name = faker.person.lastName(gender);
  const email = faker.internet.email({ firstName: first_name, lastName: last_name }).toLowerCase();
  const phone = faker.phone.number();
  const job_title = faker.helpers.arrayElement(jobTitles);
  const department = faker.helpers.arrayElement(departments);
  const salary = Number(faker.finance.amount({ min: 30000, max: 200000, dec: 2 }));
  const hire_date = faker.date.past({ years: 10 }).toISOString().slice(0, 10);
  const city = faker.location.city();
  const country = faker.location.country();

  rows.push({ first_name, last_name, email, phone, job_title, department, salary, hire_date, city, country });
}

// Insert data into DB
insertMany(rows);
console.log(`✅ Inserted ${N} employee rows into ${DB_FILE}`);

// Query back data
const stmt = db.prepare('SELECT * FROM employees ORDER BY id LIMIT 200');
const results = stmt.all();

// Print as console table
console.table(results);

// Escape HTML helper
function escapeHtml(s) {
  if (s == null) return '';
  return String(s)
    .replaceAll('&','&amp;')
    .replaceAll('<','&lt;')
    .replaceAll('>','&gt;')
    .replaceAll('"','&quot;')
    .replaceAll("'",'&#39;');
}

// Generate HTML
const html = `
<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <title>Employees (${N})</title>
  <style>
    body { font-family: Arial, sans-serif; padding: 20px; }
    table { border-collapse: collapse; width: 100%; }
    th, td { border: 1px solid #ddd; padding: 8px; font-size: 13px; }
    th { background: #f4f4f4; text-align: left; }
    tr:nth-child(even){ background: #fafafa;}
    caption { font-size: 18px; margin-bottom: 10px; font-weight: bold; }
  </style>
</head>
<body>
  <table>
    <caption>Employees (${N})</caption>
    <thead>
      <tr>
        <th>id</th><th>first_name</th><th>last_name</th><th>email</th><th>phone</th>
        <th>job_title</th><th>department</th><th>salary</th><th>hire_date</th><th>city</th><th>country</th>
      </tr>
    </thead>
    <tbody>
      ${results.map(r => `
        <tr>
          <td>${r.id}</td>
          <td>${escapeHtml(r.first_name)}</td>
          <td>${escapeHtml(r.last_name)}</td>
          <td>${escapeHtml(r.email)}</td>
          <td>${escapeHtml(r.phone)}</td>
          <td>${escapeHtml(r.job_title)}</td>
          <td>${escapeHtml(r.department)}</td>
          <td>${r.salary}</td>
          <td>${r.hire_date}</td>
          <td>${escapeHtml(r.city)}</td>
          <td>${escapeHtml(r.country)}</td>
        </tr>
      `).join('')}
    </tbody>
  </table>
</body>
</html>
`;

// Write HTML file
fs.writeFileSync(HTML_FILE, html, 'utf8');
console.log(`✅ Wrote ${HTML_FILE} — open it in your browser to view the table.`);

// Close DB
db.close();
