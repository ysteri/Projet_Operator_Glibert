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
public class PortTest {
    
    public PortTest() {
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
     * Test of getCodePort method, of class Port.
     */
    @Test
    public void testGetCodePort() {
        System.out.println("getCodePort");
        Port instance = new Port();
        String expResult = instance.getCodePort();
        String result = instance.getCodePort();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodePort method, of class Port.
     */
    @Test
    public void testSetCodePort() {
        System.out.println("setCodePort");
        String codePort = "";
        Port instance = new Port();
        instance.setCodePort(codePort);
    }

    /**
     * Test of getVille method, of class Port.
     */
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Port instance = new Port();
        String expResult = instance.getVille();
        String result = instance.getVille();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVille method, of class Port.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Port instance = new Port();
        instance.setVille(ville);
    }

    /**
     * Test of getPays method, of class Port.
     */
    @Test
    public void testGetPays() {
        System.out.println("getPays");
        Port instance = new Port();
        String expResult = instance.getPays();
        String result = instance.getPays();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPays method, of class Port.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Port instance = new Port();
        instance.setPays(pays);
    }

    /**
     * Test of toString method, of class Port.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Port instance = new Port();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Port.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Port instance = new Port();
        int expResult = instance.hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Port.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Port instance = new Port();
        boolean expResult = instance.equals(obj);
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
