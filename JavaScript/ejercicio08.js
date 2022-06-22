let total = 0;
let contador =0;
let max;
let min;
do {
    var numero = parseInt(prompt("Ingrese un numero"));
    if(numero!=0){
        contador++;
        if(total==0){
            max = numero;
            min = numero;
        }else if(numero>max){
            max = numero;
        }else if(numero<min){
            min = numero;
        }
        total += numero;
    }    
} while (numero!=0);

console.log("El numero mas grande es:" + max);
console.log("El numero mas chico es:" + min);
console.log("El promedio es:" + total/contador);