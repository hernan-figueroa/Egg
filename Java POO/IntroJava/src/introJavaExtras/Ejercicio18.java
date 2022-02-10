/*
. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
  tamaño N, con los valores ingresados por el usuario.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        final int tam;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        tam = leer.nextInt();
        
        int[] vector= new int[tam];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un numero");
            vector[i]= leer.nextInt();
        }
        System.out.println(sumaVector(vector));
        
    }
    public static int sumaVector(int[] num){
        int suma=0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }
}
