let parrafo = document.getElementById("parrafo");

let array = parrafo.innerText.split(' ');

for (let i = 0; i < array.length; i++) {
    if (array[i].length > 8) {
        array[i] ='<span style="background-color:yellow">' + array[i] + '</span>'; 
    }
}

//let texto = array.toString()// convierte un array a un string pero los une con una coma
let texto = array.join(" "); // convierte un array en un string segun un separador(String)
/*
let exp = /,/gi; //se usa la expresion regular para que se reemplace en todo el texto
let resultado = texto.replace(exp," ");
*/
document.getElementById("parrafo").innerHTML = texto;
