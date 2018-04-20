/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;

import java.util.List;
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
public class OperatorModeleTest {
    
    public OperatorModeleTest() {
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
     * Test of ajouterDeplacementBateau method, of class OperatorModele.
     */
    @Test
    public void testAjouterDeplacementBateau() {
        System.out.println("ajouterDeplacementBateau");
        Bateau b = new Bateau();
        OperatorModele instance = new OperatorModele();
        String expResult = "Ajout DéplacementBateau effectué !";
        String result = instance.ajouterDeplacementBateau(b);
        assertEquals("Ajout",expResult, result);
    }

    /**
     * Test of ajouterPort method, of class OperatorModele.
     */
    @Test
    public void testAjouterPort() {
        System.out.println("ajouterPort");
        Port p = null;
        OperatorModele instance = new OperatorModele();
        String expResult = instance.ajouterPort(p);
        String result = instance.ajouterPort(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of tousDeplacementsBateau method, of class OperatorModele.
     */
    @Test
    public void testTousDeplacementsBateau() {
        System.out.println("tousDeplacementsBateau");
        OperatorModele instance = new OperatorModele();
        List<Bateau> expResult = instance.tousDeplacementsBateau();
        List<Bateau> result = instance.tousDeplacementsBateau();
        assertEquals(expResult, result);
    }

    /**
     * Test of tousPorts method, of class OperatorModele.
     */
    @Test
    public void testTousPorts() {
        System.out.println("tousPorts");
        OperatorModele instance = new OperatorModele();
        List<Port> expResult = instance.tousPorts();
        List<Port> result = instance.tousPorts();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDeplacementBateau method, of class OperatorModele.
     */
    @Test
    public void testGetDeplacementBateau() {
        System.out.println("getDeplacementBateau");
        String codeBateau = "";
        OperatorModele instance = new OperatorModele();
        Bateau expResult = instance.getDeplacementBateau(codeBateau);
        Bateau result = instance.getDeplacementBateau(codeBateau);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPort method, of class OperatorModele.
     */
    @Test
    public void testGetPort() {
        System.out.println("getPort");
        String codePort = "";
        OperatorModele instance = new OperatorModele();
        Port expResult = instance.getPort(codePort);
        Port result = instance.getPort(codePort);
        assertEquals(expResult, result);
    }

    /**
     * Test of modifBatMax method, of class OperatorModele.
     */
    @Test
    public void modifBatMax(){
        System.out.println("modifBatMax");
        Port p1 = new Port();
        int batMax1 = 50;
        OperatorModele instance = new OperatorModele();
        boolean expResult1 = true;
        boolean result1 = instance.modifbatMax(p1, batMax1);
        assertEquals(expResult1, result1);
        Port p2 = new Port();
        int batMax2 = 1200;
        boolean expResult2 = false;
        boolean result2 = instance.modifbatMax(p2, batMax2);
        assertEquals(expResult2, result2);
    }
    
    /**
     * Test of modifierSupSingle method, of class OperatorModele.
     */
    @Test
    public void testModifierSupSingle() {
        System.out.println("modifierSupSingle");
        Bateau b = new Bateau();
        float SupSingle = 0.0F;
        OperatorModele instance = new OperatorModele();
        String expResult = instance.modifierSupSingle(b, SupSingle);
        String result = instance.modifierSupSingle(b, SupSingle);
        assertEquals(expResult, result);
    }

    /**
     * Test of suppDeplacementBateau method, of class OperatorModele.
     */
    @Test
    public void testSuppDeplacementBateau() {
        System.out.println("suppDeplacementBateau");
        Bateau b = null;
        OperatorModele instance = new OperatorModele();
        String expResult = instance.suppDeplacementBateau(b);
        String result = instance.suppDeplacementBateau(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of suppPort method, of class OperatorModele.
     */
    @Test
    public void testSuppPort() {
        System.out.println("suppPort");
        Port p = null;
        OperatorModele instance = new OperatorModele();
        String expResult = instance.suppPort(p);
        String result = instance.suppPort(p);
        assertEquals(expResult, result);
    }
    
}
