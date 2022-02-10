/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int pares,impares,num,contador;
        pares=impares=contador=0;
        do {            
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if(num<0)continue;
            if(num%5 == 0)break;
            if(num%2 == 0) pares++;
            else impares++;
            contador++;
        } while (num%5 != 0);
        
        System.out.println(pares + " pares, "+impares+" impares y " + contador + " numeros ingresados.");
    }
    
}
