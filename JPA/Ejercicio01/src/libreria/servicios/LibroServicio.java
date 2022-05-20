/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Hernan
 */
public class LibroServicio {

    LibroDAO lDAO = new LibroDAO();

    public void guardarLibro(Libro libro) {
        try {
            lDAO.guardar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void bajaLibro(Long isbn) {

        try {
            Libro libro = lDAO.getEm().find(Libro.class, isbn);
            libro.setAlta(false);
            lDAO.editar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void altaLibro(Long isbn) {

        try {
            Libro libro = lDAO.getEm().find(Libro.class, isbn);
            libro.setAlta(true);
            lDAO.editar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Libro buscarLibroISBN(Long isbn) {
        try {
            Libro libro = lDAO.buscarLibroIsbn(isbn);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarLibroTitulo(String titulo) {
        try {
            Libro libro = lDAO.buscarLibroTitulo(titulo);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarLibroNombreAutor(String nombre) {
        try {
            List<Libro> libros = lDAO.buscarLibroNombreAutor(nombre);
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Libro> buscarLibroNombreEditorial(String nombre) {
        try {
            List<Libro> libros = lDAO.buscarLibroNombreEditorial(nombre);
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
