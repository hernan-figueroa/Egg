/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> perros = new ArrayList<>();
        
        do {            
            
            System.out.println("Ingrese una raza de perro");
            perros.add(leer.next());
            System.out.println("Desea agregar otro perro ingrese si o no si desea salir");
            if(leer.next().equals("no"))
                break;
            
        } while (true);
        
        for (String perro : perros) {
            System.out.println(perro);
        }
    }
    
}
