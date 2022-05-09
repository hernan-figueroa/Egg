/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia.servicios;

import estancia.entidades.Familia;
import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class FamiliaServicio {
    
    public void mostrarFamilias( ArrayList<Familia> familias){
        
         for (Familia familia : familias) {
                System.out.println(familia.getNombre());
            }
    }
}
