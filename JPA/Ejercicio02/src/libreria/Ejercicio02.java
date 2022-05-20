/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Cliente;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.ClienteDAO;
import libreria.persistencia.PrestamoDAO;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;
import libreria.servicios.PrestamoServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Cliente cliente = new Cliente(1, 123456L, "Lucho", "Milei", "0303456");
        //ClienteDAO cdao = new ClienteDAO();

        //cdao.guardar(c1);
//        EditorialServicio es = new EditorialServicio();
//        AutorServicio as = new AutorServicio();
//        LibroServicio ls = new LibroServicio();
        PrestamoServicio ps = new PrestamoServicio();
//
//        Editorial editorial = new Editorial(1, "Editorial", true);
//        Autor autor = new Autor(1, "Filomena", true);
//        Libro libro1 = new Libro(123456790L, "El señor de los anilos 2", 2000, 10, 5, 5, autor, editorial);
//        Libro libro2 = new Libro(55556790L, "El señor de los anillos 3", 2000, 10, 2, 8, autor, editorial);
//        List<Libro> libros = new ArrayList<>();
//        libros.add(libro1);
//        libros.add(libro2);
//
//        PERSISTENCIA DE OBJETOS    
//        es.guardarEditorial(editorial);
//        as.guardarAutor(autor);
        //ls.guardarLibro(libro);

//      Creacion de un Prestamo
        //Date fechaPrestamo = new Date(2022-1900, 2, 10);
        //Date fechaDevolucion = new Date(2022-1900, 2, 15);
       // Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libros, cliente);
//
//
        //ps.guardarPrestamo(prestamo);
        
        //ls.devolverEjemplar(5555679L);
        
//      Búsqueda de todos los prestamos de un Cliente.

    
        ps.mostrarPrestamosCliente(1);

    }
}
