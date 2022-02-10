/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
horizontal en una fila que será seleccionada de manera aleatoria. Una vez
concluida la ubicación de las palabras, rellene los espacios no utilizados con un
número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
funciones de Java substring(), Length() y Math.random(). 
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] palabra;
        String[][] sopa;
        String aux;
        sopa = new String[20][20];
        palabra = new String[5];
        
        for (int i = 0; i < 5; i++) {
            do {  
                System.out.println("Ingrese una plabra");
                aux = leer.nextLine();
                if(aux.length()>=3 && aux.length()<=5 ){
                    
                    palabra[i] = aux;
                    break;
                }
            } while (true);
        }
        llenarSopaAleatorio(sopa);
        mostrarVector(palabra);
        agregarPalabras(sopa, palabra);
        mostrarSopa(sopa);
        
    }
    public static void llenarSopaAleatorio(String[][] mat){
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                mat[i][j] = String.valueOf((int)(Math.random()*9));
            }
        }
    }
    
    public static void mostrarVector(String[] vec){
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
    
    public static void agregarPalabras(String[][] mat, String[] vec){
        int fila;
        int columna;
        for (int i = 0; i < 5; i++) {
            
            fila  = (int)(Math.random()*19);
            columna  =(int)(Math.random()*14);
                
                mat[fila][columna] = vec[i].substring(0,1);
                mat[fila][columna+1] = vec[i].substring(1,2);
                mat[fila][columna+2] = vec[i].substring(2,3);
                if(vec[i].length()>3){
                    mat[fila][columna+3] = vec[i].substring(3,4);
                }
                if(vec[i].length()==5){
                    mat[fila][columna+4] = vec[i].substring(4);
                }
        }
    }
    
    public static void mostrarSopa(String[][] mat){
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("|" + mat[i][j] + "|");
            }
            System.out.println("");
        }
    }
    
}
