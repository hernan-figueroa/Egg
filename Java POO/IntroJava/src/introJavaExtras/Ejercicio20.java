/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
package introJavaExtras;

/**
 *
 * @author Hernan
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] vec = new int[10];
        llenarVector(vec);
        mostrarVector(vec);
    }
    
    public static void llenarVector(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random()*10);
        }
    }
    public static void mostrarVector(int[] vec){
        for (int i = 0; i < vec.length; i++) {
            System.out.println(vec[i]);
        }
    }
    
}
