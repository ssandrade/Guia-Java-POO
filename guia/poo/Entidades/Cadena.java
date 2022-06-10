/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.poo.Entidades;

/**
 *
 * @author Sergio
 */
public class Cadena {
    //atributos
    private String frase;
    private int longitud;
    
    
    //constructores
    public Cadena() {
    }
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    
    //setter y getter
    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    public int getLongitud() {
        return longitud;
    }
    public String getFrase() {
        return frase;
    }
    
    
    //declarar atributos
    
}
