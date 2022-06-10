/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Cadena;
import java.util.Scanner;
import servicio.ServicioCadena;

/**
 *
 * @author Sergio
 */
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cadena c = new Cadena();
        ServicioCadena sc = new ServicioCadena();
        
        System.out.println("ingrese una frase");
        c.setFrase(leer.next().toLowerCase());
        c.setLongitud(c.getFrase().length());
        
        //mostrarMetodos
       sc.mostrarVocales(c);
       sc.invertirFrase(c);
       sc.vecesRepetido(c);
       sc.compararLongitud(c);
       sc.unirFrases(c);
       sc.reemplazar(c);
       sc.contiene(c);
       
    }
    
}
