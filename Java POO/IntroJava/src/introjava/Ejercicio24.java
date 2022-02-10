/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa)
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int[][] mat= new int[3][3];
            System.out.println(mat.length);
        llenaMatriz(mat);
        mostrarMatriz(mat);
        System.out.println("-----------");
        mostrarTranspuesta(mat);
        System.out.println(esAntisimetrica(mat));
    }
    
    public static void llenaMatriz(int[][]mat){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println("ingrese un numero");
                mat[i][j]= leer.nextInt();
            }
        }
        
    }
     public static void mostrarMatriz(int[][]mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        
    }
    public static void mostrarTranspuesta(int[][]mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[j][i] + "  ");
            }
            System.out.println("");
        }
    } 
    
    public static boolean esAntisimetrica(int[][]mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[j][i] != -mat[i][j] && Math.abs(mat[j][i])!= Math.abs(mat[i][j]) ){
                    return false;
                }
            }
        }
        return true;
    }
    
}
