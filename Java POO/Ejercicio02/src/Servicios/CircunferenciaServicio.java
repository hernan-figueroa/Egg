/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class CircunferenciaServicio {
    
    private Scanner leer = new Scanner(System.in);
    
    public Circunferencia crearCircunferencia(){
        
        System.out.println("Ingrese un radio");
        double r = leer.nextDouble();
        return new Circunferencia(r);
        
    }
    
    public double area(Circunferencia c){
        
        return Math.PI * c.getRadio();
    }
    
    public double perimetro(Circunferencia c){
        
        return 2 * Math.PI * c.getRadio();
    }
    
}
