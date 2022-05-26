
package com.tallerjava.taller2java;

import java.util.Scanner;

/**
 *Hace referencia a mi punto de partida de ejecucion de mi aplicacion 
 * @author Omar Rodriguez Chamorro
 */
public class main {
    public static void main(String[] args){
        
        boolean control = true;
        while(control == true){
            int opcion2;
            NaveLanzadera naveLanzadera;
            NaveTripulada naveTripulada;
            NaveNoTripuladas naveNoTripulada;
            
           menu();
           opcion2 = capturarInt();
         
            if(opcion2 == 1){
                naveTripulada = new Transbordador();
                naveTripulada.acelerar();            
                naveTripulada.setTripulantes(4);
                
            } else if(opcion2 == 2){
                naveNoTripulada = new Satelite();
                naveNoTripulada.aterrizar();
                naveNoTripulada.despegar();
                
            }else if(opcion2 == 3){
                naveNoTripulada = new SondaEspacial();
                naveNoTripulada.aterrizar();
                naveNoTripulada.despegar();
            }else if(opcion2 == 4){
                naveLanzadera = new Cohete("");
                naveLanzadera.despegar();
                naveLanzadera.setNombre("Apolo");
            }else{
                int opcion;
                System.out.println("¿Quiere continuar con la ejecucion de la aplicacion, ingrese 1 para continuar de lo contrario 0");
                opcion = capturarInt();
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
    
    private static void menu(){
        System.out.println("¿Eliga del siguiente la Clase desea que se ejecute o si desea salir de la aplicacion?");
        System.out.println("1. Transbordador");
        System.out.println("2. Satelite");
        System.out.println("3. Sonda Espacial");
        System.out.println("4. Cohete");
        System.out.println("5. Salir");
    }
    private static int capturarInt(){
        Scanner input;      
        input = new Scanner(System.in);
        return input.nextInt();
    }
    
}



