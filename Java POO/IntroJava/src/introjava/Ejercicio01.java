/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package introjava;

import java.util.Scanner;

/**
 * @author Hernan
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        System.out.println("La sema es igual a "+(num1+num2));
    }
    
}
