/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import utilidades.Columnas;

/**
 *
 * @author Hernan
 */
public class Asiento {

    private int fila;

    public Asiento() {
    }

    public Asiento(int fila) {
        this.fila = fila;
    }
    

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + '}';
    }
   

  

}
