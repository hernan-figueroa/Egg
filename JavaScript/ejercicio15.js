function Circulo(radio){
    this.radio = radio;
    this.perimetro = perimetro(this.radio);
    this.area = area(this.radio);
}

function perimetro(radio){
    var resultado = 2*Math.PI * radio;
    return resultado;
} 
function area(radio){
    var resultado = Math.PI * radio * radio;
    return resultado;
} 