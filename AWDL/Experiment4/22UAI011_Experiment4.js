// Import Express
const express = require("express");
const app = express();
const PORT = 3001;

// Dummy data (simulating a database)
const users = [
  { id: 11, name: "Sakshi", email: "sakshi@example.com" },
  { id: 39, name: "Sudarshan", email: "sudarshan@example.com" }
  
];

// Default route
app.get("/", (req, res) => {
  res.send("Welcome to Dynamic Routing Experiment!");
});

// Dynamic route → fetch user by ID
app.get("/user/:id", (req, res) => {
  const userId = parseInt(req.params.id); // extract ID from URL
  const user = users.find(u => u.id === userId);

  if (user) {
    res.send(`User Found: Name - ${user.name}, Email - ${user.email}`);
  } else {
    res.status(404).send("User not found!");
  }
});

// Start server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
