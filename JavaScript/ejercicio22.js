let mensaje = document.getElementById("mensaje");

document.getElementById("123").onclick = mostrarMensaje;

function mostrarMensaje(){
    mensaje.innerText = document.getElementById("ingreso").value;;
}