/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo;

import java.util.Arrays;


/**
 *
 * @author Sergio
 */
public class eje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double A[];
        A = new double [50];
        double B[];
        B = new double [20];
        System.out.println("Numeros del arreglo A: ");
        for (int i = 0; i < A.length ; i++) {
          A[i] = Math.random()*10;
          if(i==9){
              System.out.println("");
          }else if(i==19){
              System.out.println("");
          }else if(i==29){
              System.out.println("");
          }else if(i==39){
              System.out.println("");
          }else if(i==49){
              System.out.println("");
          }else{
              System.out.print("|"+A[i]+"|");
          }
                  
        }
        Arrays.sort(A);
        for (int i = 0; i < B.length; i++) {
            if(i<10){
                B[i] = A[i];
            }else{
                B[i] = 0.5;
            }
        }
        System.out.println("Arreglo ordenado: ");
        for (int i = 0; i < A.length; i++) {
            if(i==9){
              System.out.println("|"+A[i]+"|");
          }else if(i==19){
              System.out.println("|"+A[i]+"|");
          }else if(i==29){
              System.out.println("|"+A[i]+"|");
          }else if(i==39){
              System.out.println("|"+A[i]+"|");
          }else if(i==49){
              System.out.println("|"+A[i]+"|");
          }else{
              System.out.print("|"+A[i]+"|");
          }
        }
        System.out.println("Arreglo combinado:");
        for (int i = 0; i < B.length; i++) {
            if(i==9){
                System.out.println("|"+B[i]+"|");
            }else if(i==19){
                System.out.println("|"+B[i]+"|");
            }else{
                System.out.print("|"+B[i]+"|");
            }
        }
        
    }
    
}
