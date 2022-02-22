/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.Scanner;
import servicios.PeliculaServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio ps = new PeliculaServicio();
        do {            
            ps.crearPelicula();
            System.out.println("Quire incluir una nueva pelicula?");
            if(leer.next().equalsIgnoreCase("no"))
                break;
        } while (true);
        
        ps.mostrarPeliculas();
        ps.mostrarPeliculasDuracion(1);
        ps.ordenarXDuracionAsc();
        ps.ordenarXDuracionDesc();
        ps.ordenarXTitulo();
        ps.ordenarXDirector();
    }
    
}
