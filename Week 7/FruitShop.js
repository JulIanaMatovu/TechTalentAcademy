let fruits = ["apple", "orange", "banana", "pear", "peach", "strawberry", "cherry", "acai"];

for (let x in fruits) {
    let vowels = 0;
    let consonants = 0;
    fruits[x].toLowerCase();
    for (let i = 0; i < fruits[x].length; i++) {
        switch (fruits[x][i]) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                vowels++;
                break;
            default:
                consonants++;
                break;
        }
        if (fruits[x][i] === fruits[x][i + 1]) {
            counter++;
        }

        console.log(fruits[x] + " has " + (counter + 1) + fruits[x][i]);
    }
    let consoleMessage;
    if (startsWithVowel(fruits[x])) {
        consoleMessage = "An " + fruits[x] + " has " + vowels;
    } else {
        consoleMessage = "A " + fruits[x] + " has " + vowels;
    }

    if (vowels == 1) {
        consoleMessage = consoleMessage + " vowel and " + consonants
    } else {
        consoleMessage = consoleMessage + " vowels and " + consonants
    }

    if (consonants == 1) {
        consoleMessage = consoleMessage + " consonants."
    } else {
        consoleMessage = consoleMessage + " consonants."
    }
    console.log(consoleMessage);


}

function startsWithVowel(fruit) {
    return /[aeiou]/i.test(fruit[0]);
}