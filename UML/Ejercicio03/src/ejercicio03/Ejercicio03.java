/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import entidades.Baraja;
import entidades.Carta;
import service.BarajaService;

/**
 *
 * @author Hernan
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaService bj = new BarajaService();
        Baraja b = new Baraja();
        
        bj.llenarBaraja(b);
        bj.mostrarBaraja(b);
        
        System.out.println("------------- aleatorio --------------");
        bj.barajar(b);
        bj.mostrarBaraja(b);
        
        System.out.println("------------- siguiente carta --------------");
        for (int i = 0; i < 41; i++) {
            Carta carta = bj.siguienteCarta(b);
            if(carta == null)
                System.out.println("No hay mas cartas");
            else
            System.out.println(carta.toString());
        }
        
        
        System.out.println("------------- mazo actual --------------");
        bj.mostrarBaraja(b);
        
        System.out.println(bj.cartasDisponibles(b));
        System.out.println(bj.darCartas(b, 1).toString());
        
        System.out.println("------------- cartas que salieron --------------");
        bj.cartasMonton(b);
    }
    
}
