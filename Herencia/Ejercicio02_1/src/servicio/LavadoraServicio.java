/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class LavadoraServicio {
    Scanner leer = new Scanner(System.in);
    ElectrodomesticoServicio es = new ElectrodomesticoServicio();
    public Lavadora crearLavadora(){
        Electrodomestico aux = es.crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        lavadora.setColor(aux.getColor());
        lavadora.setTipoConsumo(aux.getTipoConsumo());
        lavadora.setPeso(aux.getPeso());
        lavadora.setPrecio(aux.getPrecio());
        
        System.out.println("Ingrese la carga");
        Float carga = leer.nextFloat();
        lavadora.setCarga(carga);
        return lavadora;
    }
    
    public Float precioFinal(Lavadora lavadora){
        Float total = 0.f;
        
        total += es.precioFinal(lavadora);
        if(lavadora.getCarga()>30)
            total+=500;
        
        return total;
    }
}
