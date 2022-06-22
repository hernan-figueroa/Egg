var numero1= parseInt(prompt("Ingrese un numero"));
var numero2 = parseInt(prompt("Ingrese un numero"));
var opc = prompt("Ingrese S o s para la suma, R o r para la resta, M o m para la multiplicación y D o d para la división.");

switch (opc) {
    case 's':
    case 'S':
        console.log(numero1+numero2);
        break;
    case 'r':
    case 'R':
        console.log(numero1-numero2);
        break;
    case 'm':
    case 'M':
        console.log(numero1*numero2);
        break;
    case 'd':
    case 'D':
        console.log(numero1/numero2);
        break;
    default:
        break;
}