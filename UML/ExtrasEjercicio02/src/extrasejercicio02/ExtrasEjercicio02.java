package extrasejercicio02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entidades.*;
import services.CineService;
import utilidades.Columnas;


/**
 *
 * @author Hernan
 */
public class ExtrasEjercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asiento asientos[][] = new Asiento[8][6];
        
        asientos[0][0] = new Asiento(10);
        System.out.println(asientos[0][0].toString());
 
  // System.out.println(asientos[0][0].getFila());


        
        /*
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(asientos[i][j].toString());
            }
        }*/
 /*
        ArrayList<Espectador> espectadores = new ArrayList<>();
        espectadores.add(new Espectador("Juan", 10, 350.f));
        espectadores.add(new Espectador("Hernan", 31, 15000.f));
        espectadores.add(new Espectador("Gabriel", 31, 4000.f));
        espectadores.add(new Espectador("Walter", 58, 1000.f));
        espectadores.add(new Espectador("Matias", 33, 250.f));
        Sala sala = new Sala();
        Pelicula pelicula = new Pelicula("End Game", 180, 16, "Anthony Russo, Joe Russo");
        
        for (Espectador espectador : espectadores) {
            if(espectador.getEdad()>=pelicula.getEdadMinima()){
                
            }
        }
                        
         */

    }

}
