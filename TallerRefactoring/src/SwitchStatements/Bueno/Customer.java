/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwitchStatements.Bueno;

/**
 *
 * @author RODRIGUEZ
 */
public class Customer {
    
    public enum Membership {
  	Bronze, Silver, Gold
    }
  
    private Membership membership;
    private Member member;

    public Customer(Membership membership) {
          this.setMembership(membership);
    }
    
    public void setMembership(Membership membership) {
        this.membership = membership;

        switch(membership) {
          case Bronze:
            this.member = new BronzeMember();
            break;
          case Silver:
            this.member = new SilverMember();
            break;
          case Gold:
            this.member = new GoldMember();
            break;
          default: 
            throw new IllegalArgumentException("Invalid membership!!");
        }
    }
    
    public Membership getMembership() {
        return membership;
    }

    public double getMonthlyPrice() {
        return this.member.getMonthlyPrice();
    }

    public double getPointsEarned(double amountSpent) {
        return this.member.getPointsEarned(amountSpent);
    }
    
}
