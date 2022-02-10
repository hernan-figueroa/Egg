/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int temperatura;
        
        System.out.println("Ingrese la temperatura en centigrados");
        temperatura = leer.nextInt();
        
        System.out.println("El equivalente en Fahrenheit es: " + (32+(9*temperatura/5)));
    }
    
}
