/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String. 
 */
package introJavaExtras;

/**
 *
 * @author Hernan
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        // TODO code application logic here

        int dig1, dig2, dig3 = 0;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                for (int k = 0; k < 10; k++) {
                    if(String.valueOf(j).equals("3")){
                       System.out.print("E" + "-"); 
                    }else
                        System.out.print(j + "-");
                    if (String.valueOf(i).equals("3")) {
                        System.out.print("E" + "-");
                    } else {
                        System.out.print(i + "-");
                    }
                    if (String.valueOf(k).equals("3")) {
                        System.out.println("E");
                    } else {
                        System.out.println(k);
                    }
                    
                }
            }
        }
    }
}
