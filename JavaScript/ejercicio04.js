var texto = prompt("Ingrese un numero");

function comprobar(string) {
    for (const letra of texto) {
        if (!letra.includes("S") & !letra.includes("N"))
            return console.log("Es incorrecto");
    }
    return console.log("Es correcto");
}
comprobar(texto);