/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrasejercicio01;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Raza;

/**
 *
 * @author Hernan
 */
public class ExtrasEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        boolean disponible = true;

        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();

        Perro fredy = new Perro("fredy", Raza.MESTIZO, 2, 40.F);
        perros.add(fredy);
        Perro caty = new Perro("caty", Raza.PEQUINES, 17, 50.F);
        perros.add(caty);

        Persona hernan = new Persona("Hernan", "Figueroa", 31, 123456);
        personas.add(hernan);
        Persona walter = new Persona("Walter", "Figueroa", 57, 35451);
        personas.add(walter);

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + " que perro quieres adoptar?");
            String name = leer.next();
            Iterator<Perro> it = perros.iterator();
            while (it.hasNext()) {
                Perro perro = it.next();
                if (perro.getNombre().equalsIgnoreCase(name)) {
                    System.out.println("Felicidades a adoptado a " + name);
                    persona.setPerro(perro);
                    it.remove();
                }
            }
            if (persona.getPerro() == null) {
                System.out.println("Lo siento " + name + " ya ha sido adoptado");
            }
        }

        System.out.println(hernan.toString());
        System.out.println(walter.toString());

    }

}
