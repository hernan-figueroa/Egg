/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.PrestamoDAO;

/**
 *
 * @author Hernan
 */
public class PrestamoServicio {

    PrestamoDAO pDAO = new PrestamoDAO();
    LibroServicio ls = new LibroServicio();

    public void guardarPrestamo(Prestamo prestamo) {

        try {
            List<Libro> libros = new ArrayList<>();

            for (Libro libro : prestamo.getLibro()) {
                if (ls.hayLibros(libro)) {
                    if (fechaCorrecta(prestamo)) {
                        libros.add(libro);
                        ls.editarDisponibilidadLibro(libro);
                        System.out.println("el libro " + libro.getTitulo());
                    }
                } else {
                    System.out.println("el libro " + libro.getTitulo() + " no tiene disponible");
                }
            }
            prestamo.setLibro(libros);

            if (!prestamo.getLibro().isEmpty()) {
                pDAO.guardar(prestamo);
            } else {
                System.out.println("El prestamo se rechazo por falta de disponibilidad");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean fechaCorrecta(Prestamo prestamo){      
        return prestamo.getFechaPrestamo().compareTo(new Date()) == 0;
    }

    public void mostrarPrestamosCliente(Integer id) {

        List<Prestamo> prestamos = pDAO.buscarPrestamoId(id);

        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.toString());
        }

    }
}
