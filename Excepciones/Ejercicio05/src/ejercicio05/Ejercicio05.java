/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05;

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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = (int) (Math.random() * 10 + 1);
        int contador = 0;
        boolean acerto = false;

        do {
            int numero = 0;
            System.out.println("++++++++++" + contador);
            try {
                System.out.println("Ingrese un numero");
                numero = leer.nextInt();

            } catch (Exception e) {
                System.out.println("Usted ingreso un caracter no numerico, intente nuevamente");
                leer.next();
            }
            
            contador++;
            System.out.println("-----" + contador);
            if (numero == num) {
                acerto = true;
                break;
            }

        } while (true);

        if (acerto) {
            System.out.println("Usted ha acertado, felicitaciones");
        }

        System.out.println("Numero de intentos: " + contador);
    }

}
