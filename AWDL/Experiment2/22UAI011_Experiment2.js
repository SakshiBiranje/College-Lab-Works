var express = require("express");
var app = express();

app.get("/", function (req, res) {
  const date = new Date().toLocaleString();
  res.send("Hello World <br> Current Timestamp: " + date);
});

app.get("/22UAI011_Experiment2", function (req, res) {
  const date = new Date().toLocaleString();
  res.send("Hello World <br> Current Timestamp: " + date);
});

app.listen(3000, function () {
  console.log("Server is running on port 3000");
});

