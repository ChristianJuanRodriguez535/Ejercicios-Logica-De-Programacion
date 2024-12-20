
    let num = prompt("Ingrese un número para generar la serie de Fibonacci ");
    
    while (isNaN(num) || !Number.isInteger(parseFloat(num))) { 
        
        alert("Por favor, ingrese un número válido.");

        num = prompt ("Ingrese un número para generar la serie de Fibonacci ");
    }
    
    num = parseInt(num);

function serieFibonacci (num){

let num1 = 0;
let num2 = 1;
let serieFibonacci = [num1];

for (let i = 1; i < num; i++ ) {
    let  suma = num1 + num2;
    num1 = num2;
    num2 = suma

    //El bucle debe ejecutarse num - 1, ya que el cero ya esta incluido en la serie porque esta dentro del arreglo.
    serieFibonacci.push(num1);

}
  let resultado = serieFibonacci.join(', ');
 return resultado;
}

console.log(`La serie de fibonacci para ${num} números es: ${serieFibonacci(num)}`);