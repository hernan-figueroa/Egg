/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Barco;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class BarcoServicio {

    Scanner leer = new Scanner(System.in);

    public Barco crearBarco() {

        System.out.println("Ingrese la matricula");
        String matricula = leer.next();

        System.out.println("Ingrese el tamanio de la eslora");
        Double eslora = leer.nextDouble();
        System.out.println("Ingrese el anio de fabricacion");
        Integer anio = leer.nextInt();

        return  new Barco(matricula, eslora, anio);
        
    }

    public Velero crearVelero() {
        Barco b = crearBarco();

        System.out.println("Ingrese numero de mastiles");
        Integer mastiles = leer.nextInt();
        return new Velero(mastiles, b.getMatricula(), b.getEslora(), b.getAnioFabricacion());       
    }
    public BarcoAMotor crearBarcoAMotor() {
        Barco b = crearBarco();
        
        System.out.println("Ingrese una potencia");
                Double cv = leer.nextDouble();
        return new BarcoAMotor(cv, b.getMatricula(), b.getEslora(), b.getAnioFabricacion());       
    }
    
    public Yate crearYate() {
        Barco b = crearBarco();
        
        System.out.println("Ingrese numero de camarotes");
                Integer numCamarotes = leer.nextInt();
                System.out.println("Ingrese una potencia");
                Double cv = leer.nextDouble();
        return new Yate(numCamarotes,cv, b.getMatricula(), b.getEslora(), b.getAnioFabricacion());       
    }
}
