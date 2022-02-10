/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
horas.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int min;
        System.out.println("Ingrese una cantidad de minutos");
        min = leer.nextInt();
        diasHoras(min);
    }

    public static void diasHoras(int min) {
        System.out.println(min / 1440 + " dia " + (min % 1440) / 60 + " horas");

    }
}
