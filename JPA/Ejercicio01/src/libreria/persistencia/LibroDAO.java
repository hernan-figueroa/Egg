/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author Hernan
 */
public final class LibroDAO extends DAO{
    
     public void guardar(Libro libro){
         conectar();
         em.getTransaction().begin();
         em.persist(libro);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void editar(Libro libro){
         conectar();
         em.getTransaction().begin();
         em.merge(libro);
         em.getTransaction().commit();
         desconectar();
     }
     
     public void eliminar(Libro libro){
         conectar();
         em.getTransaction().begin();
         em.remove(libro);
         em.getTransaction().commit();
         desconectar();
     }
     
     public Libro buscarLibroIsbn(Long isbn){
         Libro libro = 
                 (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn = :isbn").setParameter("isbn", isbn).getSingleResult();
         return libro;
     }
     
     public Libro buscarLibroTitulo(String titulo){
         Libro libro = 
                 (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
         return libro;
     }
     
     public List<Libro> buscarLibroNombreAutor(String nombre){
         List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre").setParameter("nombre", nombre).getResultList();
         return libros;
     }
     
     public List<Libro> buscarLibroNombreEditorial(String nombre){
         List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombre").setParameter("nombre", nombre).getResultList();
         return libros;
     }
}
