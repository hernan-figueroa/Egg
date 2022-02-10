/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class MatematicaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearMatematica() {
        return new Matematica(Math.random() * 10, Math.random() * 10);
    }

    public double devolverMayor(Matematica m) {

        return Math.max(m.getNum1(), m.getNum2());
    }

    public double devolverMenor(Matematica m) {

        return Math.min(m.getNum1(), m.getNum2());
    }

    public double calcularPotencia(Matematica m) {

        return Math.pow((int) devolverMayor(m), (int) devolverMenor(m));

    }
    
    public double calcularRaiz(Matematica m) {

        return Math.sqrt((int) Math.abs(devolverMenor(m)));

    }

}
