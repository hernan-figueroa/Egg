/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        final int N;
        System.out.println("Ingrese la cantidad de familias");
        N = leer.nextInt();
        
        int[] familias = new int[N];
        cargarDatos(familias);
        System.out.println("El promedio es de: " + promedioHijos(familias) );
        
    }
    
    public static void cargarDatos(int[] familias){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < familias.length; i++) {
            System.out.println("Ingrese la cantidad de hijos");
            familias[i] = leer.nextInt();
        }
    }
    
    public static float promedioHijos(int[] familias){
        int total=0;
        for (int i = 0; i < familias.length; i++) {
            total+=familias[i];
        }
        return total/familias.length;
    }
    
}
