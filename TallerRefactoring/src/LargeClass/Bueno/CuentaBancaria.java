/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class CuentaBancaria {
    
    private Cliente c;
    private int numCuenta;
    private double dinero;
    private double intereses;
    
    public CuentaBancaria(Cliente c,int numCuenta, double dinero, double intereses){
        this.c=c;
        this.numCuenta=numCuenta;
        this.dinero=dinero;
        this.intereses=intereses;
    }
    
    public void retiro(int numCuenta, double dinero){
        //do something
    }
    
    public void deposito(int numCuenta, double dinero){
        //do something
    }
    
    public void cerrarCuenta(int numCuenta){
        //do something
    }
    
    //muchas funcionalidades más
    
}
