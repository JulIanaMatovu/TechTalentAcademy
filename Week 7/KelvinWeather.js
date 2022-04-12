//loops as long as the input is valid
do {
    getConstructionStatus();
} while (getTemperature != null && getCondition != "invalid condition");

function getTemperature() {
    let temperature;
    temperature = prompt("What is the temperature in celsius?")
    return temperature;
}

function getCondition() {
    let condition;
    condition = prompt("What is the current condition? Accepted values are: sunny, cloudy, raining, snowing or thunder.");

    if (condition != "sunny" ||
        condition != "cloudy" ||
        condition != "raining" ||
        condition != "snowing" ||
        condition != "thunder") {
        condition = "invalid condition"
    }
    console.log(condition);
    return condition;
}


function getWorkStatus() {
    let temp = parseInt(getTemperature());
    let cond = getCondition().toLowerCase();
    let goToWork;

    if (temp >= 10 && temp <= 20) {
        switch (cond) {
            case "sunny":
            case "cloudy":
                goToWork = true;
                break;
            case "raining":
            case "snowing":
                goToWork = false;
                break;
            default:
                break;
        }
    } else if (temp > 20 && temp <= 30) {
        switch (cond) {
            case "sunny":
            case "cloudy":
            case "raining":
                goToWork = true;
                break;
            case "snowing":
            case "thunder":
                goToWork = false;
                break;
            default:
                break;
        }
    } else {
        switch (cond) {
            case "sunny":
            case "cloudy":
            case "raining":
            case "snowing":
            case "thunder":
                goToWork = false;
                break;
            default:
                break;
        }

    }
    return goToWork;
}

function getConstructionStatus() {
    let workStatus = getWorkStatus();
    if (workStatus) {
        alert("Hi Kelvin! Great news - The weather is good enough for you to work on building your new lab.");
        console.log("Hi Kelvin! Great news - The weather is good enough for you to work on building your new lab.");
    } else {
        alert("Hi Kelvin. Sorry but you will have to work on building your new lab another day.");
        console.log("Hi Kelvin. Sorry but you will have to work on building your new lab another day.");
    }
}