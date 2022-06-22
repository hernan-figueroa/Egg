let limite = parseInt(prompt("Ingrese un numero limite positivo"));
let total = 0;
do {
    let numero = prompt("Ingrese un numero");
    total += parseInt(numero);
    alert(total);
} while (limite>total);