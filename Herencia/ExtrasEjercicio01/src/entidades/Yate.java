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
public class Yate extends BarcoAMotor{
    
    private Integer numCamarote;

    public Yate(Integer numCamarote, Double cv, String matricula, Double eslora, Integer anioFabricacion) {
        super(cv, matricula, eslora, anioFabricacion);
        this.numCamarote = numCamarote;
    }

    public Integer getNumCamarote() {
        return numCamarote;
    }

    public void setNumCamarote(Integer numCamarote) {
        this.numCamarote = numCamarote;
    }

    @Override
    public String toString() {
        super.toString();
        return "Yate{" + "numCamarote=" + numCamarote + '}';
    }
    
}
