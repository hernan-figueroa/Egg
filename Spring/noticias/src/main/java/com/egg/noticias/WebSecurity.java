/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.noticias;

import com.egg.noticias.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Hernan
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurity extends WebSecurityConfigurerAdapter {

    @Autowired
    public UsuarioServicio usuarioServicio;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(usuarioServicio).
                passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/inicio").hasAnyRole("ADMIN", "PERIODISTA", "USER")
                .antMatchers("/noticia/detalleNoticia/**").hasAnyRole("ADMIN", "PERIODISTA", "USER")
                .antMatchers("/noticia/crear").hasAnyRole("ADMIN", "PERIODISTA")
                .antMatchers("/noticia/modificar").hasAnyRole("ADMIN", "PERIODISTA")
                .antMatchers("/noticia/eliminado/**").hasRole("ADMIN")
                .antMatchers("/noticia/lista").hasAnyRole("ADMIN", "PERIODISTA", "USER")
                .and()
                .formLogin().loginPage("/login").defaultSuccessUrl("/inicio")
                .and()
                .logout()
                .logoutSuccessUrl("/login")
                .and().csrf().disable();

        //http.authorizeRequests().antMatchers("/**").permitAll().and().csrf().disable();
    }

    //Con este http se puede acceder sin logearse
    //http.authorizeRequests().antMatchers("/**").permitAll().and().csrf().disable();
//     @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        
//        http
//                .authorizeRequests()
//                .antMatchers("/Admin").hasRole("ROLE_ADMIN")
//                .antMatchers("/Admin").hasAnyRole()
//                .and()
//                .formLogin();
//        
//    }
}
