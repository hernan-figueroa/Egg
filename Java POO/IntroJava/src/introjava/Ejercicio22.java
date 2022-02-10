/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio22 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector= new int[tam];
        llenaVectorAleatorio(vector);
        mostarVectorAleatorio(vector);
        contarNumeros(vector);
        
        
    }
    public static void llenaVectorAleatorio(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*100000);
        }
    }
    public static void mostarVectorAleatorio(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    public static void contarNumeros(int[] vector){
        int[] digitos = new int[5];
        int aux;
        int contador;
        for (int i = 0; i < vector.length; i++) {
            contador=0;
            aux=vector[i];
            do { 
                aux=aux/10;
                contador++;
            } while (aux>0);
            digitos[contador-1]++;
        }
        for (int i = 0; i < digitos.length; i++) {
            System.out.println("Hay " + digitos[i]+ " numeros de "+(i+1)+" digito/os.");
        }
    }
}
