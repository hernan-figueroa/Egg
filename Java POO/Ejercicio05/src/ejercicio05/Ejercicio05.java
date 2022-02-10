/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

import Entidades.Cuenta;
import Servicios.CuentaServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaServicio cs = new CuentaServicio();
        Cuenta c = cs.crearCuenta();
        cs.ingresar(c, 1000);
        cs.retirar(c, 2000);
        cs.extraccionRapida(c);
        cs.consultarSaldo(c);
        cs.consultarDatos(c);
        
    }
    
}
