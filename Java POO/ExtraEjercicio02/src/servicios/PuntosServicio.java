/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa
en los atributos del objeto. Después, a través de otro método calcular y devolver la
distancia que existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
 */
package servicios;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PuntosServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        double x1,x2,y1,y2;
        System.out.println("Ingrese x1,y1,x2,y2 ");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
       
        return new Puntos(x1, x2, y1, y2);
    }
    
    public double distanciaEntrePuntos(Puntos p){
        
        double resultado =  Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+Math.pow(p.getY2()-p.getY1(), 2));
        
        return resultado;
    }
}
