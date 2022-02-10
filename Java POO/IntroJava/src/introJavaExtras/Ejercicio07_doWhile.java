/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio07_doWhile {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        int n,num,max,min,suma,aux;

        
        System.out.println("Ingrese cantidad de numeros");
        n = leer.nextInt();
        aux = n;
        suma = 0;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        max=min=num;
        do {            
            suma+= num;
            n--;
            
            if(num>max)max=num;
            if(num<min)min=num;     
            if(n == 0)break;
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
        } while (n>0);
       
        System.out.println("El maximo es " + max + " , el minimo es " + min + " y el promedio " + (float)(suma/aux));
    }

}
