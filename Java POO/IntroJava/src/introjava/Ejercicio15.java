/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2,opc;
        String siNo;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {    
             System.out.println("MENU");
             System.out.println("1. Sumar");
             System.out.println("2. Restar");
             System.out.println("3. Multiplicar");
             System.out.println("4. Dividir");
             System.out.println("5. Salir");
             System.out.println("Elija una opcion");
             opc = leer.nextInt();
             switch(opc){
                 case 1: 
                     System.out.println(num1+num2);
                     break;
                 case 2: 
                     System.out.println(num1-num2);
                     break;
                 case 3: 
                     System.out.println(num1*num2);
                     break;
                 case 4: 
                     System.out.println(num1/num2);
                     break;
                 case 5: 
                     System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                     leer.nextLine();
                     siNo = leer.nextLine();
                     if(siNo.equals("S")){
                         break;
                     }else{
                         opc=0;
                     }                  
             }
            
        } while (opc!=5);
        
    }
    
}
