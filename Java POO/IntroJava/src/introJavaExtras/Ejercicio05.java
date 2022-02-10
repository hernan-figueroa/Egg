/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        char letra;
        float num;
        System.out.println("Ingrese una letra segun tipo de socio");
        letra = leer.next().charAt(0);
        System.out.println("Ingrese una el costo del tratamiento");
        num = leer.nextInt();
        
        switch (letra) {
            case 'A':
                    System.out.println("El costo para el socio A es de:" + num*0.5);
                break;
            case 'B':
                    System.out.println("El costo para el socio A es de:" + num*0.65);
                break;
            case 'C':
                    System.out.println("El costo para el socio A es de:" + num);
                break;
           
        }
    }
    
}
