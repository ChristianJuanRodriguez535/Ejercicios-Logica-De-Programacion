//Pedimos la temperatura en Celsius
let tempCelsius = prompt("Ingresa la temperatura en Celsius:");
//Convierte el texto en un numero flotante, que tiene decimales
tempCelsius= parseFloat(tempCelsius);

//Se verifica si el valor ingresado es un número
while (isNaN(tempCelsius)) {

tempCelsius = prompt("Por favor ingresa un número válido:");
tempCelsius = parseFloat(tempCelsius);

}

//Funcion para convertir Celsius a Fahrenheit

function convertirFahrenheit (celsius){

    return (celsius * 1.8) + 32;
}

//Funcion para convertir Celsius a Kelvin

function convertirKelvin(celsius) {

    return celsius + 273.15;
}

//Convertir los resultados y mostrarlos en consola 

const Fahrenheit = convertirFahrenheit(tempCelsius);
const Kelvin = convertirKelvin(tempCelsius);

console.log(` ${tempCelsius} °C equivalen a  ${Fahrenheit} °F`);

console.log(` ${tempCelsius} °C equivalen a  ${Kelvin} K`);
