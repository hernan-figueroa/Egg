/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num,contador;
        String asteriscos;
       
        contador=0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            asteriscos="";
            for (int i = 0; i < num; i++) {
                asteriscos+="*";
            }
            System.out.println(num + " " + asteriscos);
            contador++;
        } while (contador<4);
        
    }
    
}
