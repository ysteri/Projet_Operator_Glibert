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
        Bateau b1 = new Bateau("aa12");
        OperatorModele instance = new OperatorModele();
        String expResult1 = "Ajout DéplacementBateau effectué !";
        String result1 = instance.ajouterDeplacementBateau(b1);
        assertEquals("Ajout",expResult1, result1);
        Bateau b2 = null;
        String expResult2 = "DéplacementBateau nul !";
        String result2 = instance.ajouterDeplacementBateau(b2);
        Bateau b3 = new Bateau("aa12");
        String expResult3 = "DéplacementBateau déjà Enregistré !";
        String result3= instance.ajouterDeplacementBateau(b3); 
    }

    /**
     * Test of ajouterPort method, of class OperatorModele.
     */
    @Test
    public void testAjouterPort() {
        System.out.println("ajouterPort");
        Port p1 = null;
        OperatorModele instance = new OperatorModele();
        String expResult1 = "Port nul !";
        String result1 = instance.ajouterPort(p1);
        assertEquals(expResult1, result1);
        Port p2 = new Port("aa12");
        String expResult2 = "Ajout port effectué !";
        String result2 = instance.ajouterPort(p2);
        assertEquals(expResult2, result2);
        Port p3 = new Port("aa12");
        String expResult3 = "Port déjà enregistré !";
        String result3 = instance.ajouterPort(p3);
        assertEquals(expResult3, result3);
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
        String codeBateau = "aa12";
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
        String codePort = "aa12";
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
        float SupSingle = 15;
        OperatorModele instance = new OperatorModele();
        String expResult = "changement du supplément single effectué !";
        String result = instance.modifierSupSingle(b, SupSingle);
        assertEquals(expResult, result);
    }

    /**
     * Test of suppDeplacementBateau method, of class OperatorModele.
     */
    @Test
    public void testSuppDeplacementBateau() {
        System.out.println("suppDeplacementBateau");
        Bateau b = new Bateau();
        OperatorModele instance = new OperatorModele();
        String expResult1 = instance.suppDeplacementBateau(b);
        String result1 = instance.suppDeplacementBateau(b);
        assertEquals(expResult1, result1);
        String expResult2 = "DeplacementBateau introuvable ou suppression impossible !";
        String result2 = instance.suppDeplacementBateau(b);
        assertEquals(expResult2,result2);
        
    }

    /**
     * Test of suppPort method, of class OperatorModele.
     */
    @Test
    public void testSuppPort() {
        System.out.println("suppPort");
        Port p = new Port();
        OperatorModele instance = new OperatorModele();
        String expResult1 = instance.suppPort(p);
        String result1 = instance.suppPort(p);
        assertEquals(expResult1, result1);
        String expResult2 ="Port introuvable ou suppression impossible !";
        String result2 =instance.suppPort(p);
        assertEquals(expResult2,result2);
    }
    
}
