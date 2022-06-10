/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.fechas;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class eje11 {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        fechas f = new fechas();
        
        System.out.println("Ingrese dia, mes y año");
        f.setDia(leer.nextInt());
        f.setMes(leer.nextInt()-1);
        f.setAnio(leer.nextInt()-1900);
        
        f.Restante();
        
    }
    
}
