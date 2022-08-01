/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias.controladores;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.entidades.Usuario;
import com.egg.noticias.excepciones.MiException;
import com.egg.noticias.repositorios.NoticiaRepositorio;
import com.egg.noticias.servicios.NoticiaServicio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Hernan
 */
@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    public NoticiaServicio noticiaServicio;

    @GetMapping("/crear")
    public String crear() {
        return "noticia_crear.html";
    }

    @GetMapping("/eliminado/{id}")
    public String eliminado(@PathVariable String id, ModelMap modelo) {

        try {
            noticiaServicio.eliminar(id);
            //para que la lista la cargue de nuevo
            List<Noticia> noticias = noticiaServicio.noticias();
            modelo.addAttribute("noticias", noticias);
            ///
        } catch (MiException ex) {
            System.out.println("No se pudo eliminar");
        }
        return "noticia_lista.html";
    }

    @GetMapping("/lista")
    public String lista(ModelMap modelo) {

        List<Noticia> noticias = noticiaServicio.noticias();
        modelo.addAttribute("noticias", noticias);

        return "noticia_lista.html";
    }

    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.buscarId(id));
        return "noticia_modificar.html";
    }

    @GetMapping("/detalleNoticia/{id}")
    public String detalleNoticia(@PathVariable String id, ModelMap modelo) {
        modelo.addAttribute("noticia", noticiaServicio.buscarId(id));
        return "noticia_detalle.html";
    }

    @PostMapping("/creado")
    public String creado(@RequestParam String titulo,
            @RequestParam String cuerpo,
            @RequestParam String foto, ModelMap modelo, HttpSession session) {
        try {
            Usuario logueado = (Usuario) session.getAttribute("usuarioSesion");
            noticiaServicio.crearNoticia(titulo, cuerpo, foto, logueado);
            modelo.put("exito", "La noticia fue cargada correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "noticia_crear.html";
    }
}
