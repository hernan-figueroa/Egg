/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner leer = new Scanner(System.in);
        
        do {   
            
            System.out.println("Ingrese una nota");
            nota = leer.nextInt();
            
        } while (nota<0 || nota>10);
        
    }
    
}
