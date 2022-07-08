/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias.servicios;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.excepciones.MiException;
import com.egg.noticias.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
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
public class NoticiaServicio {

    @Autowired
    public NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, String foto) throws MiException {

        validar(titulo, cuerpo, foto);

        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFoto(foto);

        noticiaRepositorio.save(noticia);
    }
    
    public List<Noticia> noticias(){
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        
        return noticias; 
    }
    
    public Noticia buscarId(String id){
      
        return noticiaRepositorio.findById(id).get();
    }

    @Transactional
    public void modificar(String id, String titulo, String cuerpo, String foto) throws MiException {
        validar(titulo, cuerpo, foto);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setCuerpo(cuerpo);
            noticia.setFoto(foto);
            noticia.setTitulo(titulo);

            noticiaRepositorio.save(noticia);
        }
    }

    @Transactional
    public void eliminar(String id) throws MiException {
        validar(id);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticiaRepositorio.delete(noticia);
        }else{
            throw new MiException("El id no existe");
        }
    }

    public void validar(String titulo, String cuerpo, String foto) throws MiException {

        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El titulo no puede ser nulo");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("El cuerpo no puede ser nulo");
        }
        if (foto == null || foto.isEmpty()) {
            throw new MiException("La foto no puede ser nulo");
        }
    }

    public void validar(String id) throws MiException {

        if (id == null) {
            throw new MiException("El id no puede ser nulo");
        }
    }

    public void validar(String id, String titulo, String cuerpo, String foto) throws MiException {

        if (id == null) {
            throw new MiException("El id no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El titulo no puede ser nulo");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("El cuerpo no puede ser nulo");
        }
        if (foto == null || foto.isEmpty()) {
            throw new MiException("La foto no puede ser nulo");
        }
    }
}
