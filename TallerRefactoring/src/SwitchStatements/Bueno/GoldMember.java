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
public class GoldMember implements Member{
    @Override
    public double getMonthlyPrice() {
        return 30;
    }
  
    @Override
    public double getPointsEarned(double amountSpent) {
        return amountSpent * 3;
    }
}
