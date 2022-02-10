/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int multiplicacion,num;
        
        multiplicacion = (int) ((Math.random()*10) * (Math.random()*10));
        System.out.println(multiplicacion);
        do {      
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if(num==multiplicacion){
                System.out.println("Adivinaste el numero");
                break;
            }else System.out.println("Respuesta incorrecta, intente nuevamente");
            
        } while (true);
    }
    
}
