/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testoperaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carpui
 */
public class TESTOPERACIONESTest {
    
    public TESTOPERACIONESTest() {
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
     * Test of multiplica method, of class TESTOPERACIONES.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = TESTOPERACIONES.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of factorial method, of class TESTOPERACIONES.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int num = 0;
        int expResult = 0;
        int result = TESTOPERACIONES.factorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class TESTOPERACIONES.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TESTOPERACIONES.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of factorial method, of class Test1Tema3.
     */
    @Test 
    public void factorial() {
        System.out.println("factorial");
        int num = 3;
        int expResult = 6;
        int result = TESTOPERACIONES.factorial(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test (expected=IllegalArgumentException.class)
    public void testFactorialNeg() {
        System.out.println("factorial");
        int num = -1;
        int result = TESTOPERACIONES.factorial(num);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

