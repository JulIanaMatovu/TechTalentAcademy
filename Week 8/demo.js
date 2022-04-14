function helloWorldAlert() {
    window.alert("Hello Class!");
}

function changeText() {
    let e = document.getElementById("pageTitle"); //find element with id of paragraph
    e.style.color = "red"; //the color style is red for the h1 page title
}

function changeTextFont() {
    let f = document.getElementById("crazyStatement");
    f.style.position = "absolute";
    f.style.color = "#00ff00";
}

function changeSize() {
    let f = document.getElementById("button3");
    f.style.color = "purple";
}

function checkForm() {
    let firstname = document.getElementById("fname");
    let lastname = document.getElementById("lname");
    let emailAd = document.getElementById("email");

    if (firstname.value != "" && lastname.value != "" && emailAd.value != "") {
        window.alert("Hello " + firstname.value + " " + lastname.value + ". Your email " + emailAd.value + " has been added to the mailing list.");
    } else {
        window.alert("Your first name, last name or email address is invalid.")
    }

}