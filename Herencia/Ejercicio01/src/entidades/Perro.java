/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import utilidades.Raza;

/**
 *
 * @author Hernan
 */
public class Perro extends Animal{
    
    public Perro(String nombre, String alimento, Integer edad, Raza raza) {
        super(nombre, alimento, edad, raza);
    }
    
}
