/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo.Entidades;

import java.util.Date;

/**
 *
 * @author Sergio
 */
public class fechas {
    
    private int dia;
    private int mes;
    private int anio;

    public fechas() {
    }

    public fechas(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

   public Date fa(){
       Date fechaActual = new Date();
       System.out.println("Fecha Actual: "+fechaActual);
       
       return fechaActual;
    }
   public Date fi(){
        Date fechaIngresada = new Date(getAnio(), getMes(), getDia());
        fechaIngresada.getDay();
        fechaIngresada.getMonth();
        fechaIngresada.getYear();
       System.out.println("fecha ingresada: "+fechaIngresada);
       return fechaIngresada;
   }
   public void Restante(){
      Date edad = new Date((fa().getTime()-fi().getTime()));
      
       System.out.println("La edad es : "+(edad.getYear()-70));
       
   }
    
}
