/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main
 */
package introJavaExtras;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio15 {

    public static void main(String[] args) {
        // TODO code application logic here

        int num1, num2, opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            
            System.out.println("Menu");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4..Dividir");
            System.out.println("5.Salir");
            System.out.println("Ingrese una opcion");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("--------------------------------");
                    System.out.println("RESULTADO DE LA SUMA: " + sumar(num1, num2));
                    System.out.println("--------------------------------");
                    break;
                case 2:
                    System.out.println("--------------------------------");
                    System.out.println("RESULTADO DE LA RESTA: " + restar(num1, num2));
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("--------------------------------");
                    System.out.println("RESULTADO DE LA MULTIPLICACION: " + multiplicar(num1, num2));
                    System.out.println("--------------------------------");
                    break;
                case 4:
                    if(num2==0){
                        System.out.println("no se puede dividir por cero");
                    }else{   
                    System.out.println("--------------------------------");
                    System.out.println("RESULTADO DE LA DIVISION: " + dividir(num1, num2));
                    System.out.println("--------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("--------------------------------");
                    System.out.println("Vuelva pronto");
                    System.out.println("--------------------------------");
                    break;

            }

        } while (opc != 5);

    }
    
    public static int sumar(int num1,int num2){
        
        return num1+num2;
    }
    public static int restar(int num1,int num2){
        
        return num1-num2;
    }
    
    public static int multiplicar(int num1,int num2){
        
        return num1*num2;
    }
    public static float dividir(int num1,int num2){
        
        return num1/num2;
    }

}
