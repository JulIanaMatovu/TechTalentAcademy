const KELVIN= 294;  //constant variable that represents 293 kelvin (degrees)
console.log(KELVIN);

let celsius = KELVIN - 273; //conversion: kelvin to celsius
console.log(celsius); 

let fahrenheit = celsius * (9/5) + 32; //conversion : celsius to fahrenheit; this var type allows reassignment
console.log(fahrenheit);

fahrenheit = Math.floor(celsius * (9/5) + 32);
console.log(fahrenheit);
console.log("The temperature is " + 
fahrenheit + " degrees Fahrenheit.");