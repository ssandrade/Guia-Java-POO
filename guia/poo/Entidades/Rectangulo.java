/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo.Entidades;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //atributos
    private int base;
    private int altura;
    
    
    //constructores
    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    //setter y getter
    public int getAltura() {
        return altura;
    }
    public int getBase() {
        return base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void setBase(int base) {
        this.base = base;
    }
    
    
    //declaracion de atributos
    public void crear(){
        System.out.println("Ingrese altura y base del rectangulo");
        altura = leer.nextInt();
        base = leer.nextInt();
    }
    
    
    //metodos
    public int superficie(int altura, int base ){
        int s = base * altura;
        return s;
    }
    public int perimetro(int base, int altura){
        int p = (base+altura)*2;
        return p;
    }
    public void dibujo(int base, int altura){
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < altura-2; i++) {
            System.out.print("*");
            for (int j = 0; j < base-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("*");
        } 
        System.out.println("");
    }    
}
