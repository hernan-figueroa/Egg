package guiapoo;

import ejercicio01.Libro;
import ejercicio01.LibroControl;

/**
 *
 * @author Hernan
 */
public class GuiaPOO {

    public static void main(String[] args) {
        //Ejercicio01
        LibroControl clibro = new LibroControl();
        
        Libro libro = clibro.cargarLibro();
        
        clibro.mostrarLibro(libro);
        
        //Ejercicio02
    }
    
}
