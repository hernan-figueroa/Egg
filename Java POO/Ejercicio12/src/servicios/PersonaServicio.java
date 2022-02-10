/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        String nombre;
        int anio;
        int mes;
        int dia;

        System.out.println("Ingrese un nombre");
        nombre = leer.next();

        System.out.println("Ingrese dia mes y anio en ese orden");
        dia = leer.nextInt();
        mes = leer.nextInt();
        anio = leer.nextInt();

        Date date = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, date);

    }

    public int calcularEdad(Persona p) {
        Date date = new Date();

        if (date.getMonth() < p.getFechaNacimiento().getMonth()) {
            return (date.getYear() - p.getFechaNacimiento().getYear()) - 1;

        } else if (date.getMonth() == p.getFechaNacimiento().getMonth()) {
            if ( p.getFechaNacimiento().getDate()> date.getDate()) {
                return (date.getYear() - p.getFechaNacimiento().getYear()) - 1;
            }
        }
        return date.getYear() - p.getFechaNacimiento().getYear();
    }

    public boolean menorQue(int edad, int otraEdad) {

        return otraEdad < edad;
    }

    public void mostrarPersona(Persona p) {
        System.out.println(p.toString());
    }
}
