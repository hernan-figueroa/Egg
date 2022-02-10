/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package servicios;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class CancionServicio {

    Scanner leer = new Scanner(System.in);

    public Cancion crearCancion() {
        String titulo;
        String autor;
        System.out.println("Ingrese un titulo");
        titulo = leer.next();
        System.out.println("Ingrese un autor");
        autor = leer.next();
        
        return new Cancion(titulo, autor);
    }
}
