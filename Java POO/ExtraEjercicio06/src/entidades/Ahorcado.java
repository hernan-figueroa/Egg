/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
 */
package entidades;

/**
 *
 * @author Hernan
 */
public class Ahorcado {
    private String[] palabra;
    private int encontradas;
    private int intentosMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int encontradas, int intentosMax) {
        this.palabra = palabra;
        this.encontradas = encontradas;
        this.intentosMax = intentosMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    
}