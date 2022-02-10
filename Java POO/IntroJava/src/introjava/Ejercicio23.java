/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
 la traspuesta de la matriz.
 */
package introjava;

/**
 *
 * @author Hernan
 */
public class Ejercicio23 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat= new int[4][4];
        llenaMatriz(mat);
        mostrarMatriz(mat);
        System.out.println("-----------");
        mostrarTranspuesta(mat);
        
    }
    
    public static void llenaMatriz(int[][]mat){
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j]= (int) (Math.random()*9);
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
                System.out.print(mat[j][i]);
            }
            System.out.println("");
        }
    }
    
}
