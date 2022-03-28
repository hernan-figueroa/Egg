/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
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
        
        Animal perro = new Perro("Stich", "Carnivoro", 15, Raza.DOBERMAN);
        perro.mostrarAlimentacion();
        
        Animal gato = new Gato("Pelusa", "Galletas", 10, Raza.SIAMES);
        gato.mostrarAlimentacion();
        
        Animal caballo = new Caballo("Spark", "Pasto", 20, Raza.FINO);
        caballo.mostrarAlimentacion();
    }
    
}
