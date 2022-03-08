/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;
import service.JuegoService;
import service.RevolverDeAguaService;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        JuegoService js = new JuegoService();
        
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        RevolverDeAguaService rs = new RevolverDeAguaService();
        rs.llenarRevolver(revolver);
        
        System.out.println("Ingrese numero de jugadores ");
        int cantJugadores  = leer.nextInt();
        
        if(cantJugadores<1 || cantJugadores>6)
            cantJugadores = 6;
        
        for (int i = 0; i < cantJugadores; i++) {
            jugadores.add(new Jugador(i+1));
        }

        Juego juego = new Juego();
        
        js.llenarJuego(jugadores, revolver, juego);
        js.ronda(juego);
    }
    
}
