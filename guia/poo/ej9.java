/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Matematicas;
import java.util.Scanner;
import servicio.ServicioMatematicas;

/**
 *
 * @author Sergio
 */
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Matematicas m = new Matematicas();
        ServicioMatematicas sm = new ServicioMatematicas();
        
       m.setNum1(Math.random() * 10);
       m.setNum2(Math.random() * 10);
       
       sm.devolverMayor(m);
       sm.calcularPotencia(m);
       sm.calculaRaiz(m);
    }
    
}
