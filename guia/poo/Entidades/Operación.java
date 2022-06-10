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
public class Operación {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    // atributos
    private int numero1;
    private int numero2;
    
    
    //constructores
    public Operación() {
     }
    public Operación(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    //getter y setter
    public int getNumero1() {
        return numero1;
    }
    public int getNumero2() {
        return numero2;
    }
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    //atributos definidos
    public void Crear(){
        System.out.println("Ingrese 2 numeros enteros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
    }
    
    
    //operaciones
    public int sumar(int numero1, int numero2){
      int s = numero1 + numero2;
      return s;
    }
    public int restar(int numero1, int numero2){
        int r = numero1 - numero2;
        return r;
    }
    public int multiplicar(int numero1, int numero2){
        int m;
        if(numero1 > 0 && numero2 > 0 ){
            m = numero1 * numero2;
        }else{
            System.out.println("ERROR. Numero ingesado es igual o menor a 0");
            m = 0;
        }
        return m;
    } 
    public int dividir(int numero1, int numero2){
         int d;
        if(numero1 > 0 && numero2 > 0 ){
            d = numero2 % numero1;
        }else{
            System.out.println("ERROR. Numero ingesado es igual o menor a 0");
            d = 0;
        }
        return d;
    }
    
    
}
