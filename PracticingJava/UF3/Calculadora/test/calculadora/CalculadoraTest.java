/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shebi
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of sumar method, of class Calculadora.
     */
//    @Test
//    public void testSumar() {
//        System.out.println("sumar");
//        double numero1 = -5.3;
//        double numero2 = 1.0;
//        Calculadora instance = new Calculadora();
//        double expResult = -4.3;
//        double result = instance.sumar(numero1, numero2);
//        assertEquals(expResult, result, 0);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of restar method, of class Calculadora.
     */
//    @Test
//    public void testRestar() {
//        System.out.println("restar");
//        double numero1 = 4.0;
//        double numero2 = 0.4;
//        Calculadora instance = new Calculadora();
//        double expResult = 1.0;
//        double result = instance.restar(numero1, numero2);
//        assertEquals(expResult, result, 0);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
//    @Test
//    public void testMultiplicar() {
//        System.out.println("multiplicar");
//        double numero1 = -2.0;
//        double numero2 = -1.0;
//        Calculadora instance = new Calculadora();
//        double expResult = -2.0;
//        double result = instance.multiplicar(numero1, numero2);
//        assertEquals(expResult, result, 0);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double numero1 = -2.0;
        double numero2 = -1.0;
        Calculadora instance = new Calculadora();
        double expResult = 2.0;
        double result = instance.dividir(numero1, numero2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
