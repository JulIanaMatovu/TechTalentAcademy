let username = "Jane";

if (username != "") {
    console.log("Hello, " + username);
} else {
    console.log("Hello");
}

let userQuestion = "When will I get a new job?";
console.log(username + ", you asked: " + userQuestion);

let randomNumber = Math.floor(Math.random() * (7 - 1 + 1) + 1);
let eightBall = "";

switch (randomNumber) {
    case 0:
        eightBall = "It is certain";
        break;
    case 1:
        eightBall = "It is decidely so"
        break;
    case 2:
        eightBall = "Reply hazy try again"
        break;
    case 3:
        eightBall = "Cannot predict now"
        break;
    case 4:
        eightBall = "Do not count on it"
        break;
    case 5:
        eightBall = "My sources say no"
        break;
    case 6:
        eightBall = "Outlook not so good"
        break;
    case 7:
        eightBall = "Signs point to yes"
        break;
    default:
        eightBall = "magic ball broken"
        break;
}
console.log(randomNumber);
console.log(eightBall);