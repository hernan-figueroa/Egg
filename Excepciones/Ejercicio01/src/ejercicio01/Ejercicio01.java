/*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de
invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.
 */
package ejercicio01;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
       
//        int debajo = 0;
//        int encima = 0;
//        int ideal = 0;
//        int mayorEdad = 0;
        
        PersonaServicio ps = new PersonaServicio();
        Persona persona = null;
        //ps.mayorDeEdad(persona);
         try {
             ps.mayorDeEdad(persona);
         } catch (NullPointerException e) {
             System.out.println("La persona apunta a null");
         }
        
//        Persona[] personaVector = ps.crearArrayPersona(2);

//        for (int i = 0; i < 2; i++) {
//            personaVector[i] = ps.crearPersona();
//            
//            if (ps.mayorDeEdad(personaVector[i])) {
//                mayorEdad++;
//            }
//            
//            System.out.println("La persona es mayor de edad?" + ps.mayorDeEdad(personaVector[i]));
//            
//            switch (ps.calcularIMC(personaVector[i])) {
//                case -1:
//                    System.out.println("Por debajo del peso ideal");
//                    debajo++;
//                    break;
//                case 1:
//                    System.out.println("Por encima del peso ideal");
//                    encima++;
//                    break;
//                default:
//                    System.out.println("Peso ideal");
//                    ideal++;
//                    break;
//            }           
//        }
        
        //System.out.println("El porcentaje de personas por debajo del peso ideal: " + (debajo*100/2));
        //System.out.println("El porcentaje de personas por encima del peso ideal: " + (encima*100/2));
        //System.out.println("El porcentaje de personas con el peso ideal: " + (ideal*100/2));
        //System.out.println("Mayores de edad: " + ((float)mayorEdad*100/2));
       // System.out.println("Menores de edad: " + (((float)2-mayorEdad)*100/2));
        
    }
    
}
