/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class OperacionServicio {

    private Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese dos numeros");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        return new Operacion(num1, num2);

    }

    public double sumar(Operacion o) {

        return o.getNum1() + o.getNum2();
    }

    public double restar(Operacion o) {

        return o.getNum1() - o.getNum2();
    }

    public double multiplicar(Operacion o) {

        if ( o.getNum2() == 0) {
            System.out.println("Error - multiplicacion por cero");
            return 0;
        } else {
            return o.getNum1() * o.getNum2();
        }
    }
    public double dividir(Operacion o) {

        if (o.getNum2() == 0) {
            System.out.println("Error - dividicion por cero");
            return 0;
        } else {
            return o.getNum1() / o.getNum2();
        }
    }

}
