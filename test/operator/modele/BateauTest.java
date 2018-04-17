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
     * Test of getCode_bateau method, of class Bateau.
     */
    @Test
    public void testGetCode_bateau() {
        System.out.println("getCode_bateau");
        Bateau instance = new Bateau();
        String expResult = "";
        String result = instance.getCode_bateau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode_bateau method, of class Bateau.
     */
    @Test
    public void testSetCode_bateau() {
        System.out.println("setCode_bateau");
        String code_bateau = "";
        Bateau instance = new Bateau();
        instance.setCode_bateau(code_bateau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSup_single method, of class Bateau.
     */
    @Test
    public void testGetSup_single() {
        System.out.println("getSup_single");
        Bateau instance = new Bateau();
        float expResult = 0.0F;
        float result = instance.getSup_single();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSup_single method, of class Bateau.
     */
    @Test
    public void testSetSup_single() {
        System.out.println("setSup_single");
        float sup_single = 0.0F;
        Bateau instance = new Bateau();
        instance.setSup_single(sup_single);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDépart_port method, of class Bateau.
     */
    @Test
    public void testGetDépart_port() {
        System.out.println("getD\u00e9part_port");
        Bateau instance = new Bateau();
        String expResult = "";
        String result = instance.getDépart_port();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDépart_port method, of class Bateau.
     */
    @Test
    public void testSetDépart_port() {
        System.out.println("setD\u00e9part_port");
        String départ_port = "";
        Bateau instance = new Bateau();
        instance.setDépart_port(départ_port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivée_port method, of class Bateau.
     */
    @Test
    public void testGetArrivée_port() {
        System.out.println("getArriv\u00e9e_port");
        Bateau instance = new Bateau();
        String expResult = "";
        String result = instance.getArrivée_port();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrivée_port method, of class Bateau.
     */
    @Test
    public void testSetArrivée_port() {
        System.out.println("setArriv\u00e9e_port");
        String arrivée_port = "";
        Bateau instance = new Bateau();
        instance.setArrivée_port(arrivée_port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bateau.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bateau instance = new Bateau();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Bateau.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Bateau instance = new Bateau();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Bateau.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Bateau instance = new Bateau();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
