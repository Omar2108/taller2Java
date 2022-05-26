
package com.tallerjava.taller2java;

/**
 *Representa una clase absatracta de los tipo de nave espaciales lanzadera
 * @author Omar Rodriguez Chamorro
 */
public abstract class NaveLanzadera {
    private final String nombre;
      
    public NaveLanzadera(String nombre){
        this.nombre = nombre;
    }
    /**
     * metodo para darle un nombre a la nave
     * @param nombre
     * 
     */
    public abstract void setNombre(String nombre);
       
    
    /**
     * metodo para darle una aceleracion a la nave
     */
    public abstract void despegar();
  
    
}
