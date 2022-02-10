/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
    String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
    una frase que puede ser una palabra o varias palabras separadas por un espacio en
    blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearCadena() {
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        return new Cadena(frase, frase.length());
    }

    public void mostrarVocales(Cadena c) {
        int contador = 0;
        String frase = c.getFrase();
        for (int i = 0; i < c.getLongitudFrase(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales que tiene la frase es: " + contador);
    }

    public void invertirVocales(Cadena c) {
        String frase = "";
        for (int i = c.getLongitudFrase()-1; i >= 0; i--) {

            frase += c.getFrase().charAt(i);

        }
        System.out.println("La frase invertida seria " + frase);
    }

    public void vecesRepetido(Cadena c) {
        int contador = 0;
        String frase = c.getFrase();
        System.out.println("Ingrese una letra para saber cuantas veces se repite");
        String letra = leer.next();
        for (int i = 0; i < c.getLongitudFrase(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(frase.charAt(i)))) {
                contador++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + contador + " veces.");
    }

    public void compararLongitud(Cadena c) {

        System.out.println("Ingrese una frase para comparar longitud");

        String frase = leer.next();

        if (c.getLongitudFrase() == frase.length()) {
            System.out.println("Las frases tienen la misma longitud");
        } else {
            System.out.println("Las frases tienen distinta longitud");
        }

    }

    public void unirFrase(Cadena c) {

        System.out.println("Ingrese una frase para unir");

        String frase = leer.next();

        System.out.println(c.getFrase() + " " + frase);

    }

    public void reemplazar(Cadena c) {
        System.out.println("Ingrese una letra para reemplazar por la a");
        String letra = leer.next();

        String frase =  c.getFrase().replace('a',letra.charAt(0));
        
        System.out.println(frase);
    }
    
    public void contiene(Cadena c){
        boolean contiene = false;
        System.out.println("Ingrese una letra saber si la frase la contiene");
        String letra = leer.next();
        
        String frase = c.getFrase();
        for (int i = 0; i < c.getLongitudFrase(); i++) {
            if (frase.charAt(i) == letra.charAt(0)){
                contiene = true;
            }
        }
        System.out.println(contiene);    
    }
    
}
