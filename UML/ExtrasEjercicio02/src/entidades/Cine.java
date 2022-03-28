/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de
asientos (8 filas por 6 columnas). De Cine nos interesa conocer la película que se está
reproduciendo, la sala con los espectadores y el precio de la entrada. Luego, de las
películas nos interesa saber el título, duración, edad mínima y director. Por último, del
espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos
son etiquetados por una letra y un número la fila A1 empieza al final del mapa como se
muestra en la tabla. También deberemos saber si el asiento está ocupado por un
espectador o no, si esta ocupado se muestra una X, sino un espacio vacío.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Cine {
    private Sala sala;
    private ArrayList<Espectador> espectadores;
    private Pelicula pelicula;
    private Float precioEntrada;

    public Cine() {
    }

    public Cine(Sala sala, ArrayList<Espectador> espectadores, Pelicula pelicula, Float precioEntrada) {
        this.sala = sala;
        this.espectadores = espectadores;
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Float getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Float precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", espectadores=" + espectadores + ", pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
}
