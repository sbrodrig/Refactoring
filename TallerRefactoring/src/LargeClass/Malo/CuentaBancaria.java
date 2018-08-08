/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LargeClass.Malo;

/**
 *
 * @author RODRIGUEZ
 */
public class CuentaBancaria {
    
    private String nombreC;
    private String apellidoC;
    private String direccionC;
    private String telefonoC;
    private int numCuenta;
    private double dinero;
    private double intereses;
    
    public CuentaBancaria(String nombreC, String apellidoC, String direccionC, String telefonoC, int numCuenta, 
                              double dinero, double intereses){
        this.nombreC=nombreC;
        this.apellidoC=apellidoC;
        this.direccionC=direccionC;
        this.telefonoC=telefonoC;
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
