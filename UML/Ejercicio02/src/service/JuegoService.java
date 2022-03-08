/*
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package service;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class JuegoService {

    JugadorService js = new JugadorService();

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r, Juego j) {

        j.setJugadores(jugadores);
        j.setRevolver(r);
    }

    public void ronda(Juego j) {
        Boolean mojado = false;
        do {
            for (Jugador jugador : j.getJugadores()) {
                js.disparo(j.getRevolver(), jugador);
                if (jugador.getMojado()) {
                    mojado = true;
                    System.out.println(jugador.getNombre() + " se ha mojado.");
                    break;
                } else {
                    System.out.println(jugador.getNombre() + " no se ha mojado.");
                }
            }
        } while (!mojado);
    }
}
