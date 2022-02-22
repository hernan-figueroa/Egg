/*

Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class ProductoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Float> productos = new HashMap<>();
    
    public void agregarProducto(){
        System.out.println("Ingrese producto y precio");
        productos.put(leer.next(), leer.nextFloat());
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese producto y precio nuevo");
        productos.replace(leer.next(), leer.nextFloat());
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese producto a eliminar");
        productos.remove(leer.next());
    }
    
    public void mostrarProductos(){
        for (Map.Entry<String, Float> entry : productos.entrySet()) {
            System.out.println( entry.getKey() +" : " + entry.getValue());
              
        }
    }
        
    
}
