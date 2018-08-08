/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InappropiateIntimacy.Malo;

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
        this.license.setMotorist(this);
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
    
    public int getRiskFactor(){
        if(license.getPoints()>3)
            return 10;
        else if(license.getPoints()>0)
            return 5;
        else
            return 0;
    }
    
}

//REFERENCIA: http://www.codemanship.co.uk/
