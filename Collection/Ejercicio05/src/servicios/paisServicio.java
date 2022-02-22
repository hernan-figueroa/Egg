/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Hernan
 */
public class paisServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pais> paises = new HashSet<>();
    
    public void guardarPais(){
        System.out.println("Ingrese un pais");
        paises.add(new Pais(leer.next()));
    }
    
    public void removerPais(){
        System.out.println("Ingrese un pais");
        String aux = leer.next();
        boolean seEncontro = false;
        
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if(it.next().getNombre().equals(aux)){
                it.remove();
                mostrarPaises();
                seEncontro = true;
            }
        }
        if(seEncontro==false){
            System.out.println("El pais ingresado no se encuentra en la lista");
        }
        
    }
    
    public void mostrarPaises(){
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }
    
    public void ordenarPaises(){
        ArrayList<Pais> aux = new ArrayList<>(paises);
        aux.sort(Comparadores.ordenar);
        System.out.println("----------------ordenados-------------");
        for (Pais pais : aux) {
            System.out.println(pais);
        }
    }
    
}
