/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.cafetera;

/**
 *
 * @author Sergio
 */
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cafetera c = new cafetera();
        
        c.llenarCafetera();
        c.servirTaza();
        c.vaciarCafetera();
        c.agregarCafé();
        
    }
    
}
