/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import entidades.Perro;
import entidades.Persona;
import utilidades.Raza;

/**
 *
 * @author Hernan
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro fredy = new Perro("fredy", Raza.MESTIZO, 2, 40.F);
        Perro caty = new Perro("caty", Raza.PEQUINES, 17, 50.F);
        
        Persona hernan = new Persona("Hernan", "Figueroa", 31, 123456, fredy);
        Persona walter = new Persona("Walter", "Figueroa", 57, 35451, caty);
        
        
        System.out.println(hernan.toString());
        System.out.println(walter.toString());
        
        
    }
    
}
