/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.

 */
package entidades;

/**
 *
 * @author Hernan
 */
public class RevolverDeAgua {
    
    private Integer posTambor;
    private Integer posAgua;

    public RevolverDeAgua() {
    }

    public Integer getPosTambor() {
        return posTambor;
    }

    public void setPosTambor(Integer posTambor) {
        this.posTambor = posTambor;
    }

    public Integer getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(Integer posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posTambor=" + posTambor + ", posAgua=" + posAgua + '}';
    }
    
}
