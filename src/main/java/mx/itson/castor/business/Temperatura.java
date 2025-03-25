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
     * Metodo que calcula la temperatura
     *
     * @param centigrados
     * @return 
     */
    public double converirGrados(double centigrados) {
      double  formula= centigrados*(9/5)+32;
        return formula;
    }
}
