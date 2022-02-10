/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        System.out.println("Doble: " + num*2);
        System.out.println("Triple: " + num*3);
        System.out.println("Raiz cuadrada: " + Math.sqrt(num));
             
    }
    
}
