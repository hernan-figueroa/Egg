/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrasejercicio01;

import entidades.Alquiler;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Scanner;
import servicios.AlquilerServicio;
import servicios.BarcoServicio;

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
        AlquilerServicio as = new AlquilerServicio();
        BarcoServicio bs = new BarcoServicio();
        System.out.println("Que Barco quiere alquilar?");
        System.out.println("1 - velero");
        System.out.println("2 - Barco a motor");
        System.out.println("3 - Yate");
        Integer op = leer.nextInt();
 
        switch (op) {
            case 1:
                Velero velero = bs.crearVelero();
                 Alquiler a1 = as.CrearAlquiler(velero);
                 System.out.println("Usted esta Alquilando el barco : ");
                 System.out.println(velero.toString());
                 System.out.println("El costo del alquiler es de: " + as.costoAlquiler(a1));
                break;
            case 2:
                BarcoAMotor barcoAMotor = bs.crearBarcoAMotor();
                 Alquiler a2 = as.CrearAlquiler(barcoAMotor);
                 System.out.println("Usted esta Alquilando el barco : ");
                 System.out.println(barcoAMotor.toString());
                 System.out.println("El costo del alquiler es de: " + as.costoAlquiler(a2));
                break;
            case 3:
                Yate yate = bs.crearYate();
                Alquiler a3 = as.CrearAlquiler(yate);
                System.out.println("Usted esta Alquilando el barco : ");
                 System.out.println(yate.toString());
                 System.out.println("El costo del alquiler es de: " + as.costoAlquiler(a3));
                break;
        }
    }
}
