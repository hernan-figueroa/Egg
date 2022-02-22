/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ejercicio06;

import java.util.Scanner;
import servicios.ProductoServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ProductoServicio ps = new ProductoServicio();
        int op;
        do {            
            System.out.println("1 - introducir producto");
            System.out.println("2 - modificar precio");
            System.out.println("3 - eliminar producto");
            System.out.println("4 - mostrar productos");
            System.out.println("5 - salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    ps.agregarProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    
                    break;
                default:
                   
            }
            
        } while (op!=5);
    }
    
}
