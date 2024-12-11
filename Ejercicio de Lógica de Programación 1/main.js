
// solicitamos los  números al usuario 

let numero1 = Number(prompt("Ingresa el 1er número (entero):"));
let numero2 = Number(prompt("Ingresa el 2do número (entero):"));
let numero3 = Number(prompt("Ingresa el 3er número (entero):"));

if (numero1 === numero2 && numero2 == numero3){
    console.log("Todos los números son iguales.");

} else {


//Para ordenar los numeros y compararlos 

let numeros = [numero1, numero2, numero3];

//creamos una copia del arreglo numeros y trabajamos con el
//Usamos la funcion de comparacion (a,b)
/* Para orden mayor a menor: b-a
   1) resultado (-) si b < a y a va antes que b en la lsita ordenada
   2) reusltado (+) si b > a y b va antes que a en la lista
*/

let ordenMayorMenor = [...numeros].sort((a,b) => b-a)
console.log("Orden de mayor a menor:", ordenMayorMenor.join(", "));

//La funcion es la misma solo se invierte el orden
//aplica la misma logica. 

let ordenMenorMayor = [...numeros].sort((a,b) => a-b)
console.log("Orden de mayor a menor:", ordenMenorMayor.join(", "));

}