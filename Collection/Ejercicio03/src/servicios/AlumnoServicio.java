/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Alumno crearAlumno(){
        ArrayList<Integer> notas = new ArrayList<>();
        String nombre;
        
        System.out.println("Ingrese nombre del alumno");
        nombre = leer.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota numero "+(i+1));
            notas.add(leer.nextInt());
        }
        return new Alumno(nombre, notas);     
    }
    
    public float notaFinal(Alumno a){
        float sumatoria=0;
        for (Integer nota : a.getNotas()) {
            sumatoria+=nota;
        }
        return sumatoria/a.getNotas().size();
    }
}
