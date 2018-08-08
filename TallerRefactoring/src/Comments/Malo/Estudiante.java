/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comments.Malo;

import java.util.Map;

/**
 *
 * @author RODRIGUEZ
 */
public class Estudiante {
    
    private String matricula;
    private String nombre;
    private int edad;
    private Map<String, Double> materias;

    public Estudiante(String matricula, String nombre, int edad, Map<String, Double> materias) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }
    /**
     * Calcula el promedio de las materias 
     * que se encuentran almacenadas en el Map
     * @return promedio de las materias
     */
    public double calcular(){
        double suma=0;
        for(String key : materias.keySet()){
            suma=suma+materias.get(key);
        }
        return suma/materias.size();
    }
    
}
