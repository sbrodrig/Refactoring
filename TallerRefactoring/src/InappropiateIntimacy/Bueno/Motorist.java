/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Motorist {
    
    public License license;
    private String title;
    private String firstName;
    private String surname;

    public Motorist(License license, String title, String firstName, String surname) {
        this.license=license;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getSummary(License licenseBueno) {
        return this.getTitle() + " " + this.getFirstName() 
               + " " + this.getSurname() + ", " + Integer.toString(licenseBueno.getPoints()) + " points.";
    }
    
}

//REFERENCIA: http://www.codemanship.co.uk/