/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        System.out.println("Ingrese una palabra");
        String p = leer.next();
        String[] palabra = new String[p.length()];

        System.out.println("Ingrese la cantidad maxima de intentos");
        int intentos = leer.nextInt();

        for (int i = 0; i < 4; i++) {
            palabra[i] = String.valueOf(p.charAt(i));
        }

        return new Ahorcado(palabra, 0, intentos);
    }

    public int longitud(Ahorcado ahoracado) {

        return ahoracado.getPalabra().length;
    }

    public boolean buscar(Ahorcado ahorcado) {
        System.out.println("Ingrese una letra");
        String letra = leer.next();

        for (int i = 0; i < longitud(ahorcado); i++) {
            if (ahorcado.getPalabra()[i].equals(letra)) {
                System.out.println("La letra pertenece a la palabra");
                return true;
            } 
        }
        System.out.println("La letra no se encuentra");
        return false;
    }

    public boolean encontradas(Ahorcado ahorcado) {
        if (buscar(ahorcado)) {
            ahorcado.setEncontradas(ahorcado.getEncontradas() + 1);
            System.out.println("Encontradas: " + ahorcado.getEncontradas());
            System.out.println("Faltan encontrar: " + (longitud(ahorcado) - ahorcado.getEncontradas()));
            return true;
        }
        System.out.println("Encontradas" + ahorcado.getEncontradas());
        System.out.println("Faltan encontrar: " + (longitud(ahorcado) - ahorcado.getEncontradas()));

        return false;
    }

    public int intentos(int cantIntentos, int intentosMax) {
        return intentosMax - cantIntentos;
    }

    public void juego() {
        Ahorcado ahorcado = crearJuego();
        boolean resultado = false;
        int intentos = 0;

        do {

            System.out.println("Tiene disponibles: " + (intentos(intentos, ahorcado.getIntentosMax())) + " intentos");
            if (!encontradas(ahorcado)) {
                intentos++;
            }
            if (ahorcado.getEncontradas() == longitud(ahorcado)) {
                resultado = true;
                break;
            }
        } while (intentos < ahorcado.getIntentosMax());

        if (resultado) {
            System.out.println("Felicidades a acertado la palabra");
        } else {
            System.out.println("Se le acabaron los intentos");
        }
    }
}
