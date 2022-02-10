/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        // TODO code application logic here
        String nombre, seguir;
        int edad;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un nombre y una edad");
            nombre = leer.nextLine();
            edad = leer.nextInt();
            
            mostrar(nombre, edad);
            
            System.out.println("Quiere seguir cargando?");
            leer.nextLine();
            seguir = leer.nextLine();

        } while (!seguir.equalsIgnoreCase("no"));

    }

    public static void mostrar(String nombre, int edad) {
        String mayorDeEdad="NO";
        if(edad>=18) mayorDeEdad="SI";
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | Mayor de edad: " + mayorDeEdad );
    }
}
