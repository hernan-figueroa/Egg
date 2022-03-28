/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
 */
package servicio;

import entidades.Electrodomestico;
import java.util.Scanner;
import utilidades.Color;
import utilidades.Consumo;

/**
 *
 * @author Hernan
 */
public class ElectrodomesticoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Electrodomestico crearElectrodomestico(){
        Float precio = 1000.f; //precio base para todos los electrodomesticos
        System.out.println("Ingrese color");
        String color = leer.next(); // AZUL
        
        System.out.println("Ingrese la letra de consumo energetico");
        String consumo = leer.next();
        
        System.out.println("Ingrese el peso");
        Float peso = leer.nextFloat();
        
        return new Electrodomestico(precio, Color.valueOf(color), Consumo.valueOf(consumo), peso);   
    }
    
    public Float precioFinalAux(Electrodomestico e){
        float precioPeso = 0;
        float precioConsumo = 0;
        if(e.getPeso()>=1 && e.getPeso()<=19)
            precioPeso = 100;
        else if(e.getPeso()>=20 && e.getPeso()<=49)
            precioPeso = 500;
        else if(e.getPeso()>=50 && e.getPeso()<=79)
            precioPeso = 800;
        else if(e.getPeso()>=80)
            precioPeso = 1000;
        
        for (Consumo value : Consumo.values()) {
            if(value.equals(e.getTipoConsumo()))
                precioConsumo = value.getCosto();
        }        
       return precioPeso + e.getPrecio() + precioConsumo;
    }
}
