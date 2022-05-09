/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.persistencia;

import estancia.entidades.Familia;
import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public final class FamiliaDAO extends DAO{
    
    public ArrayList<Familia> consultarFamilias(String sql) throws Exception{
        
         ArrayList<Familia> familias = new ArrayList<>();
        try {
            consultarBase(sql);
            while (resultado.next()) {                
                familias.add(new Familia(resultado.getInt(1), resultado.getString(2), resultado.getInt(3),
                        resultado.getInt(4), resultado.getInt(5), resultado.getString(6), resultado.getInt(7)));
            }  
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
        return familias;   
    }
    
    
    
}
