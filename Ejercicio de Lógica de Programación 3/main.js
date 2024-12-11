

let num = prompt("Ingresa un numero entero positivo");
//analiza la cadena y la convierte en un número entero
num = parseInt(num);

while(isNaN (num) || num < 0) {

    num = prompt("Ingresa un número entero positivo: ");
    num = parseInt(num);

}

//Funcion para calcular el factorial

function calcFact (num){
     
    let factorial = 1;
     for (let i = 1; i <= num; i++){
        factorial = factorial * i;

     }
     return factorial
}

const resultFac = calcFact(num);
console.log(`El facotorial de ${num} es: ${resultFac}`);