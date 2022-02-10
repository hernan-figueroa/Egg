/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
 pida al usuario un numero a buscar en el vector. El programa mostrará donde se
 encuentra el numero y si se encuentra repetido
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector= new int[tam];
        
        System.out.println("Ingrese un numero a bucar");
        int num = leer.nextInt();
        
        llenaVectorAleatorio(vector);
        mostarVectorAleatorio(vector);
        buscarNumero(vector,num);
        
        
    }
    public static void llenaVectorAleatorio(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*10);
        }
    }
    public static void mostarVectorAleatorio(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
    public static void buscarNumero(int[] vector,int num){
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]==num){
                System.out.println("el numero "+num+" se encuentra en la posicion " + i);
            }
        }
    }
}
