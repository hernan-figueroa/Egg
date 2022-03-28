/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import entidades.Lavadora;
import entidades.Televisor;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;

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
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();
        
        Lavadora lavadora = ls.crearLavadora();
        Televisor televisor = ts.crearTelevisor();
        
        System.out.println("Lavadora precio: " + ls.precioFinal(lavadora));
        System.out.println("Televisor precio: " + ts.precioFinal(televisor));
    }
    
}
