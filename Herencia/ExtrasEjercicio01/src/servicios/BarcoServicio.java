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
    public Barco crearBarco(){
        
        System.out.println("1 - velero");
        System.out.println("2 - Barco a motor");
        System.out.println("3 - Yate");
        Integer op = leer.nextInt();
        
        System.out.println("Ingrese la matricula");
        String matricula = leer.next();
        
        System.out.println("Ingrese el tamanio de la eslora");
        Double eslora = leer.nextDouble();
        
        Barco barco = new Barco();
        
        switch (op) {
            case 1:
                System.out.println("Ingrese numero de mastiles");
                Integer mastiles = leer.nextInt();
                Velero velero = new Velero(mastiles, dni, eslora, anio1);
                barco = velero;
                break;
            case 2:
                System.out.println("Ingrese una potencia");
                Double cv = leer.nextDouble();
                BarcoAMotor barcoAMotor = new BarcoAMotor(cv, dni, eslora, anio1);
                barco = barcoAMotor;
                break;
            case 3:
                System.out.println("Ingrese numero de camarotes");
                Integer numCamarotes = leer.nextInt();
                System.out.println("Ingrese una potencia");
                Double cv1 = leer.nextDouble();
                
                Yate yate = new Yate(numCamarotes, cv1, dni, eslora, anio1);
                barco = yate;
                break;
        }
        
        
    }
}
