/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;

/**
 *
 * @author Hernan
 */
public class FabricanteServicio {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Fabricante crearFabricante(){
        System.out.println("Ingrese un codigo");
        int codigo = leer.nextInt();
        
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
                
        return new Fabricante(codigo, nombre);
    }
}
