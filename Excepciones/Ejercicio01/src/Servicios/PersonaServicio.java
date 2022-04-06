/*
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        String nombre;
        int edad;
        String sexo;
        float peso;
        float altura;
        
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese el edad");
        edad = leer.nextInt();
        while (true) {
            System.out.println("Ingrese el sexo");
            sexo = leer.next();
            if (!sexo.equalsIgnoreCase("h") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("o")) {
                System.out.println("ingrese un tipo correcto ( 'H' , 'M' u 'O')");
            }else break;
        }
        System.out.println("Ingrese el peso");
        peso = leer.nextFloat();
        System.out.println("Ingrese el altura");
        altura = leer.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public Persona[] crearArrayPersona(int cantidad){
        return new Persona[cantidad];
    }
    
    public short calcularIMC(Persona p){
        if(p.getPeso()/Math.pow(p.getAltura(), 2)<20){
            return -1;
            
        }else if(p.getPeso()/Math.pow(p.getAltura(), 2)>25){
            return 1;
        }else{
            return 0;
        }
    }
    
    public boolean mayorDeEdad(Persona p){
        return p.getEdad()>=18;
        
    }
}
