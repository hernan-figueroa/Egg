/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Hernan
 */
public class PeliculaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    public void crearPelicula(){
        System.out.println("Ingrese titulo");
        String titulo = leer.next();
        System.out.println("Ingrese director");
        String director = leer.next();
        System.out.println("Ingrese duracion");
        int duracion = leer.nextInt();
        
        peliculas.add(new Pelicula(titulo, director, duracion));
    }
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarPeliculasDuracion(float dMin){
        for (Pelicula pelicula : peliculas) {
            if(pelicula.getDuracion()>dMin)
            System.out.println(pelicula.toString());
        }
    }
    
    public void ordenarXDuracionAsc(){
        peliculas.sort(Comparadores.ordenarPorDuracionAsc);
        System.out.println("---------ordenarXDuracionAsc---------------");
        mostrarPeliculas();
    }
    
    public void ordenarXDuracionDesc(){
        peliculas.sort(Comparadores.ordenarPorDuracionDesc);
        System.out.println("---------ordenarXDuracionDesc---------------");
        mostrarPeliculas();
    }
    public void ordenarXTitulo(){
        peliculas.sort(Comparadores.ordenarPorTitulo);
        System.out.println("---------ordenarXTitulo---------------");
        mostrarPeliculas();
    }
    public void ordenarXDirector(){
        peliculas.sort(Comparadores.ordenarPorDirector);
        System.out.println("---------ordenarXDirector---------------");
        mostrarPeliculas();
    }
     
}
