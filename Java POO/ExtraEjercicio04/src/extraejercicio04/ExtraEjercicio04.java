/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraejercicio04;

import entidades.NIF;
import servicios.NIFServicio;

/**
 *
 * @author Hernan
 */
public class ExtraEjercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        NIFServicio ns = new NIFServicio();
        NIF n = ns.crearNIF();
        ns.mostrar(n);
     } 
    
}
