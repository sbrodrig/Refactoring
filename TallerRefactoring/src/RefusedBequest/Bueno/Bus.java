/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RefusedBequest.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Bus implements Automovil{
    
    @Override
    public void encender() {
        System.out.println("Encendiendo bus");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando bus..");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando...");
    }

    @Override
    public void cambioDeMarcha() {
        System.out.println("Cambiando de marcha...");
    }
    
}
