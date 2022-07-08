/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.biblioteca.servicios;

import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.entidades.repositorios.AutorRepositorio;
import com.egg.biblioteca.entidades.repositorios.EditorialRepositorio;
import com.egg.biblioteca.entidades.repositorios.LibroRepositorio;
import com.egg.biblioteca.excepciones.MiException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hernan
 */
@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(Long isbn,String titulo,Integer ejemplares,String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, idAutor, idEditorial, ejemplares);
        
        Autor autor = autorRepositorio.findById(idAutor).get();
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        
        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
    }

    public List<Libro> listarLibros(){
        List<Libro> libros = new ArrayList();
        
        libros = libroRepositorio.findAll();
        return libros;
    }
    
    @Transactional
    public void modificarLibros(Long isbn,String titulo,String idAutor,String idEditorial,Integer ejemplares) throws MiException{
        
        validar(isbn, titulo, idAutor, idEditorial, ejemplares);
        
        Optional<Libro> respuestaLibro = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }
        
        if(respuestaLibro.isPresent()){
            Libro libro = respuestaLibro.get();
            libro.setIsbn(isbn);
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);
            
            libroRepositorio.save(libro);
        }
    }
    
    public void validar(Long isbn,String titulo,String idAutor,String idEditorial,Integer ejemplares) throws MiException{
        
        if(isbn==null){
            throw new MiException("El isbn no puede ser nulo");
        }
        if(titulo==null || titulo.isEmpty()){
            throw new MiException("El titulo no puede ser nulo o estar vacio");
        }
        if(ejemplares==null){
            throw new MiException("Ejemplares no puede ser nulo");
        }
        if(idAutor==null || idAutor.isEmpty()){
            throw new MiException("El idAutor no puede ser nulo");
        }
        if(idEditorial==null || idEditorial.isEmpty()){
            throw new MiException("El idEditorial no puede ser nulo");
        }
    }
}

