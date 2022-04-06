/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import utilidades.Color;
import utilidades.Consumo;

/**
 *
 * @author Hernan
 */
public class Lavadora extends Electrodomestico{
    private Float carga;

    public Lavadora() {
    }
    
    public Lavadora(Float carga, Float precio, Color color, Consumo tipoConsumo, Float peso) {
        super(precio, color, tipoConsumo, peso);
        this.carga = carga;
    }

    public Float getCarga() {
        return carga;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        
        return "Lavadora{" + super.toString() + "carga=" + carga + '}';
    }
    
    
    
}
