/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
 */
package ejercicio07;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author Hernan
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float sumaImc = 0;
        int debajo = 0;
        int encima = 0;
        int ideal = 0;
        int mayorEdad = 0;
        
        PersonaServicio ps = new PersonaServicio();
        Persona[] personaVector = ps.crearArrayPersona(2);

        for (int i = 0; i < 2; i++) {
            personaVector[i] = ps.crearPersona();
            
            if (ps.mayorDeEdad(personaVector[i])) {
                mayorEdad++;
            }
            
            System.out.println("La persona es mayor de edad?" + ps.mayorDeEdad(personaVector[i]));
            
            switch (ps.calcularIMC(personaVector[i])) {
                case -1:
                    System.out.println("Por debajo del peso ideal");
                    debajo++;
                    break;
                case 1:
                    System.out.println("Por encima del peso ideal");
                    encima++;
                    break;
                default:
                    System.out.println("Peso ideal");
                    ideal++;
                    break;
            }
            
            sumaImc += ps.calcularIMC(personaVector[i]);
        }
        
        System.out.println("El porcentaje de personas por debajo del peso ideal: " + (debajo*100/2));
        System.out.println("El porcentaje de personas por encima del peso ideal: " + (encima*100/2));
        System.out.println("El porcentaje de personas con el peso ideal: " + (ideal*100/2));
        System.out.println("Mayores de edad: " + ((float)mayorEdad*100/2));
        System.out.println("Menores de edad: " + (((float)2-mayorEdad)*100/2));
        
    }
    
}
