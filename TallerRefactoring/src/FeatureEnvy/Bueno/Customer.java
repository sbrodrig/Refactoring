/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FeatureEnvy.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Customer {
    
    private Phone mobilePhone;

    public Customer(Phone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    public String getMobilePhoneNumber() {
        return mobilePhone.toFormattedString();
    }
    
}

//REFERENCIA: https://elearning.industriallogic.com/gh/submit?Action=PageAction&album=recognizingSmells&path=recognizingSmells/featureEnvy/featureEnvyExample&devLanguage=Java
