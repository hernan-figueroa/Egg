/*

 */
package tienda;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.FabricanteDAO;
import tienda.persistencia.ProductoDAO;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

/**
 *
 * @author Hernan
 */
public class TestJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ProductoDAO pDAO = new ProductoDAO();
        FabricanteDAO fDAO = new FabricanteDAO();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opc = 0;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1 - Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2 - Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3 - Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4 - Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5 - Listar el nombre y el precio del producto más barato.");
            System.out.println("6 - Ingresar un producto a la base de datos.");
            System.out.println("7 - Ingresar un fabricante a la base de datos");
            System.out.println("8 - Editar un producto con datos a elección. Cmbio de nombre de un producto");
            System.out.println("0 - Salir.");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    try {
                        String consulta = "Select * from Producto";
                        for (Producto producto : pDAO.obtenerProductos(consulta)) {
                            System.out.println(producto.getNombre());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 2:
                    try {
                        String consulta = "Select * from Producto";
                        for (Producto producto : pDAO.obtenerProductos(consulta)) {
                            System.out.println("PRODUCTO: " + producto.getNombre() + "|| PRECIO: " + producto.getPrecio());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 3:
                    try {
                        String consulta = "Select * from Producto WHERE precio between 120 and 202";
                        for (Producto producto : pDAO.obtenerProductos(consulta)) {
                            System.out.println(producto.toString());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 4:
                    try {
                        String consulta = "Select * from Producto WHERE nombre like '%portatil%'";
                        for (Producto producto : pDAO.obtenerProductos(consulta)) {
                            System.out.println(producto.toString());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 5:
                    try {
                        String consulta = "Select * from Producto ORDER BY precio ASC LIMIT 1;";
                        for (Producto producto : pDAO.obtenerProductos(consulta)) {
                            System.out.println("PRODUCTO: " + producto.getNombre() + "|| PRECIO: " + producto.getPrecio());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 6:
                    try {
                        ProductoServicio ps = new ProductoServicio();
                        Producto p = ps.crearProducto();
                        pDAO.guardarProducto(p);
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 7:
                    try {
                        FabricanteServicio fs = new FabricanteServicio();
                        Fabricante f = fs.crearFabricante();
                        fDAO.guardarFabricante(f);
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                case 8:
                    System.out.println("Ingrese el codigo del producto que desea editar");
                    int codigo = leer.nextInt();
                    leer.nextLine();
                    try {
                        if (pDAO.buscarID(codigo) != 0) {
                            System.out.println("Ingrese el nuevo nombre");
                            String nombre = leer.nextLine();
                            pDAO.modificarNombreProducto(codigo, nombre);
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                    break;
                            
                case 0:

                    break;
            }

        } while (opc != 0);

    }

}
