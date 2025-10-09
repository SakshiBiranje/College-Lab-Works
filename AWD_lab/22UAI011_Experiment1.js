const randomWords = require("random-words");
const figlet = require("figlet");

let word = randomWords(); 

figlet(word, (err, data) => {
  if (err) {
    console.log("Something went wrong...");
    console.dir(err);
    return;
  }
  console.log(data);
});
