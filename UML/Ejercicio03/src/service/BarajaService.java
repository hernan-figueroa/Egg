/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.
 */
package service;

import entidades.Baraja;
import entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import utilidades.Palo;
import utilidades.Valor;

/**
 *
 * @author Hernan
 */
public class BarajaService {

    ArrayList<Carta> cartasQueSalieron = new ArrayList<>();

    public void llenarBaraja(Baraja b) {
        ArrayList<Carta> cartas = new ArrayList<>();

        for (Valor v : Valor.values()) {
            for (Palo p : Palo.values()) {
                cartas.add(new Carta(v, p));
            }
        }
        b.setCartas(cartas);
    }

    public void barajar(Baraja b) {
        Collections.shuffle(b.getCartas());
    }

    public void mostrarBaraja(Baraja b) {
        for (Carta carta : b.getCartas()) {
            System.out.println(carta.toString());
        }

    }

    public Carta siguienteCarta(Baraja b) {
        Carta carta;
        if (b.getCartas().isEmpty()) {
            carta = null;
        } else {

            carta = b.getCartas().get(0);
            b.getCartas().remove(0);
            cartasQueSalieron.add(carta);
        }
        return carta;
    }

    public int cartasDisponibles(Baraja b) {
        return b.getCartas().size();
    }

    public ArrayList<Carta> darCartas(Baraja b, int cant) {
        ArrayList<Carta> cartas = new ArrayList<>();
        if (b.getCartas().size() < cant) {
            System.out.println("no tiene cartas suficientes");
        } else {
            for (int i = 0; i < cant; i++) {
                cartas.add(i, b.getCartas().get(i));
                cartasQueSalieron.add(b.getCartas().get(i));
                b.getCartas().remove(0);
            }
        }
        return cartas;
    }

    public void cartasMonton(Baraja b) {
        if (cartasQueSalieron.isEmpty()) {
            System.out.println("Todavia no se pidio ninguna carta");
        } else {
            for (Carta carta : cartasQueSalieron) {
                System.out.println(carta.toString());
            }
        }
    }
}
