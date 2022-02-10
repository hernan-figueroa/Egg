/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][]m = new int[10][10];
        int[][]p = new int[3][3];
        
        llenaMatriz(m);
        mostrarMatriz(m);
        System.out.println("----------");
        llenaMatriz(p);
        mostrarMatriz(p);
        
        buscarMatriz(m,p);
    }
    
    public static void llenaMatriz(int[][] mat) {
         for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {  
                mat[i][j]= (int) (Math.random()*2);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
    }
    public static void buscarMatriz(int[][] m,int[][] p) {
        boolean iguales=false;
        int posJ,posI;
        
        for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(m[i][j]==p[0][0]){
                    posI=i;
                    posJ=j;
                    if(posI<6 && posJ<6 && buscarNumMatriz(m,p,posJ,posI)){
                        System.out.println(posI + " "+ posJ);
                    }
                }
            }
            
        }
    }
     public static boolean buscarNumMatriz(int[][] m,int[][] p,int posJ,int posI) {
        boolean iguales=false;
        
        for (int i = 0; i < p[0].length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                if(m[i+posI][j+posJ]!=p[i][j]){
                    return false;   
                }
            }  
        }
        return true;
    }
}
