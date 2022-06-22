function llenado(){
    var array1 = arrayRamdom5();
    var array2 = arrayRamdom5();
    console.log("Array 1")
    array1.forEach(mostrarElementosArray);
    console.log("Array 2")
    array2.forEach(mostrarElementosArray);

}

function arrayRamdom5(){
    var resultado=[];
    for(var i=0;i<5;i++){
        resultado[i] = Math.round(Math.random()*10);
    }
    return resultado;
}

function mostrarElementosArray(elemento, indice, array) {
    console.log("a[" + indice + "] = " + elemento);
}