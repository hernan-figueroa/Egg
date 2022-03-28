/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enidades;

import utilidades.calculosFormas;

/**
 *
 * @author Hernan
 */
public class Circulo implements calculosFormas {

    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return PI * (radio * 2);
    }

}
