/*
disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package service;

import entidades.Jugador;
import entidades.RevolverDeAgua;

/**
 *
 * @author Hernan
 */
public class JugadorService {

    RevolverDeAguaService rs = new RevolverDeAguaService();
    
    public void disparo(RevolverDeAgua r, Jugador j) {
        
        if (rs.mojar(r)) {
           j.setMojado(true);
        }
        rs.siguienteChorro(r);
    }
}
