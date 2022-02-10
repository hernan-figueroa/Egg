/*
 Definir una clase llamada Punto que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Punto. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PuntosControl {
    private Scanner leer = new Scanner(System.in);

    public Punto crearPuntos() {
        System.out.println("Ingrese x1");
        float x1 = leer.nextInt();
        System.out.println("Ingrese y1");
        float y1 = leer.nextInt();
        System.out.println("Ingrese x2");
        float x2 = leer.nextInt();
        System.out.println("Ingrese y2");
        float y2 = leer.nextInt();

        return new Punto(x1, y1, x2, y2);
    }
    
    public float  calcularDistancia(Punto p){
        
        return (float)(Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2) + Math.pow(p.getY2()-p.getY1(), 2) ));
        
    }

}
