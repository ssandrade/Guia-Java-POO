/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import guia.poo.Entidades.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class servicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p = new Persona();
      
      
    public void crerPersona(){
        System.out.println("ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("¿cual es su sexo(H=hombre, M=mujer, O=otro)?");
        p.setSexo(leer.next().toUpperCase());
        while(!p.getSexo().equals("H") && !p.getSexo().equals("M") && !p.getSexo().equals("O")){
            System.out.println("Intente nuevamente");
            p.setSexo(leer.next());
        }
        switch (p.getSexo()) {
            case "H":
                p.setSexo("Hombre");
                break;
            case "M":
                p.setSexo("Mujer");
                break;
            default:
                p.setSexo("Otro");
                break;
        }
        System.out.println("ingrese altura");
        p.setAltura(leer.nextDouble());
        System.out.println("ingrese su peso");
        p.setPeso(leer.nextDouble());
    }
    public int calcularIMC(){
        double r = p.getPeso() / Math.pow(p.getAltura(), 2);
        int re;
        if(r < 20){
            System.out.println("Usted está por debajo del peso ideal");
            re = -1;
        }else if(r > 25){
            System.out.println("Usted está sobre el peso ideal");
            re = 1;
        }else{
            System.out.println("Usted está en el peso ideal");
            re = 0;
        }
        return re;   
    }
    public boolean mayorDeEdad(){
       boolean m = true;
        if (p.getEdad() >= 18){
            System.out.println("Usted es mayor de edad");
            m = true;
        }else{
            System.out.println("Usted es menor de edad");
            m = false;
        }
        return m;
    }
   
    
    
    
    //Metodos ejercicio 12
     public void CrearPersona(){
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         System.out.println("ingrese el nombre");
         p.setNombre(leer.next());
         System.out.println("Ingrese fecha de nacimiento");
         int dia = leer.nextInt();
         int mes = leer.nextInt()-1;
         int anio = leer.nextInt()-1900;
         Date FechaIngresada = new Date(anio,mes,dia);
         p.setNacimiento(FechaIngresada);
         System.out.println("fecha Ingresada: "+sdf.format(FechaIngresada));
     }
    
     public int calcularEdad(){
         Date fecha = new Date();
         Date edad = new Date((fecha.getTime()-p.getNacimiento().getTime()));
         int EdadPersona = edad.getYear()-70 ;
         return EdadPersona;
     }
     public boolean menorQue(int edad){
         boolean comprobar ; 
         if(calcularEdad()<edad){
             comprobar= true;
             System.out.println("El usuario es menor qué la edad ingresada");
         }else{
             comprobar= false;
             System.out.println("El usuario es mayor a la edad ingresada");
         }
         return comprobar;
         
     }

    public void mostrarPersona(){
        
        System.out.println("Nombre de la persona: "+p.getNombre());
        System.out.println("Fecha de nacimiento: "+p.getNacimiento());
        System.out.println("Edad: "+calcularEdad());
    }
    
    
    
    
    
    
    
    
    
    
}
