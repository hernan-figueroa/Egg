package tienda.persistencia;

import com.sun.org.apache.xml.internal.serializer.ToTextStream;
import java.util.ArrayList;
import tienda.entidades.Producto;

/**
 * @author Hernan
 */
public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws Exception {

        try {
            if (producto == null) {
                throw new Exception("Debe indicar Producto");
            }
            String sql = "INSERT INTO Producto(codigo,nombre,precio,codigo_fabricante) "
                    + "values (" + producto.getCodigo()
                    + ",'" + producto.getNombre()
                    + "'," + producto.getPrecio()
                    + "," + producto.getCod_fabricante()
                    + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarNombreProducto(Integer codigo, String nombre) throws Exception {

        try {
            String sql = "UPDATE Producto SET "
                    + "nombre = '" + nombre
                    + "' WHERE codigo = " + codigo + ";";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarProducto(String producto) throws Exception {

        try {
            String sql = "DELETE FROM Producto WHERE nombre = '" + producto + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> obtenerProductos(String consulta) throws Exception {
        ArrayList<Producto> productos = new ArrayList<>();
        try {
            consultarBase(consulta);
            Producto p = null;
            while (resultado.next()) {
                p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCod_fabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        return productos;
    }

    public ArrayList<String> obtenerNombreProductos() throws Exception {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            String consulta = "Select nombre from Producto";
            consultarBase(consulta);
            while (resultado.next()) {

                nombres.add(resultado.getString(1));
            }
            desconectarBase();

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        return nombres;
    }

    public int buscarID(int id) throws Exception {
        String sql = "SELECT * FROM Producto WHERE codigo =" + id + "; ";
        int size = 0;
        try {        
            consultarBase(sql);
            if (resultado != null) {
                resultado.last();
                size = resultado.getRow();
            }
        } catch (Exception e) {
            throw e;
        }
        return size;
    }
}
