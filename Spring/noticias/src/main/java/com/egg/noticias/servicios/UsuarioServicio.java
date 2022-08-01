/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias.servicios;

import com.egg.noticias.entidades.Usuario;
import com.egg.noticias.enums.Rol;
import com.egg.noticias.excepciones.MiException;
import com.egg.noticias.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 *
 * @author Hernan
 */
@Service
public class UsuarioServicio implements UserDetailsService{
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        
        if(usuario != null){
            
            List<GrantedAuthority> permisos = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession sesion = attr.getRequest().getSession(true);
            
            sesion.setAttribute("usuarioSesion",usuario);
            
            return new User(usuario.getEmail(),usuario.getPassword(),permisos);  
        }
        return null;
    }
    @Transactional
    public void registrarUsuario(String usuario, String pass,String pass2,String email) throws MiException{
        
        validar(usuario, pass, pass2, email);
        Usuario us = new Usuario();
        
        us.setUsuario(usuario);
        us.setPassword(new BCryptPasswordEncoder().encode(pass));
        us.setEmail(email);
        us.setAlta(new Date());
        us.setRol(Rol.USER);
        
        usuarioRepositorio.save(us);
    }
    
    public void validar(String usuario, String pass, String pass2, String email) throws MiException {

        if (usuario == null || usuario.isEmpty()) {
            throw new MiException("El usuario no puede estar vacio");
        }
        if (pass == null || pass.isEmpty() || pass.length()<5) {
            throw new MiException("El password no puede estar vacio y contener minimo 5 digitos");
        }
        if (!pass2.equals(pass)) {
            throw new MiException("Las contraseñas deben ser iguales");
        }
        //validacion de mail
        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new MiException("Ingrese un mail valido");
        }
    }
    
}
