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
public class License {
    
    private int points=0;
    
    public void addPoints(int points){
        this.points+=points;
    }
    
    public int getPoints(){
        return this.points;
    }

    public int getRiskFactor(Motorist motoristBueno) {
        if (getPoints() > 3)
            return 10;
        else if (getPoints() > 0)
            return 5;
        else
            return 0;
    }
    
}

//REFERENCIA: http://www.codemanship.co.uk/
