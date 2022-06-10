/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Libro;
import java.util.Scanner;


/**
 *
 * @author Sergio
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro li = new Libro();

        System.out.println("elija un libro e ingrese ISBN, titulo, autor y numero de paginas ");
        
        li.ISBN = leer.nextInt();
        li.titulo = leer.next();
        li.autor = leer.next();
        li.numPag = leer.nextInt();
        
        System.out.println(li);

    }

}
