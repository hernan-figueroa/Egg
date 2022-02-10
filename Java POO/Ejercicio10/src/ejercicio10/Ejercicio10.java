/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;

/**
 *
 * @author Hernan
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float[] A = new float[50];
        cargarAleatorio(A);
        mostrarArray(A);
        Arrays.sort(A);
        float[] B = new float[20];
        System.out.println("-------------------");
        cargarPrimeros10(A, B);
        mostrarArray(B);
        
        

    }

    public static void cargarAleatorio(float[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (float)(Math.random()*100);
        }
    }
     public static void mostrarArray(float[] arreglo) {
        
        for (float f : arreglo) { // areglo[1] = f
            System.out.println(f);
        }
    }
     public static void cargarPrimeros10(float[] arreglo,float[] arreglo2) {
//         for (int i = 0; i < arreglo2.length; i++) {
//             arreglo2[i] = 0.5f;
//         }
         Arrays.fill(arreglo2,10,20,0.5f);
         
         
         
         for (int i = 0; i < 10; i++) {
             arreglo2[i] = arreglo[i];
         }
    }
}
