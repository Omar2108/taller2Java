
package com.tallerjava.taller2java;

/**
 *Representa una nave espacial no tripulada
 * @author Omar Rodriguez Chamorro
 */
public class Satelite extends NaveNoTripuladas implements Propulsores{
     
    /**
     * Creacion del constructor de la calse
     * 
     */
    public Satelite() {
        super();
    }

    
    /**
     * llamado del metodo aterrizar de la clase abstracta NaveNoTripuladas
     */
    @Override
    public void aterrizar() {
        System.out.println("El satelite ha aterrizado con exito");
    }
    
    /**
     * llamado del metodo despegar de la clase abstracta NaveNoTripuladas
     */
    @Override
    public void despegar() {
        System.out.println("El satelite ha despegado con exito");
    }
    
    /**
     * llamado del metodo impulsar de la interfaz
     */

    @Override
    public void impulsar() {
      System.out.println("El satelite eta siendo impulsado");  
    }
    
}
