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
public class License {
    
    private Motorist motorist;
    private int points=0;
    
    public void setMotorist(Motorist motorist){
        this.motorist=motorist;
    }
    
    public void addPoints(int points){
        this.points+=points;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public String getSummary(){
        return motorist.getTitle() + " " + motorist.getFirstName()
               + " " + motorist.getSurname() + ", " + Integer.toString(this.points) + " points.";
    }
    
}

//REFERENCIA: http://www.codemanship.co.uk/
