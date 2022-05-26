
package com.tallerjava.taller2java;

/**
 *Representa a las nave espaciales no tripuldas
 * @author Omar Rodriguez Chamorro
 */
public class SondaEspacial extends NaveNoTripuladas implements Propulsores {
    
    /**
     * Creacion del constructor
     */
    public SondaEspacial() {
        super();
        
    }
    
    
    /**
     * llamado del metodo aterrizar de la clase abstracta nave
     */
    @Override
    public void aterrizar() {
        System.out.println("La sonda espacial ha aterrizado con exito");
    }
    
    /**
     * llamado del metodo despegar de la interfaz propulsores
     */
    @Override
    public void despegar() {
        System.out.println("La sonda espacial ha despegado con exito");
    }
    
    /**
     * llamado del metodo impulsar de la interfaz
     */
    @Override
    public void impulsar() {
        System.out.println("Elcohete eta siendo impulsado");
    }
    
}
