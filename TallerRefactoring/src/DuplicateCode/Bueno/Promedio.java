/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Bueno;

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
    
    public int promedioArreglo(int[] a){
        int suma=0;
        for(int i=0; i<a.length; i++){
            suma=suma+a[i];
        }
        return suma/a.length;
    }
    
}
