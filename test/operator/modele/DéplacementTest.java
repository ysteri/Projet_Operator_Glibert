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
public class DéplacementTest {
    
    public DéplacementTest() {
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
     * Test of getPrix method, of class Déplacement.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Déplacement instance = new DéplacementImpl();
        float expResult = 0.0F;
        float result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrix method, of class Déplacement.
     */
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        float prix = 0.0F;
        Déplacement instance = new DéplacementImpl();
        instance.setPrix(prix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDépart_date method, of class Déplacement.
     */
    @Test
    public void testGetDépart_date() {
        System.out.println("getD\u00e9part_date");
        Déplacement instance = new DéplacementImpl();
        String expResult = "";
        String result = instance.getDépart_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDépart_date method, of class Déplacement.
     */
    @Test
    public void testSetDépart_date() {
        System.out.println("setD\u00e9part_date");
        String départ_date = "";
        Déplacement instance = new DéplacementImpl();
        instance.setDépart_date(départ_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivée_date method, of class Déplacement.
     */
    @Test
    public void testGetArrivée_date() {
        System.out.println("getArriv\u00e9e_date");
        Déplacement instance = new DéplacementImpl();
        String expResult = "";
        String result = instance.getArrivée_date();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrivée_date method, of class Déplacement.
     */
    @Test
    public void testSetArrivée_date() {
        System.out.println("setArriv\u00e9e_date");
        String arrivée_date = "";
        Déplacement instance = new DéplacementImpl();
        instance.setArrivée_date(arrivée_date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDépart_heure method, of class Déplacement.
     */
    @Test
    public void testGetDépart_heure() {
        System.out.println("getD\u00e9part_heure");
        Déplacement instance = new DéplacementImpl();
        String expResult = "";
        String result = instance.getDépart_heure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDépart_heure method, of class Déplacement.
     */
    @Test
    public void testSetDépart_heure() {
        System.out.println("setD\u00e9part_heure");
        String départ_heure = "";
        Déplacement instance = new DéplacementImpl();
        instance.setDépart_heure(départ_heure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivée_heure method, of class Déplacement.
     */
    @Test
    public void testGetArrivée_heure() {
        System.out.println("getArriv\u00e9e_heure");
        Déplacement instance = new DéplacementImpl();
        String expResult = "";
        String result = instance.getArrivée_heure();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArrivée_heure method, of class Déplacement.
     */
    @Test
    public void testSetArrivée_heure() {
        System.out.println("setArriv\u00e9e_heure");
        String arrivée_heure = "";
        Déplacement instance = new DéplacementImpl();
        instance.setArrivée_heure(arrivée_heure);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Déplacement.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Déplacement instance = new DéplacementImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Déplacement.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Déplacement instance = new DéplacementImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Déplacement.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Déplacement instance = new DéplacementImpl();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DéplacementImpl extends Déplacement {
    }
    
}
