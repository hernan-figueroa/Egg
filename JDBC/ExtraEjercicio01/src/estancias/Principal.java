/*
Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10
años.
 */
package estancias;

import estancia.entidades.Familia;
import estancia.persistencia.FamiliaDAO;
import estancia.servicios.FamiliaServicio;

/**
 *
 * @author Hernan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        FamiliaDAO fDAO = new FamiliaDAO();
        FamiliaServicio fs = new FamiliaServicio();

       // 1
        String sql = "Select * from familias where num_hijos >=3 and edad_maxima <10;";
        try {
            fs.mostrarFamilias(fDAO.consultarFamilias(sql));
        } catch (Exception e) {
            throw e;
        }

        //3
        String sql2 = "Select * from familias where email like '%hotmail%'";
        try {
             fs.mostrarFamilias(fDAO.consultarFamilias(sql2));
        } catch (Exception e) {
            throw e;
        }


    }

}
