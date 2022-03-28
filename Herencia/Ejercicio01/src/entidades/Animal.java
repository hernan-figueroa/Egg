/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package entidades;

import utilidades.Raza;

/**
 *
 * @author Hernan
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected Raza raza;

    public Animal(String nombre, String alimento, Integer edad, Raza raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
        
    public void mostrarAlimentacion(){
        System.out.println("Alimentacion: " + alimento);
    }
}
