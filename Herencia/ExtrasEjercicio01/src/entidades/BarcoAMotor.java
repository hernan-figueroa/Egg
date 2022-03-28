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
public class BarcoAMotor extends Barco{
    private Double cv;

    public BarcoAMotor(Double cv, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.cv = cv;
    }

    public Double getCv() {
        return cv;
    }

    public void setCv(Double cv) {
        this.cv = cv;
    }
    
    
}
