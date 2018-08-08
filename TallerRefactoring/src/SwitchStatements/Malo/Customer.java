/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Malo;

/**
 *
 * @author RODRIGUEZ
 */
public class Customer {
    
    public enum Membership {
        Bronze, Silver, Gold
    }

    public Membership membership;

    public Customer(Membership membership) {
        this.membership = membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public Membership getMembership() {
        return membership;
    }

    public double getMonthlyPrice() {
        switch(membership) {
            case Bronze:
                    return 10;
            case Silver:
                    return 20;
            case Gold:
                    return 30;
            default: 
                    throw new IllegalArgumentException("Invalid membership!!");
        }
    }
    
    public double getPointsEarned(double amountSpent) {
        switch(membership) {
            case Bronze:
                return amountSpent * 1;
            case Silver:
                return amountSpent * 2;
            case Gold:
                return amountSpent * 3;
            default:
                throw new IllegalArgumentException("Invalid membership!!");
        }
    }
    
    //se podría dar el caso de crer más métodos cuyo resultado dependa de la membresía
    
}

//REFERENCIA: https://subash.com.au/removing-switch-cases-using-state-pattern/
