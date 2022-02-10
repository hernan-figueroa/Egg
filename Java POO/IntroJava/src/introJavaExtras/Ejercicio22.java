/*
 Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos.

 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N,M;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamanio de fila y columna");
        N = leer.nextInt();
        M = leer.nextInt();
        
        int[][] mat;
        mat = new int[N][M];
        rellenarMat(mat);
        System.out.println(mat.length + "  " + mat[0].length);
        System.out.println("La sumatoria de toda la matriz es igual a " + sumarMat(mat));
        
    }
    public static void rellenarMat(int[][] mat){
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = (int) (Math.random()*10);
            }
        }
    }
    
    public static int sumarMat(int[][] mat){
        int suma=0;
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                suma += mat[i][j];
            }
        }
        return suma;
    }
    
    
}
