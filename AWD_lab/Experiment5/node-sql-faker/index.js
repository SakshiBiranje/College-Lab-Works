const express = require("express");
const app = express();
const PORT = 3000;

// Set EJS as templating engine
app.set("view engine", "ejs");

// Route to render EJS page
app.get("/", (req, res) => {
  const myName = "Sudarshan Jadhav";
  res.render("index", { name: myName });
});

// Start server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
