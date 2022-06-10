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
public class CuentaBancaria {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //atributos
    private long NumeroCuenta;
    private int DNI;
    private double Saldo;
    
    
    //Constructores
    public CuentaBancaria() {
    }
    public CuentaBancaria(long NumeroCuenta, int DNI, double Saldo) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.Saldo = Saldo;
    }
    
    
    //setter y getter
    public void setNumeroCuenta(long NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    public int getDNI() {
        return DNI;
    }
    public long getNumeroCuenta() {
        return NumeroCuenta;
    }
    public double getSaldo() {
        return Saldo;
    }
    
    
    //metodos
    public void cuenta(){
        System.out.println("Ingrese numero de cuenta, DNI y saldo actual");   
        setNumeroCuenta(leer.nextInt());
        setDNI(leer.nextInt());
        setSaldo(leer.nextInt());
    }
    public void ingresar(){
        System.out.println("¿cuanto dinero quiere ingresar?");
        double ingreso = leer.nextDouble();
        setSaldo(getSaldo() + ingreso);
        System.out.println("Su saldo actual es: $"+getSaldo());
    }
    public void retirar(){
        System.out.println("¿cuanto dinero quiere retirar?");
        double retiro = leer.nextDouble();
        if (retiro >= getSaldo()){
            setSaldo(0);
            System.out.println("Su saldo actual es de: $0");
        }else{
            setSaldo(getSaldo() - retiro);
            System.out.println("Su saldo actual es de: $"+getSaldo());   
        }
    }
    public void extraccionRapida(){
        System.out.println("¿Cuanto dinero quiere retirar(max.20%)?");
        double monto = leer.nextDouble();
        double porcentaje = 20 * getSaldo() % 100;
        if (monto > porcentaje){
            setSaldo(getSaldo() - monto);
        }else{
            System.out.println("ERROR. El valor ingresado es mayor al 20% del monto en el banco");
         getSaldo();   
        }
    }
    public void consSaldo(){
        System.out.println("El saldo de su cuenta es de $"+getSaldo()); 
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NumeroCuenta=" + NumeroCuenta + ", DNI=" + DNI + ", Saldo=" + Saldo + '}';
    }
    
}
