/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
package entidades;

import entidades.Electrodomestico;
import utilidades.Color;
import utilidades.Consumo;

/**
 *
 * @author Hernan
 */
public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private Boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean sintonizador, Float precio, Color color, Consumo tipoConsumo, Float peso) {
        super(precio, color, tipoConsumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        
        return "Televisor{ " + super.toString() + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + '}';
    }
    
    
    
    
}
