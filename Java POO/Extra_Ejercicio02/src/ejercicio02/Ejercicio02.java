/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import ejercicio02.entidades.Punto;
import ejercicio02.entidades.PuntosControl;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PuntosControl pc = new PuntosControl();
        Punto punto = pc.crearPuntos();
        
        System.out.println(pc.calcularDistancia(punto));
    }
    
}
