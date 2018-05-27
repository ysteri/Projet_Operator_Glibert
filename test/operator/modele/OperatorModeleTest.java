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
    public void testAjouterBateau() {
        System.out.println("ajouterBateau");
        Bateau b1 = new Bateau("aa12");
        OperatorModele instance = new OperatorModele();
        String expResult1 = "Ajout bateau effectué !";
        String result1 = instance.ajouterBateau(b1);
        assertEquals("Ajout",expResult1, result1);
        Bateau b2 = null;
        String expResult2 = "Bateau nul !";
        String result2 = instance.ajouterBateau(b2);
        Bateau b3 = new Bateau("aa12");
        String expResult3 = "Bateau déjà Enregistré !";
        String result3= instance.ajouterBateau(b3);
        instance.suppBateau(b3);
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
        instance.suppPort(p3);
    }

    /**
     * Test of tousDeplacementsBateau method, of class OperatorModele.
     */
    @Test
    public void testTousBateaux() {
        System.out.println("tousBateaux");
        OperatorModele instance = new OperatorModele();
        List<Bateau> expResult = instance.tousBateaux();
        List<Bateau> result = instance.tousBateaux();
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
    public void testGetBateau() {
        System.out.println("getBateau");
        String codeBateau = "aa12";
        OperatorModele instance = new OperatorModele();
        Bateau expResult = instance.getBateau(codeBateau);
        Bateau result = instance.getBateau(codeBateau);
        assertEquals(expResult, result);
        instance.suppBateau(result);
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
        instance.suppPort(result);
    }
    
    /**
     * Test of modifierSupSingle method, of class OperatorModele.
     */
    @Test
    public void testModifSupSingle() {
        System.out.println("modifSupSingle");
        Bateau b = new Bateau();
        float SupSingle = 15;
        OperatorModele instance = new OperatorModele();
        String expResult = "changement du supplément single effectué !";
        String result = instance.modifSupSingle(b, SupSingle);
        assertEquals(expResult, result);
    }

    /**
     * Test of suppDeplacementBateau method, of class OperatorModele.
     */
    @Test
    public void testSuppBateau() {
        System.out.println("suppBateau");
        Bateau b = new Bateau();
        OperatorModele instance = new OperatorModele();
        String expResult1 = instance.suppBateau(b);
        String result1 = instance.suppBateau(b);
        assertEquals(expResult1, result1);
        String expResult2 = "Bateau introuvable ou suppression impossible !";
        String result2 = instance.suppBateau(b);
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

    /**
     * Test of ajouterVol method, of class OperatorModele.
     */
    @Test
    public void testAjouterVol() {
        System.out.println("ajouterVol");
        Vol v1 = null;
        OperatorModele instance = new OperatorModele();
        String expResult1 = "Vol null !";
        String result1 = instance.ajouterVol(v1);
        assertEquals(expResult1, result1);
        Vol v2 = new Vol("aa12");
        String expResult2 = "Ajout vol effectué !";
        String result2 = instance.ajouterVol(v2);
        assertEquals(expResult2, result2);
        Vol v3 = new Vol("aa12");
        String expResult3 = "Vol déjà enregistré !";
        String result3 = instance.ajouterVol(v3);
        assertEquals(expResult3, result3);
        instance.suppVol(v3);
    }

    /**
     * Test of ajouterAeroport method, of class OperatorModele.
     */
    /*
    @Test
    public void testAjouterAeroport() {
        System.out.println("ajouterAéroport");
        Aeroport a1 = null;
        OperatorModele instance = new OperatorModele();
        String expResult1 = "Aéroport nul ! ";
        String result1 = instance.ajouterAeroport(a1);
        assertEquals(expResult1, result1);
        Aeroport a2 = new Aeroport("aa12");
        String expResult2 = "Ajout aéroport effectué !";
        String result2 = instance.ajouterAeroport(a2);
        assertEquals(expResult2, result2);
        Aeroport a3 = new Aeroport("aa12");
        String expResult3 = "Aéroport déjà enregistré !";
        String result3 = instance.ajouterAeroport(a3);
        assertEquals(expResult3, result3);
        instance.suppAeroport(a3);
    }
*/
    /**
     * Test of tousVols method, of class OperatorModele.
     */
    @Test
    public void testTousVols() {
        System.out.println("tousVols");
        OperatorModele instance = new OperatorModele();
        List<Vol> expResult = instance.tousVols();
        List<Vol> result = instance.tousVols();
        assertEquals(expResult, result);
    }

    /**
     * Test of tousAeroports method, of class OperatorModele.
     */
    @Test
    public void testTousAeroports() {
        System.out.println("tousAeroports");
        OperatorModele instance = new OperatorModele();
        List<Aeroport> expResult = instance.tousAeroports();
        List<Aeroport> result = instance.tousAeroports();
        assertEquals(expResult, result);
    }

    /**
     * Test of getVol method, of class OperatorModele.
     */
    @Test
    public void testGetVol() {
        System.out.println("getVol");
        String codeVol = "aa12";
        OperatorModele instance = new OperatorModele();
        Vol expResult = instance.getVol(codeVol);
        Vol result = instance.getVol(codeVol);
        assertEquals(expResult, result);
        instance.suppVol(result);
    }

    /**
     * Test of getAeroport method, of class OperatorModele.
     */
    @Test
    public void testGetAeroport() {
        System.out.println("getAeroport");
        String codeAeroport = "aa12";
        OperatorModele instance = new OperatorModele();
        Aeroport expResult = instance.getAeroport(codeAeroport);
        Aeroport result = instance.getAeroport(codeAeroport);
        assertEquals(expResult, result);
        instance.suppAeroport(result);
    }

    /**
     * Test of affilierPort method, of class OperatorModele.
     */
    /*
    @Test
    public void testAffilierPort() {
        System.out.println("affilierPort");
        Bateau b = null;
        Port p = null;
        Port p2 = null;
        OperatorModele instance = new OperatorModele();
        String expResult = "";
        String result = instance.affilierPort(b, p, p2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of suppVol method, of class OperatorModele.
     */
    @Test
    public void testSuppVol() {
        System.out.println("suppVol");
        Vol v = new Vol();
        OperatorModele instance = new OperatorModele();
        String expResult1 = instance.suppVol(v);
        String result1 = instance.suppVol(v);
        assertEquals(expResult1, result1);
        String expResult2 = "Vol introuvable ou suppression impossible !";
        String result2 = instance.suppVol(v);
        assertEquals(expResult2,result2);
    }

    /**
     * Test of suppAeroport method, of class OperatorModele.
     */
    @Test
    public void testSuppAeroport() {
        System.out.println("suppAeroport");
        Aeroport a = new Aeroport();
        OperatorModele instance = new OperatorModele();
        String expResult1 = instance.suppAeroport(a);
        String result1 = instance.suppAeroport(a);
        assertEquals(expResult1, result1);
        String expResult2 = "Aéroport introuvable ou suppression impossible !";
        String result2 = instance.suppAeroport(a);
        assertEquals(expResult2,result2);
    }

    /**
     * Test of populateAeroportVol method, of class OperatorModele.
     */
    /*
    @Test
    public void testPopulateAeroportVol() {
        System.out.println("populateAeroportVol");
        OperatorModele instance = new OperatorModele();
        instance.populateAeroportVol();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of populatePort method, of class OperatorModele.
     */
    /*
    @Test
    public void testPopulatePort() {
        System.out.println("populatePort");
        OperatorModele instance = new OperatorModele();
        instance.populatePort();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
