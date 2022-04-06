let raceNumber = Math.floor(Math.random() * 1000);
let registeredEarly = true; //whether runner registered early
let runnerAge = 24;

if (runnerAge > 18 && registeredEarly) { //early adult registrants
    raceNumber += 1000;
    console.log("You will at race 9:30AM. Your race number is " + raceNumber);
} else if (runnerAge > 18 && !registeredEarly) { //late adult registrants
    console.log("You will race at 11AM. Your race number is " + raceNumber);
} else if (runnerAge < 18) { //youth registrants
    console.log("You will run at 12:30pm. Your race number is " + raceNumber);
} else { //18 year olds
    console.log("See the registration desk");
}