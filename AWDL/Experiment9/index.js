const express = require("express");
const { faker } = require("@faker-js/faker");
const sqlite3 = require("sqlite3").verbose();

const app = express();
const PORT = 3005;

// Set EJS as template engine
app.set("view engine", "ejs");

// Connect SQLite
let db = new sqlite3.Database("employees.db");

// Create & seed DB
db.serialize(() => {
  db.run(`
    CREATE TABLE IF NOT EXISTS employees (
      id INTEGER PRIMARY KEY AUTOINCREMENT,
      name TEXT,
      email TEXT,
      job_title TEXT,
      department TEXT,
      salary REAL
    )
  `);

  // Clear old data
  db.run("DELETE FROM employees");

  const departments = ["HR", "IT", "Sales", "Finance", "Marketing"];
  let insertStmt = db.prepare(
    "INSERT INTO employees (name, email, job_title, department, salary) VALUES (?, ?, ?, ?, ?)"
  );

  for (let i = 0; i < 100; i++) {
    const name = faker.person.fullName();
    const email = faker.internet.email();
    const jobTitle = faker.person.jobTitle();
    const department = departments[Math.floor(Math.random() * departments.length)];
    const salary = (Math.random() * (120000 - 30000) + 30000).toFixed(2);
    insertStmt.run(name, email, jobTitle, department, salary);
  }

  insertStmt.finalize();
});

// Route → render HTML page
app.get("/", (req, res) => {
  db.all("SELECT * FROM employees", [], (err, rows) => {
    if (err) throw err;
    res.render("index", { employees: rows }); // pass data to HTML
  });
});

app.listen(PORT, () => {
  console.log(`🚀 Server running at http://localhost:${PORT}`);
});
