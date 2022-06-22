/* ELIMINAR EL onsubmit del html
var form = document.getElementById("form1");

form.addEventListener("submit", function(e){
    e.preventDefault();
    let nombre = document.getElementById("nombre").value;
    let apellido = document.getElementById("apellido").value;
    console.log(nombre);
    console.log(apellido);

})
*/
 //ELIMINAR EL onsubmit del html
document.getElementById("form1").onsubmit = function(e){
    e.preventDefault();
        let nombre = document.getElementById("nombre").value;
        let apellido = document.getElementById("apellido").value;
        console.log(nombre);
        console.log(apellido);
}

/*
function getFormValores() {
    let nombre = document.getElementById("nombre").value;
    let apellido = document.getElementById("apellido").value;

    alert(`${nombre}  ${apellido}`);
}

function getFormValores() {

    let nombre = document.getElementById("nombre").value;
    documento.cookie = "nombre=" + nombre;
    let apellido = document.getElementById("apellido").value;
    documento.cookie = "apellido=" + apellido;

}
*/