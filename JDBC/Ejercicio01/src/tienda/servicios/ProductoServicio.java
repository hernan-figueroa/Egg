/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Producto;

/**
 *
 * @author Hernan
 */
public class ProductoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Producto crearProducto(){
        System.out.println("Ingrese un codigo");
        int codigo = leer.nextInt();
        
        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
        
        System.out.println("Ingrese el precio");
        double precio = leer.nextDouble();
        
        System.out.println("Ingrese el codigo del fabricante");
        int codigo_fabricante = leer.nextInt();
        
        return new Producto(codigo, nombre, precio, codigo_fabricante);      
    }
    
}
