/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias.controladores;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.excepciones.MiException;
import com.egg.noticias.servicios.NoticiaServicio;
import com.egg.noticias.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Hernan
 */
@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
   
    
    @GetMapping("/registrar")
    public String registrar(){
        
        return "registrar.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String usuario ,
                            @RequestParam String email ,
                            @RequestParam String password,
                            @RequestParam String password2,
                            ModelMap modelo){
        try {
            usuarioServicio.registrarUsuario(usuario, password, password2, email);
            modelo.put("exito", "El usuario fue cargado con exito");
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
        }
        return "registrar.html";
    }
    
    @GetMapping("/inicio")
    public String inicio(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.noticias();
        modelo.addAttribute("noticias", noticias);
        return "inicio.html";
    }
    
     @GetMapping("/index")
    public String index(){
        return "index.html";
    }
    
}
