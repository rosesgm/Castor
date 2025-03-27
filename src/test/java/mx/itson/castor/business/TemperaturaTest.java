/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.castor.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of convertirGrados method, of class Temperatura.
     */
    @Test
    public void testConvertirGrados() {
        //noimbre y descripcion del caso de prueba
        System.out.println("convertirGrados");
        //input (datos de entrada)
        double centigrados = 25;
        // Expected results.  (Resultado esperado.)
        double expResult = 77;
        // Actual results. (Resultado obtenido)
        double result = Temperatura.convertirGrados(centigrados);
        
        //Ejecucion de la prueba.
        assertEquals(expResult, result, 0.0);
        
    }
    
}
