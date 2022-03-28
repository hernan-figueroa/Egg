/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
 */
package entidades;

/**
 *
 * @author Hernan
 */
public class Barco {
    
    protected String matricula;
    protected Double eslora;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
}
