/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.controleur;

import operator.modele.OperatorModele;
import operator.vue.OperatorVue;
import java.util.*;
import operator.modele.Bateau;
import operator.modele.Port;
/**
 *
 * @author Thoma
 */
public class OperatorControleur {
    private OperatorModele om = null;
    private OperatorVue ov = null;


public OperatorControleur(){
    //constructeur par défaut
}

public OperatorControleur(OperatorModele om, OperatorVue ov){
    this.om=om;
    this.ov=ov;
}

public void gestion(){
    int choix;
    creationPorts();
    do{
        choix = ov.menu();
        switch (choix){
            case 1:
                ajoutDeplacementBateau();
                break;
            case 2:
                ajoutPort();
                break;
            case 3:
                listeDeplacementsBateau();
                break;
            case 4:         
                listePorts();
                break;
            case 5:
                modifierSupSingle();
                break;
            case 6:
                supprimerDeplacementBateau();
                break;
            case 7:
                ov.affMsg("Aurevoir !");
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 7);
}

public void ajoutDeplacementBateau(){
    Bateau b = ov.encodeDeplacementBateau();
    String msg = om.ajouterDeplacementBateau(b);
    ov.affMsg(msg);
}

public void ajoutPort(){
    Port p = ov.encodePort();
    String msg = om.ajouterPort(p);
    ov.affMsg(msg);
}

public void creationPorts(){
    ov.affMsg("Création d'une suite de ports");
    Port a = new Port("A1","Marseille","France");
    String msg1 = om.ajouterPort(a);
    Port b = new Port("A2","Paris","France");
    String msg2 = om.ajouterPort(b);
    Port c = new Port("A3","Dijon","France");
    String msg3 = om.ajouterPort(c);
    Port d = new Port("A4","Maubeuge","France");
    String msg4 = om.ajouterPort(d);
    Port e = new Port("A5","Bordeaux","France");
    String msg5 = om.ajouterPort(e);
    Port f = new Port("A6","Bruxelles","Belgique");
    String msg6 = om.ajouterPort(f);
    Port g = new Port("A7","Mons","Belgique");
    String msg7 = om.ajouterPort(g);
    Port h = new Port("A8","Anvers","Belgique");
    String msg8 = om.ajouterPort(h);
    Port i = new Port("A9","Charleroi","Belgique");
    String msg9 = om.ajouterPort(i);
    Port j = new Port("A10","Gant","Belgique");
    String msg10 = om.ajouterPort(j);
    ov.affMsg("Ports créés !");
}

public void modifierSupSingle(){
    Bateau b = rechercherDeplacementBateau();
    if(b==null){
        ov.affMsg("DéplacementBateau introuvable !");
        return;
    }
    ov.affDeplacementBateau(b);
    String newSS = ov.getMsg("Nouveau supplément single : ");
    float newSupSingle = Float.parseFloat(newSS);
    String msg = om.modifierSupSingle(b, newSupSingle);
    ov.affMsg(msg);
}

public void supprimerDeplacementBateau(){
    Bateau b = rechercherDeplacementBateau();
    if(b==null){
        ov.affMsg("Déplacement introuvable !");
        return;
    }
    ov.affDeplacementBateau(b);
    String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
    if(supp.equals("oui")){
        String msg = om.suppDeplacementBateau(b);
        ov.affMsg(msg);
    }
    else ov.affMsg("Suppression annulée !");
        
}

public Bateau rechercherDeplacementBateau(){
    String codeBateau = ov.rechercherDeplacementBateau();
    return om.getDeplacementBateau(codeBateau);
}

public Port rechercherPort(){
    String codePort = ov.rechercherPort();
    return om.getPort(codePort);
}

public void listeDeplacementsBateau(){
    
    List<Bateau> lb = om.tousDeplacementsBateau();
    ov.affListe(lb);
    
}

public void listePorts(){
    
    List<Port> lp = om.tousPorts();
    ov.affListe(lp);
    
}



}