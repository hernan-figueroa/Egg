/*
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package enidades;

import utilidades.calculosFormas;

/**
 *
 * @author Hernan
 */
public class Cuadrado implements calculosFormas {
    private Double base;
    private Double altura;

    public Cuadrado() {
    }

    public Cuadrado(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return (base + altura) * 2;
    }
    
    
}
