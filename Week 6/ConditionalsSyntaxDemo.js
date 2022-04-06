//in binary true = 1; false = 0

let valueA = true;

if (valueA == 1) {
    console.log("This is true"); //this will be printed because it is true (true = 1)
}

if (valueA) { //checks whether variable is true
    console.log("This is also true"); //this will be printed because it is true (true = 1)
}

//arrays
let ageRange = [18, 19, 20, 21];

if (ageRange[0] == 18) {
    console.log("Yes! You're an adult!");
}

//Task 1

let temperature = 30;

if (temperature >= 20) {
    console.log("It is hot today!");
} else {
    console.log("It is not hot today!");
}

//Extension
//TODO: Compare 10 as a string("10"), and 10 as a number(10)
//? what is the result

let number = 10;
let string = "10";

if (number == string) {
    console.log("These variables are the same!");
} else {
    console.log("These variables are different!");
}

//result: these variables are the same (string and equivalent number) because the numbers are stored as 64bit
// i.e., this is the case even if string = "10.0" while number = 10 or vice versa

//Strict comparison
//TODO: Strictly compare 10 as a string("10"), and 10 as a number(10)
if (number === string) {
    console.log("These variables are the same!");
} else {
    console.log("These variables are different!");
}
//result: these variables are different because it checks whetehr the two variables are of the same type (which they are not)

let examResult = "a";

if (examResult == "a") { //do not write if(examResult) here because the code will always be seen as true unless var == 0 i.e., if(examResult) will always be true (no matter the string) unless value of variable is 0
    console.log("a");
} else if (examResult == "b") {
    console.log("b");
} else if (examResult == "c") {
    console.log("c");
} else {
    console.log("You have failed the exam");
}

/**
 * The following code is always false:
false
0
-0
0n -->BigInt zero
"",'' --> empty string value
null
undefined
NAN
document.all

everything else is true
 */

//Switch statement

let value = 10;

switch (value) {
    case 9:
    case 11: //you can put two cases together
        console.log("it is 9 or 11");
        break;
    case "10":
        console.log("10 as a string");
    default:
        console.log("something else"); //default is printed because a switch statement always does a strict comparison
        break;
}

let fruit = "pear";
let command = "You have bought a ";
let priceCommand = ". This costs ";

switch (fruit) {
    case "banana":
        console.log(command + fruit + priceCommand + "£0.60");
        break;
    case "apple":
        console.log(command + fruit + priceCommand + "£0.80");
        break;
    case "pear":
        console.log(command + fruit + priceCommand + "£0.90");
        break;
    case "jackfruit":
        console.log(command + fruit + priceCommand + "£1.00");
        break;
    default:
        console.log("Sorry! We do not sell this fruit! ");
        break;
}