/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] numRomanos= {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        num = leer.nextInt();
        
        System.out.println(num +" es equivalente a " + numRomanos[num-1]);
    }
    
}
