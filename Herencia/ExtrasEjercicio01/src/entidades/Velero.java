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
public class Velero extends Barco{
    private Integer velas;

    public Velero(Integer velas, String matricula, Double eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.velas = velas;
    }

    public Integer getVelas() {
        return velas;
    }

    public void setVelas(Integer velas) {
        this.velas = velas;
    }

    @Override
    public String toString() {
        super.toString();
        return "Velero{" + "velas=" + velas + '}';
    }     
    
}
