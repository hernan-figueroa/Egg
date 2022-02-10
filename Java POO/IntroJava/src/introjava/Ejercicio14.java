/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,suma;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        for (int i = 0; i < 20;i++) {
            System.out.println("Ingese un numero");
            num = leer.nextInt();
            if(num>0){
                suma += num;
            }else if (num==0) {
                System.out.println("Se capturo el numero cero");
                break;
            }
        }
        
        System.out.println("La suma de los numero es " + suma);
    }
    
}
