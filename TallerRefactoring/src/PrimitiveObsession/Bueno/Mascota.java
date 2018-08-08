/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Mascota {
    
    private String nombre;
    private String raza;
    private Dueño dueño;

    public Mascota(String nombre, String raza, Dueño dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.dueño=dueño;
    }
    
}
