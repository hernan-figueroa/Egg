/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int personas;
        float sumatoria;
        sumatoria =0;
        
        System.out.println("Ingrese la cantidad de personas");
        personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura numero " + (i+1));
            sumatoria+= leer.nextFloat();
        }
        System.out.println("El promedio es: " + sumatoria/personas);
    }
    
}
