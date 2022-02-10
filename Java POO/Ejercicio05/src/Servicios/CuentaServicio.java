/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class CuentaServicio {

    private Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {

        System.out.println("Ingrese numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese numero de DNI");
        long DNI = leer.nextLong();
        System.out.println("Ingrese numero de DNI");
        double saldo = leer.nextDouble();
        System.out.println("Ingrese numero de DNI");
        double interes = leer.nextDouble();

        return new Cuenta(numeroCuenta, DNI, saldo, interes);
    }

    public void ingresar(Cuenta c, double ingreso) {

        c.setSaldo(c.getSaldo() + ingreso);
    }

    public void retirar(Cuenta c, double retiro) {
        if (c.getSaldo() - retiro < 0) {
            c.setSaldo(0);
        } else {
            c.setSaldo(c.getSaldo() - retiro);
        }
    }

    public void extraccionRapida(Cuenta c) {
        System.out.println("Ingrese el monto a retirar");
        double monto = leer.nextDouble();
        if(monto > c.getSaldo()*0.2){
            System.out.println("Ingrese una cifra inferior");
        }else{
            retirar(c, monto);
        }       
    }
    
    public void consultarSaldo(Cuenta c){
        
        System.out.println(c.getSaldo());
    }
    public void consultarDatos(Cuenta c){
        
        System.out.println(c.toString());
    }
    
}
