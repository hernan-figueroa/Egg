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

    public boolean hayLibros(Libro l) {
        Libro libro = buscarLibroISBN(l.getIsbn());
        if (libro.getEjemplaresRestantes() > 0) {
            return true;
        }
        return false;
    }

    public void editarDisponibilidadLibro(Libro libro) {
        try {
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
            lDAO.editar(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolverEjemplar(Long isbn) {
        try {
            Libro libro = lDAO.getEm().find(Libro.class, isbn);
            if (libro != null) {
                //10 libro , restantes 10 y prestados 0. No puedo devolver un libro mas
                if (libro.getEjemplares() > libro.getEjemplaresRestantes()) {

                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                    libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1); 
                    lDAO.editar(libro); 
                    System.out.println("El libro se reingreso al deposito");
                } else {
                    System.out.println("Libro no prestado");
                }
            }else{
                System.out.println("El libro buscado no existe, intente nuevamente muchas gracias");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
