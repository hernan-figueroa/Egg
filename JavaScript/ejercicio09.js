var frase = prompt("Ingrese una frase");
var resultado = "";
for (let index = 0; index < frase.length; index++) {
    resultado += frase.substring(index,index+1) + " ";
}

console.log(resultado);