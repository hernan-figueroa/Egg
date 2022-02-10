/*
 Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package introJavaExtras;

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
        Scanner leer = new Scanner(System.in);
        int num,aux;
        aux = 1;
        
        System.out.println("Ingrese altura de la escalera");
        num = leer.nextInt();
        do {      
            for (int i = 0; i < aux; i++) {
                System.out.print(i+1);
            }
            System.out.println("");
            aux++;
            
        } while (aux<=num);
    }
    
}
