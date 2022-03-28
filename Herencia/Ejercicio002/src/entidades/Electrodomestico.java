/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
 */
package entidades;

import utilidades.Color;
import utilidades.Consumo;

/**
 *
 * @author Hernan
 */
public class Electrodomestico {

    protected Float precio;
    protected Color color; // enum
    protected Consumo tipoConsumo; //enum
    protected Float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Float precio, Color color, Consumo tipoConsumo, Float peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.tipoConsumo = comprobarConsumoEnergetico(tipoConsumo);
        this.peso = peso;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Consumo getTipoConsumo() {
        return tipoConsumo;
    }

    public void setTipoConsumo(Consumo tipoConsumo) {
        this.tipoConsumo = tipoConsumo;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    private Consumo comprobarConsumoEnergetico(Consumo tipoConsumo) {
        for (Consumo aux : Consumo.values()) {
            if (aux.equals(tipoConsumo)) {
                return aux;
            }
        }
        return Consumo.F;
    }
    
    private Color comprobarColor(Color color) {
        for (Color aux : Color.values()) {
            if (aux.equals(color)) {
                return aux;
            }
        }
        return Color.BLANCO;
    }
}
