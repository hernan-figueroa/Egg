
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Hernan
 */
public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante==null){
                throw new Exception("Debe indicar Fabricante");
            }
            String sql = "INSERT INTO Fabricante(codigo,nombre) "
                    + "values ('"+fabricante.getCodigo()+"','"+fabricante.getNombre()+"');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void modificarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante==null){
                throw new Exception("Debe indicar Fabricante");
            }
            String sql = "UPDATE Fabricante SET "
                    + "nombre = '"+fabricante.getNombre()+"' WHERE codigo = "+fabricante.getCodigo()+";";
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(String fabricante) throws Exception{
        
        try {  
            String sql = "DELETE FROM Fabricante WHERE nombre = '"+fabricante+"';";
            insertarModificarEliminar(sql);            
        } catch (Exception e) {
            throw e;
        }
    }
    
}
