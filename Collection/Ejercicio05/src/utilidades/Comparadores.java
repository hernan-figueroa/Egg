/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pais;
import java.util.Comparator;

/**
 *
 * @author Hernan
 */
public class Comparadores {
     public static Comparator<Pais> ordenar = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1,Pais p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
}
