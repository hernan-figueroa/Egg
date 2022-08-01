/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Hernan
 */
@Controller
public class LoginControlador {
    
    @GetMapping("/login")
    public String login(){
        
        return "login.html";
    }
}
