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
public class cafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //atributos
    private int capacidadMaxima;
    private int cantidadActual;
    
    
    //constructores
    public cafetera() {
    }
    public cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    
    
    //setter y getter
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    
    
    //metodos
    public void llenarCafetera(){
        System.out.println("ingrese la capacidad maxima de la cafetera en ml");
        setCapacidadMaxima(leer.nextInt());
        setCantidadActual(getCapacidadMaxima());

    }
    public void servirTaza(){
        System.out.println("ingrese el tamaño de la taza en ml");
        int tamaño = leer.nextInt();
        if (getCantidadActual() < tamaño){
            int cuenta = tamaño - getCantidadActual();
            System.out.println("La taza no logró llenarse. Solo se llenaron "+cuenta+"ml"); 
        }else{
            System.out.println("La taza logró llenarse");
        }
    }
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    public void agregarCafé(){
        System.out.println("ingrese la cantidad a agregar en la cafetera ");
        setCantidadActual(leer.nextInt());
    }
    
}
