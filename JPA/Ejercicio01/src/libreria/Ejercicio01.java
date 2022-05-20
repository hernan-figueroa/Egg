/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import javax.persistence.*;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        LibroServicio ls = new LibroServicio();

        Editorial editorial = new Editorial(1,"Editorial",true);
        Autor autor = new Autor(1,"Filomena",true);
        Libro libro = new Libro(123456790L, "El señor de los anilos 2", 2000, 10, 5, 5, autor, editorial);

        try {
            //Baja logica
                //es.bajaEditorial(1);

            //Alta logica
                //es.altaEditorial(1);
                //es.altaEditorial(2);
            //PERSISTENCIA DE OBJETOS    
                //es.guardarEditorial(editorial);
                //as.guardarAutor(autor);
                //ls.guardarLibro(libro);
            //Búsqueda de un Autor por nombre.
                //System.out.println(as.buscarAutor("Filomena").toString());
            //Búsqueda de un libro por ISBN.
                //System.out.println(ls.buscarLibroISBN(123456789L).toString());
            
            //Búsqueda de un libro/s por nombre de Autor.
                //for (Libro aux : ls.buscarLibroNombreAutor("Filomena")) {
                //System.out.println(aux.toString());
                //}
            //Búsqueda de un libro/s por nombre de Editorial.    
               for (Libro aux : ls.buscarLibroNombreEditorial("Editorial1")) {
                    System.out.println(aux.toString());
                } 
            
        } catch (Exception e) {
            throw e;
        }

    }

}
