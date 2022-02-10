/*
Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese un numero");
        N = leer.nextInt();
        int[] vec = new int[N];
        
        for (int i = 0; i < N; i++) {
            vec[i] = fibo(N);
        }
        System.out.println(fibo(N));
        
    }
    
    public static int fibo(int N){
           
        if(N>2){
            
            return fibo(N-1) + fibo(N-2);
        }else{
            return 1;  
        }
    }
}
