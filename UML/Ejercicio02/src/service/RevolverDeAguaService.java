/*
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package service;

import entidades.RevolverDeAgua;

/**
 *
 * @author Hernan
 */
public class RevolverDeAguaService {
    
    public int valorAleatorio(){
        return (int) (Math.random()*10+1);
    }
    public void llenarRevolver(RevolverDeAgua revolver){
        revolver.setPosAgua(valorAleatorio());
        revolver.setPosTambor(valorAleatorio());
    }
    
    public boolean mojar(RevolverDeAgua revolver){

        return revolver.getPosAgua()== revolver.getPosTambor();
    }
    
    public void siguienteChorro(RevolverDeAgua revolver){
        
        if(revolver.getPosTambor()==10)
            revolver.setPosTambor(0);
        else
            revolver.setPosTambor(revolver.getPosTambor()+1);
    }
}
