/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class CribaEratostenesIT {

    public CribaEratostenesIT() {
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
     * Test of generarPrimos method, of class CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos1() {
        System.out.println("generarPrimos");
        int max = 0;
        int[] expResult = {};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);

    }

    public void testGenerarPrimos2() {
        System.out.println("generarPrimos");
        int max = 2;
        int[] expResult = {2};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);

    }

    public void testGenerarPrimos3() {
        System.out.println("generarPrimos");
        int max = 3;
        int[] expResult = {2, 3};
        int[] result = CribaEratostenes.generarPrimos(max);
        assertArrayEquals(expResult, result);

    }

    public void testGenerarPrimos4() {
        System.out.println("generarPrimos");
        int max = 100;
        int[] expResult = {2,
    
    3,
5,
7,
11,
13,
17,
19,
23,
29,
31,
37,
41,
43,
47,
53,
59,
61,
67,
71,
73,
79,
83,
89,
97};
        int[] result = CribaEratostenes.generarPrimos(max);

    assertArrayEquals(expResult, result);

}

}
