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
public class CreditCard {
    
    private String creditCardNumber;
    private int expirationMonth;
    private int expirationYear;

    public CreditCard(String creditCardNumber, int expirationMonth, int expirationYear) {
        this.creditCardNumber = creditCardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
    }  
    
}

//REFERENCIAS: https://scotkelly.wordpress.com/2014/08/24/data-clumps-code-smell/
