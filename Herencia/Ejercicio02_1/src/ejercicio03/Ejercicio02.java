/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package ejercicio03;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;
import utilidades.Color;
import utilidades.Consumo;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Float totalLavadoras = 0.f;
        Float totalTelevisores = 0.f;
        
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        Lavadora lavadora1 = new Lavadora(500.f,1500.f, Color.ROJO, Consumo.C, 35.f);
        Lavadora lavadora2 = new Lavadora(10.f,1000.f, Color.NEGRO, Consumo.A, 10.f);
        Lavadora lavadora3 = new Lavadora(500.f,1000.f, Color.BLANCO, Consumo.F, 80.f);
        Televisor televisor = new Televisor(30, true, 500.f, Color.GRIS, Consumo.D, 85.F);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);
        electrodomesticos.add(lavadora3);
        electrodomesticos.add(televisor);
        
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora){
                
                System.out.println("Precio de lavadora: " + ls.precioFinal((Lavadora) electrodomestico));
                totalLavadoras +=ls.precioFinal((Lavadora) electrodomestico);
                System.out.println(electrodomestico.toString());
            }
            if(electrodomestico instanceof Televisor){
                System.out.println("Precio de Televisor: " + ts.precioFinal((Televisor) electrodomestico));
                totalTelevisores +=ts.precioFinal((Televisor) electrodomestico);
                System.out.println(electrodomestico.toString());
            }
        }
        
        System.out.println("Total precio de lavadores: " + totalLavadoras);
        System.out.println("Total precio de televisores: " + totalTelevisores);
    }
    
}
