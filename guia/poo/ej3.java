/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Operación;

/**
 *
 * @author Sergio
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operación op1 = new Operación();
        
        op1.Crear();
        System.out.println("El valor de la suma: "+op1.sumar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("El valor de la resta: "+op1.restar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("El valor de la multiplicación: "+op1.multiplicar(op1.getNumero1(), op1.getNumero2()));
        System.out.println("El valor de la división: "+op1.dividir(op1.getNumero1(), op1.getNumero2()));
    }
    
}
