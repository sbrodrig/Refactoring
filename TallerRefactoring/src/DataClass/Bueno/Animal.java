/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClass.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Animal {
    
    private String especie;
    private String nombre;
    private int edad;
    private String origen;

    public Animal(String especie, String nombre, int edad, String origen) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.origen = origen;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
}
