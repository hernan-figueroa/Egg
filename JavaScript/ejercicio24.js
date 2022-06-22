
let resultado = document.getElementById("resultado");

document.getElementById("boton").onclick = calcularRadio;

function calcularRadio() {
    let diametro = document.getElementById("radio").value;
    resultado.innerText = diametro/2;
}


//----------------------------------------------------------------
