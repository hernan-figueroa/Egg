/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class TelevisorServicio {
    Scanner leer = new Scanner(System.in);
    ElectrodomesticoServicio es = new ElectrodomesticoServicio();
    
    
    public Televisor crearTelevisor(){
        Electrodomestico obj = es.crearElectrodomestico();
        Televisor televisor = new Televisor();
        televisor.setColor(obj.getColor());
        televisor.setTipoConsumo(obj.getTipoConsumo());
        televisor.setPeso(obj.getPeso());
        televisor.setPrecio(obj.getPrecio());
          
        System.out.println("Ingrese tamaño de televisor");
        Integer resolucion = leer.nextInt();
        
        Boolean sintonizador;
        System.out.println("Tiene sintonizador?");
        String aux = leer.next();
        sintonizador = aux.equals("si");
      
        televisor.setResolucion(resolucion);
        televisor.setSintonizador(sintonizador);
        
        return televisor; 
    }
    
    public Float precioFinal(Televisor televisor){
        Float total = 0.f;
        
        total += es.precioFinal(televisor);
        if(televisor.getResolucion()>40)
            total*=1.3f;
        if(televisor.getSintonizador())
            total+=500;
        
        return total;
    }
            
}
