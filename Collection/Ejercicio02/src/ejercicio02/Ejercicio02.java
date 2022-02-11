/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
se mostrará la lista ordenada.
 */
package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perros = new ArrayList<>();
        
        
        do {            
            
            System.out.println("Ingrese una raza de perro");
            perros.add(leer.next());
            System.out.println("Desea agregar otro perro ingrese si o no si desea salir");
            if(leer.next().equals("no"))
                break; 
        } while (true);
        
        for(String perro : perros) {
            System.out.println(perro);
        }
        
        System.out.println("Ingrese un perro para eliminar");
        String perro = leer.next();
        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if(it.next().equals(perro))
                it.remove();
        }
        
        for(String aux : perros) {
            System.out.println(aux);
        }
    }
    
}
