/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
 *  por pantalla.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre= leer.next();
        
        System.out.println(nombre);
    }
    
}
