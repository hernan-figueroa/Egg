/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class RectanguloServicio {
    private Scanner leer = new Scanner(System.in);
    
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese altura");
        double altura = leer.nextDouble();
        System.out.println("Ingrese base");
        double base = leer.nextDouble();
        
        return new Rectangulo(base, altura);
    }
    
    public double superficie(Rectangulo r){
        
        return r.getBase() * r.getAltura();
    }
    
    public double perimetro(Rectangulo r){
        
        return (r.getBase() + r.getAltura()) * 2;
    }
    
    public void dibujar(Rectangulo r){
        for (int i = 0; i < r.getBase(); i++) {
            for (int j = 0; j < r.getAltura(); j++) {
                if(i==0 || i==r.getBase()-1){
                    System.out.print("* ");
                }else if(j==0 || j==r.getAltura()-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
    
}
