/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Hernan
 */
public enum Consumo {
    A(1000),B(800),C(600),D(500),E(300),F(100);
    private int costo;
    
    Consumo(int c){
         costo=c;
    }
    public int getCosto(){
        return costo;
    }
}
