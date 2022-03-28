/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
 */
package servicios;

import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AlquilerServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    BarcoServicio bs = new BarcoServicio();
    
    public Alquiler CrearAlquiler(){
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el DNI");
        String dni = leer.next();
              
        System.out.println("Ingrese dia , mes y anio de alquiler");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaAlquiler = new Date(anio-1900,mes-1, dia);
        System.out.println("Ingrese dia , mes y anio de devolucion");
        int dia1 = leer.nextInt();
        int mes1 = leer.nextInt();
        int anio1 = leer.nextInt();
        Date fechaDevolucion = new Date(anio1-1900,mes1-1, dia1);
        
        System.out.println("Ingrese la posicion del amarre");
        String posAmarre = leer.next();
        
        Barco barco = bs.crearBarco();
        
        return new Alquiler(nombre, dni, fechaAlquiler, fechaDevolucion, posAmarre, barco); 
    }
        
}
