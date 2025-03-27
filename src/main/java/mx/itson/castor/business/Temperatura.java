/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.castor.business;

/**
 *
 * @author alumnog
 */
public class Temperatura {
    
    /**
     * Metodo que calcula la temperatura de centigradoas a farenheit
     *
     * @param centigrados la cantidad de grados centigrados a calcular
     * @return el resultado convertido a farenheit
     */
    public static double convertirGrados(double centigrados) {
      
        
        return centigrados * 1.8 +32;
    }
}
