
package com.tallerjava.taller2java;

/**
 *Representa a las nave espaciales tripuldas
 * @author Omar Rodriguez Chamorro
 */
public class Transbordador extends NaveTripulada implements Propulsores{
    
    /**
     * Definicion de atributos
     * 
     */
    
    public int velocidad;
    public int tripulantes;
    
    /**
     * Creacion del constructor
     *  
     * @param tripulantes     * 
     */
    
    Transbordador() {
        super();
        this.velocidad = 0;
    }

    public Transbordador(int velocidad, int tripulantes) {
        this.velocidad = velocidad;
        this.tripulantes = tripulantes;
    }
    
    /**
     * llamado del metodo acelerar de la clase abstracta naveTripulada
     */
    
    @Override
    public void acelerar() {
        velocidad = this.velocidad + 100;
       System.out.println("El transbordador esta acelerando, con una velocidad de "+velocidad);
    }
    
    /**
     * llamado del metodo setTripulantes de la clase abstracta naveTripulada
     */
    @Override
    public void setTripulantes(int tripulantes) {
        System.out.println("El transbordador lleva a bordo "+tripulantes+" tripulantes");
        
    }
    
    public void setTripulantes(Integer tripulantes) {
        System.out.println("El transbordador lleva a bordo "+tripulantes+" tripulantes");
        
    }
    
    /**
     * llamado del metodo impulsar de la interfaz propulsores
     */
    @Override
    public void impulsar() {
        System.out.println("Elcohete eta siendo impulsado");
    }
    
    
    
    
}
