/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
 los muestre por pantalla en orden descendente.
 */
package introjava;

/**
 *
 * @author Hernan
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector;
        vector = new int[100];
        llenaVector(vector);
        mostrarVector(vector);
    }
    
    public static void llenaVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i;
        }
    }
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length-1; i++) {
            System.out.println(vector[vector.length-1-i]);
        }
    }
}
