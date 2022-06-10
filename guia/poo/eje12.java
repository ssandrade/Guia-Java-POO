/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Persona;
import java.util.Scanner;
import servicio.servicioPersona;

/**
 *
 * @author Sergio
 */
public class eje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P = new Persona();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioPersona sc = new servicioPersona();
        
        
        
        sc.CrearPersona();
        sc.calcularEdad();
        System.out.println("Ingrese la edad que quiere comparar");
        int edad = leer.nextInt();
        sc.menorQue(edad);
        sc.mostrarPersona();
    }
    
}
