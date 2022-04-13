let decideOperation;
let endPrompt

decideOperation = prompt("Type 't' if you would like to do a trigonometry operation,'n' for normal maths operations and 's' to stop.")
decideOperation = decideOperation.toLowerCase();

do {
    if (decideOperation === 'n') {
        getNormalOperationPrompt();
    }

    if (decideOperation === 't') {
        getTrigOperationPrompt();
    }

    decideOperation = prompt("Type 't' if you would like to do a trigonometry operation,'n' for normal maths operations and 's' to stop.")
    decideOperation = decideOperation.toLowerCase();
} while (decideOperation !== 's')


function getNormalOperationPrompt() {
    let firstValue = parseInt(prompt("What is your first value?"));
    let secondValue = parseInt(prompt("What is your second value?"));
    let operation = prompt("What is your operation?");

    console.log(getAnswer(firstValue, secondValue, operation));
}

function getTrigOperationPrompt() {
    let trigonometryValue = parseInt(prompt("What is your value for calculating sin, cos or tan?"));
    let trigonometryOperation = prompt("What is your desired trigonometry operation (sin, cos or tan)?");

    console.log(getTrigAnswer(trigonometryValue, trigonometryOperation));
}

function getTrigAnswer(trigVal, trigOperation) {
    let trigAnswer;
    trigOperation = trigOperation.toLowerCase();
    switch (trigOperation) {
        case "sin":
            trigAnswer = Math.sin(trigVal);
            break;
        case "cos":
            trigAnswer = Math.cos(trigVal);
            break;
        case "tan":
            trigAnswer = Math.tan(trigVal);
            break;
        default:
            trigAnswer = "Invalid Trigonometry value.";
            break;
    }
    return trigAnswer;
}



function getAnswer(firstVal, secondVal, operationVal) {
    let answer;
    switch (operationVal) {
        case "*":
            answer = firstVal + operationVal + secondVal + "=" + multiplication(firstVal, secondVal);
            break;
        case "/":
            answer = firstVal + operationVal + secondVal + "=" + division(firstVal, secondVal);
            break;
        case "-":
            answer = firstVal + operationVal + secondVal + "=" + subtraction(firstVal, secondVal);
            break;
        case "+":
            answer = firstVal + operationVal + secondVal + "=" + addition(firstVal, secondVal);
            break;
        case "^":
            answer = firstVal + operationVal + secondVal + "=" + powerOf(firstVal, secondVal);
            break;
        default:
            answer = "Incorrect operation";
            break;
    }
    return answer;
}



function multiplication(firstVal, secondVal) {
    return firstVal * secondVal;
}

function addition(firstVal, secondVal) {
    return firstVal + secondVal;
}

function subtraction(firstVal, secondVal) {
    return firstVal - secondVal;
}

function division(firstVal, secondVal) {
    return firstVal / secondVal;
}

function powerOf(firstVal, secondVal) {
    return Math.pow(firstVal, secondVal);
}