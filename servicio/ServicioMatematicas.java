/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import guia.poo.Entidades.Matematicas;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class ServicioMatematicas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Matematicas m = new Matematicas();
    
    public void devolverMayor(Matematicas m){
        System.out.println("El numero mayor es: "+Double.max(m.getNum1(),m.getNum2()));
    }
    
    public void calcularPotencia(Matematicas m){
      int r1 = (int) Math.round(m.getNum1());
      int r2 = (int)Math.round(m.getNum2());
      if(r1>r2){
          System.out.println("El resuktado de la potencia es: "+Math.pow(r1,r2));
      }else{
          System.out.println("El resultado de la potencia es: "+Math.pow(r2,r1));
      }
      
    }
    
    public void calculaRaiz(Matematicas m ){
        double min = Double.min(m.getNum1(),m.getNum2());
        System.out.println("Raiz cuadrada del numero "+min);
        System.out.println(""+Math.round(Math.sqrt(min)));
    }
}
