
package com.tallerjava.taller2java;

import java.util.Scanner;

/**
 *Hace referencia a mi punto de partida de ejecucion de mi aplicacion 
 * @author Omar Rodriguez Chamorro
 */
public class main {
    public static void main(String[] args){
        /**
         * defino una variable para controlar el ciclo
         */
        boolean control = true;
        
        /**
         * implemento un ciclo while para ejecutar un intruccion
         */
        while(control == true){
            /**
             * defino un variable para capturar la opcion elegida por usuario
             */
            int opcion2;
            
            /**
             * defino variables para instanciar las clases 
             */
            NaveLanzadera naveLanzadera;
            NaveTripulada naveTripulada;
            NaveNoTripuladas naveNoTripulada;
            
            /**
             * muestro el menu de opciones al usuario
             */
           menu();
           
           /**
            * capturo la opcion del usuario
            */
           opcion2 = capturarInt();
           
           /**
            * evaluo la opcion elegida por el usuario y se ejecuta 
            */         
            if(opcion2 == 1){
                /**
                 * instancio la calse transbordador
                 */
                naveTripulada = new Transbordador();
                
                /**
                 * ejecuto los metodos de la clase
                 */
                naveTripulada.acelerar();            
                naveTripulada.setTripulantes(4);
                
            } else if(opcion2 == 2){
                /**
                 * instancio la calse Satelite
                 */
                naveNoTripulada = new Satelite();
                
                /**
                 * ejecuto los metodos de la clase
                 */
                naveNoTripulada.aterrizar();
                naveNoTripulada.despegar();
                
            }else if(opcion2 == 3){
                 /**
                 * instancio la calse Sonda espacial
                 */
                naveNoTripulada = new SondaEspacial();
                
                /**
                 * ejecuto los metodos de la clase
                 */
                naveNoTripulada.aterrizar();
                naveNoTripulada.despegar();
                
            }else if(opcion2 == 4){
                 /**
                 * instancio la calse Cohete
                 */
                 
                naveLanzadera = new Cohete("");
                
                /**
                 * ejecuto los metodos de la clase
                 */
                naveLanzadera.despegar();
                naveLanzadera.setNombre("Apolo");
                
            }else{
                /**
                * declaro una variable para capturar la opcion elegida por el usuario
                */
                int opcion;
                
                /**
                * muestro un mensaje de opciones al usuario para salir o continuar
                */
                System.out.println("¿Quiere continuar con la ejecucion de la aplicacion, ingrese 1 para continuar de lo contrario 0");
                /**
                * capturo la opcion del usuario
                */
                opcion = capturarInt();
                
                /**
                * evaluo y ejecuto la opcion del usuario
                */
                switch(opcion){
                    case 1 -> {
                        control = true;
                    }
                    case 0 -> {
                        control = false;
                    }
             
            }
            
            
        }
    }
        
    }
    /**
     * metodo para mostrar un menu al usuario
     */
    private static void menu(){
        System.out.println("¿Eliga del siguiente la Clase desea que se ejecute o si desea salir de la aplicacion?");
        System.out.println("1. Transbordador");
        System.out.println("2. Satelite");
        System.out.println("3. Sonda Espacial");
        System.out.println("4. Cohete");
        System.out.println("5. Salir");
    }
    
    /**
     * metodo para capturar un entero
     * @return 
     */
    private static int capturarInt(){
        Scanner input;      
        input = new Scanner(System.in);
        return input.nextInt();
    }
    
}



