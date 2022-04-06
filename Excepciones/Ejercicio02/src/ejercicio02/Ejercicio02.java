/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).
 */
package ejercicio02;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int array[] = new int[5];
        try {
            for (int i = 0; i < 6; i++) {
                array[i] = i;
                System.out.println("Hola desde posicion" + i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Te pasaste de largo capo");
        }
    }

}
