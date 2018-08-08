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
public class Cliente {
    
    private String nombreC;
    private String apellidoC;
    private String direccionC;
    private String telefonoC;
    
    public Cliente(String nombreC, String apellidoC, String direccionC, String telefonoC){
        this.nombreC=nombreC;
        this.apellidoC=apellidoC;
        this.direccionC=direccionC;
        this.telefonoC=telefonoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getApellidoC() {
        return apellidoC;
    }

    public void setApellidoC(String apellidoC) {
        this.apellidoC = apellidoC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

    public String getTelefonoC() {
        return telefonoC;
    }

    public void setTelefonoC(String telefonoC) {
        this.telefonoC = telefonoC;
    }
    
}
