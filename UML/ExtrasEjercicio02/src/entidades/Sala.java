/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Hernan
 */
public class Sala {
    private Asiento asientos[][];

    public Sala() {
    }

    public Sala(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + asientos + '}';
    }  
    
}
