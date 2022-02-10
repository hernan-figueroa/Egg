/*
. Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        System.out.println(esPrimo(num));
        
        
    }
    public static boolean esPrimo(int num){
        int contador = 0;
        
        for (int i = 1; i <= num; i++) {
            if(num%i == 0){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else return false;
    }
    
}
