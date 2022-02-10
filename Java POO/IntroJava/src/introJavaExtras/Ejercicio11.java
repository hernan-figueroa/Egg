/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num;
        int contador;
        contador = 0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        do {         
            contador++;
            num = num/10;
        } while (num>0);
        System.out.println("La cantidad de digitos es " + contador);
    }
    
}
