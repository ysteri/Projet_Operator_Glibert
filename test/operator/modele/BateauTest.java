/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thoma
 */
public class BateauTest {
    
    public BateauTest() {
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
     * Test of getCodeBateau method, of class Bateau.
     */
    @Test
    public void testGetCodeBateau() {
        System.out.println("getCodeBateau");
        Bateau instance = new Bateau();
        String expResult = instance.getCodeBateau();
        String result = instance.getCodeBateau();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodeBateau method, of class Bateau.
     */
    @Test
    public void testSetCodeBateau() {
        System.out.println("setCodeBateau");
        String codeBateau = "";
        Bateau instance = new Bateau();
        instance.setCodeBateau(codeBateau);
    }

    /**
     * Test of getSupSingle method, of class Bateau.
     */
    @Test
    public void testGetSupSingle() {
        System.out.println("getSupSingle");
        Bateau instance = new Bateau();
        float expResult = 0.0F;
        float result = instance.getSupSingle();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSupSingle method, of class Bateau.
     */
    @Test
    public void testSetSupSingle() {
        System.out.println("setSupSingle");
        float supSingle = 0.0F;
        Bateau instance = new Bateau();
        instance.setSupSingle(supSingle);
    }

    /**
     * Test of getDepartPort method, of class Bateau.
     */
    @Test
    public void testGetDepartPort() {
        System.out.println("getDepartPort");
        Bateau instance = new Bateau();
        Port expResult = instance.getDepartPort();
        Port result = instance.getDepartPort();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDepartPort method, of class Bateau.
     */
    @Test
    public void testSetDepartPort() {
        System.out.println("setDepartPort");
        Port departPort = null;
        Bateau instance = new Bateau();
        instance.setDepartPort(departPort);
    }

    /**
     * Test of getArriveePort method, of class Bateau.
     */
    @Test
    public void testGetArriveePort() {
        System.out.println("getArriveePort");
        Bateau instance = new Bateau();
        Port expResult = instance.getArriveePort();
        Port result = instance.getArriveePort();
        assertEquals(expResult, result);
    }

    /**
     * Test of setArriveePort method, of class Bateau.
     */
    @Test
    public void testSetArriveePort() {
        System.out.println("setArriveePort");
        Port arriveePort = null;
        Bateau instance = new Bateau();
        instance.setArriveePort(arriveePort);
    }

    /**
     * Test of toString method, of class Bateau.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bateau instance = new Bateau();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Bateau.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Bateau instance = new Bateau();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Bateau.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Bateau instance = new Bateau();
        boolean expResult = instance.equals(obj);
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
