/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author Hernan
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("sentencia 1");
        System.out.println("sentencia 2");

        try {
            System.out.println("sentencia 3");
            System.out.println("sentencia 4" + (10/0) );

        } catch (Exception e) {
        System.err.println(e.getStackTrace());
        }finally{
        System.out.println("sentencia 5");
            
        }
            
    }

}
