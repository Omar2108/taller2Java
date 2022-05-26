
package com.tallerjava.taller2java;

/**
 *Representa a las nave espaciales lanzadera
 * @author Omar Rodriguez Chamorro
 */
public class Cohete extends NaveLanzadera implements Propulsores {
    
    /**
     * Declaracion de atributos
     */
    public String nombre;
    
    /**
     * Creacion del constructor
     *  
     * @param nombre
     */
    public Cohete(String nombre) {
        super(nombre);
        
    }
    
    /**
     * llamado del metodo setNombre de la clase abstracta naveLanzadera
     */
    @Override
    public void despegar() {
        System.out.println("el cohete ha despegado con exito");
    }
    
    /**
     * llamado del metodo setNombre de la clase abstracta naveLanzadera
     */
    @Override
    public void setNombre(String nombre) {
        System.out.println("El cohete tiene como nombre "+nombre);
    }
    
    /**
     * llamado del metodo impulsar de la interfaz propulsores
     */
    @Override
    public void impulsar() {
        System.out.println("Elcohete eta siendo impulsado");
    }
    
    
    
    
}
