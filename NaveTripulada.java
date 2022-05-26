/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tallerjava.taller2java;

/**
 *Representa una clase absatracta de los tipo de nave espaciales tripuladas
 * @author Omar Rodriguez Chamorro
 */
public abstract class NaveTripulada {
    
    /**
     * Definir atributos
     */
    private int velocidad;
    private int tripulacion;
    /**
     * Creacion del constructor
     */
    
    public NaveTripulada(){
        
    }
    
    /**
     * Metodo para acelerar
     */
    public abstract void acelerar();
    
     /**
     * Metodo para dar el numero de tripulante 
     * @param tripulantes
     */
    public abstract void setTripulantes(int tripulantes);
    
    
    
    
}
