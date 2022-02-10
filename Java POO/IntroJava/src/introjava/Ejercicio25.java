/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package introjava;

import static introjava.Ejercicio24.llenaMatriz;
import static introjava.Ejercicio24.mostrarMatriz;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] mat = new int[3][3];

        llenaMatriz(mat);
        mostrarMatriz(mat);
        System.out.println("Es magica " + esMagica(mat));
        

    }

    public static void llenaMatriz(int[][] mat) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                do {
                    System.out.println("ingrese un numero");
                    mat[i][j] = leer.nextInt();
                } while (mat[i][j] < 0 || mat[i][j] > 10);

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

    public static boolean esMagica(int[][] mat) {
        int suma1, suma2;
        suma1 = 0;
        for(int i = 0; i < mat[0].length; i++) {
            
            suma1 = 0;
            suma2 = 0;
            for (int j = 0; j < mat[0].length; j++) {
                suma1 += mat[i][j];
                suma2 += mat[j][i];
            }
            if (suma1 != suma2) {
                return false;
            }
        }
        suma2=0;
        for (int i = 0; i < mat[0].length; i++) {
            suma2 += mat[i][i];
        }

        if(suma1 != suma2){
            return false;
        }
  
        return true;
    }

}
