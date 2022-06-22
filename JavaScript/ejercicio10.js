let funcion = (palabra) => {
    var resultado="";
    for (let index = 0; index < palabra.length; index++) {
        resultado += palabra.charAt(palabra.length -1 - index);
    }
    console.log(resultado);
}
//otra manera
let funcion2 = (palabra) => {
    let resultado = palabra.split('').reverse().join("");
    console.log(resultado);
}