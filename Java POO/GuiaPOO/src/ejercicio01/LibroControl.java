/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class LibroControl {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro cargarLibro(){
        
        System.out.println("Ingrese ISBN");
        String ISBN = leer.next();
        System.out.println("Ingrese titulo");
        String titulo = leer.next();
        System.out.println("Ingrese autor");
        String autor = leer.next();
        System.out.println("Ingrese numero de paginas");
        int numPagina = leer.nextInt();
        
        return new Libro(ISBN, titulo, autor, numPagina);
    }
    
    public void mostrarLibro(Libro libro){
        
        System.out.println(libro.toString());
        
    }
}
