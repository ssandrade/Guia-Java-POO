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
public class Persona {
    
    //atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;
    private Date nacimiento;
    
    
    //constructores
    public Persona() {
    }
    public Persona(String nombre, int edad, String sexo, double altura, double peso, Date nacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        
    }
    
    
    
    //setter y getter
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    } 

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}
