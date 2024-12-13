// Juego para adivinar un número secreto entre 1 y 100
// número aleatorio
const numeroSecreto = Math.floor(Math.random() * 100) + 1;
// Aquí se guardan los intentos del usuario
let intentos = []; 
let numeroUsuario;

// Bucle para jugar hasta que el usuario adivine
while (true) {
    // Pedir número al usuario
    numeroUsuario = prompt("Adivina el número secreto (entre 1 y 100):");

    // Revisar si es un número válido
    if (numeroUsuario === null || numeroUsuario.trim() === "" || isNaN(numeroUsuario)) {
        alert("Por favor, escribe un número válido.");
        continue;
    }

    numeroUsuario = parseInt(numeroUsuario, 10);

    // Asegurarse de que el número esté en el rango
    if (numeroUsuario < 1 || numeroUsuario > 100) {
        alert("El número debe estar entre 1 y 100.");
        continue;
    }

    // Guardar el intento
    intentos.push(numeroUsuario);

    // Verificar si es correcto
    if (numeroUsuario === numeroSecreto) {
        alert("Felicidades, adivinaste el número secreto. " + numeroSecreto + ".");
        console.log("Intentos realizados: " + intentos.join(", "));
        break;
    } else {
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    }
}
