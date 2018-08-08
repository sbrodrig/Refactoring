/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Malo;

/**
 *
 * @author RODRIGUEZ
 */
public class Promedio {
    
    private int[] arreglo1;
    private int[] arreglo2;
    
    public Promedio(int[] arreglo1, int[] arreglo2){
        this.arreglo1=arreglo1;
        this.arreglo2=arreglo2;
    }
    
    public int promedioArreglo1(){
        int suma=0;
        for(int i=0; i<arreglo1.length; i++){
            suma=suma+arreglo1[i];
        }
        return suma/arreglo1.length;
    }
    
    public int promedioArreglo2(){
        int suma=0;
        for(int i=0; i<arreglo2.length; i++){
            suma=suma+arreglo2[i];
        }
        return suma/arreglo2.length;
    }
    
}
