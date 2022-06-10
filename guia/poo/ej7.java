/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import guia.poo.Entidades.Persona;



/**
 *
 * @author Sergio
 */
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean mayor=true;
        int cont1=0,cont2=0, cont3=0,cont4=0,cont5=0, peso=0;
        servicio.servicioPersona p1 = new servicio.servicioPersona();
        servicio.servicioPersona p2 = new servicio.servicioPersona();
        servicio.servicioPersona p3 = new servicio.servicioPersona();
        servicio.servicioPersona p4 = new servicio.servicioPersona();
        
        p1.crerPersona();
        p1.calcularIMC();
        p1.mayorDeEdad();
        p2.crerPersona();
        p2.calcularIMC();
        p2.mayorDeEdad();
        p3.crerPersona();
        p3.calcularIMC();
        p3.mayorDeEdad();
        p4.crerPersona();
        p4.calcularIMC();
        p4.mayorDeEdad();
        
       servicio.servicioPersona per[] = {p1,p2,p3,p4};
        for (int i = 0; i < 4; i++) {
            peso = per[i].calcularIMC();
            mayor = per[i].mayorDeEdad();
            if (mayor){
                cont1++;
            }else {
                cont2++;
            }
            switch(peso){
                case -1:
                    cont3++;
                    break;
                case 0:
                    cont4++;
                    break;
                case 1:
                    cont5++;
                    break;          
            }
        }
        
        float porcentaje1 = ((float)cont1 / 4) * 100;
        float porcentaje2 = ((float)cont2 / 4) * 100;
        
        float porcentaje3 = ((float)cont3 / 4) * 100;
        float porcentaje4 = ((float)cont4 / 4) * 100;
        float porcentaje5 = ((float)cont5 / 4) * 100;
       
        System.out.println("El porcentaje de personas mayor es "+porcentaje1);
        System.out.println("El porcentaje de personas menor es "+porcentaje2);
        System.out.println("El porcentaje de personas sobre el peso ideal "+porcentaje5);
        System.out.println("El porcentaje de personas con el peso ideal "+porcentaje4);
        System.out.println("El porcentaje de personas por debajo del peso ideal "+porcentaje3);
    }
    
}
