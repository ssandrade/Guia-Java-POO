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
public class Circunferencia { 
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private float radio;
    
    
    //constructores
    public Circunferencia() {
    }
    public Circunferencia(float radio) {
        this.radio = radio;
    }
    
    
    //set y get
    public float getRadio() {
        return radio;
    } 
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
 
    //metodos
    public float CrearCircunferencia(){
       System.out.println("ingrese el radio de la circunferencia");
       radio = leer.nextFloat();
       return radio;
    }
     public double area(float radio){
       double a = 3.14 * (radio * radio);
       return a;  
     } 
   public double perimetro(float radio){
       double p = 2 * 3.14 * radio;
       return p;
   }
    
}
