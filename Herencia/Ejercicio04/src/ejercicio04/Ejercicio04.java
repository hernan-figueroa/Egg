/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package ejercicio04;

import enidades.Circulo;
import enidades.Cuadrado;

/**
 *
 * @author Hernan
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5.0,10.0);
        Circulo circulo = new Circulo(12.0);
        
        System.out.println(cuadrado.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
    
}
