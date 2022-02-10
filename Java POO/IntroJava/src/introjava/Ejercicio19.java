/*
Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        // TODO code application logic here
        float euros;
        String cambio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un monto en euros y una moneda para convertir");
        euros = leer.nextFloat();
        cambio = leer.next();
        conversion(euros, cambio);
    }
    
    public static void conversion(float euros,String moneda){
        switch (moneda) {
            case "libra":
                System.out.println(euros + " euros es equivalente a " + euros*0.86 + " libras");
                break;
            case "dolar":
                System.out.println(euros + " euros es equivalente a " + euros*1.28611 + " dolares");
                break;
            case "yen":
                System.out.println(euros + " euros es equivalente a " + euros*129.852 + " yenes");
                break;
            default:
                break;
        }
    }
}
