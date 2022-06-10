/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.CuentaBancaria;

/**
 *
 * @author Sergio
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria c = new CuentaBancaria();
        
        c.cuenta();
        c.ingresar();
        c.retirar();
        c.extraccionRapida();
        c.consSaldo();
        System.out.println("Se van a mostrar todos los datos"+c.toString());
        
    }
    
}
