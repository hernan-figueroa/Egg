/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        
        switch(letra.toUpperCase()){
            case "A":
                    System.out.println("Se ha ingresado una vocal");
                break;
            case "E":
                    System.out.println("Se ha ingresado una vocal");
                break;
            case "I":
                    System.out.println("Se ha ingresado una vocal");
                break;
            case "O":
                    System.out.println("Se ha ingresado una vocal");
                break;
            case "U":
                    System.out.println("Se ha ingresado una vocal");
                break;
            default:
                System.out.println("La letra ingresada no es una vocal");
  
        }
             
    }
    
}
