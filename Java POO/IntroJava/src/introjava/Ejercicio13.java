/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,suma;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        System.out.println("Ingrese un numero maximo");
        num = leer.nextInt();
        do {   
            
            System.out.println("Ingrese un numero");
            suma += leer.nextInt();
            
            
        } while (suma<=num);
    }
    
}
