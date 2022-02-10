/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package ejercicio01extra;

import entidades.Cancion;
import servicios.CancionServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CancionServicio cs = new CancionServicio();
        Cancion c = cs.crearCancion();

    }
    
}
