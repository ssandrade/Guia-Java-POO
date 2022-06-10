/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circunferencia c1 = new Circunferencia();

        c1.CrearCircunferencia();

        System.out.println("El area es " + c1.area(c1.getRadio()));
        System.out.println("El perimetro es " + c1.perimetro(c1.getRadio()));

    }

}
