const express = require("express");
const app = express();
const port = 3002;

// Set EJS as the template engine
app.set("view engine", "ejs");

// Root route - redirects to main experiment page
app.get("/", (req, res) => {
  res.redirect("/22UAI011_Experiment5");
});

// Main route for home page - Experiment 5: EJS Templating
app.get("/22UAI011_Experiment5", (req, res) => {
  res.render("index", { 
    name: "Sakshi Biranje", 
    subject: "EJS Templating Engine with Express.js",
    experimentNo: "Experiment 5",
    date: new Date().toLocaleDateString()
  });
});

// About route demonstrating dynamic content
app.get("/22UAI011_Experiment5/about", (req, res) => {
  res.render("about", { 
    topic: "EJS (Embedded JavaScript) Templating", 
    Teacher: "Shivani Tate",
    course: "Advanced Web Development Laboratory (AWDL)",
    studentId: "22UAI011"
  });
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
