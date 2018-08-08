/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class ContactInformation {
    
    private String firstName; 
    private String lastName;
    private String zipcode;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String state;
    private String country;
    private String phoneNumber;
    
    public ContactInformation(String firstName, String lastName, String zipcode, String streetAddress1, String streetAddress2, String city, String state, String country, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipcode = zipcode;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }
    
}

//REFERENCIAS: https://scotkelly.wordpress.com/2014/08/24/data-clumps-code-smell/
