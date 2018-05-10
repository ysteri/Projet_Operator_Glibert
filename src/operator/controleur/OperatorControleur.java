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
    do{
        choix = ov.menu();
        switch (choix){
            case 1:
                gestionDeplacementBateau();
                break;
            case 2:
                gestionPort();
                break;
            case 3:
                ov.affMsg("Aurevoir !");
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 3);
}

public void gestionDeplacementBateau(){
    int choix;
    do{
        choix = ov.menuDeplacementBateau();
        switch (choix){
            case 1:
                ajoutDeplacementBateau();
                break;
            case 2:
                affilierPort();
                break;
            case 3:
                listeDeplacementsBateau();
                break;
            case 4:
                modifierSupSingle();
                break;
            case 5:
                supprimerDeplacementBateau();
                break;
            case 6:
                ov.affMsg("Retour au menu principal !");
                ov.menu();
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 6);
}

public void ajoutDeplacementBateau(){
    Bateau b = ov.encodeDeplacementBateau();
    String msg = om.ajouterDeplacementBateau(b);
    ov.affMsg(msg);
}

public void gestionPort(){
    int choix;
    do{
        choix = ov.menuPort();
        switch (choix){
            case 1:
                ajoutPort();
                break;
            case 2:         
                listePorts();
                break;
            case 3:
                ov.affMsg("Retour au menu principal !");
                ov.menu();
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 3);
}

public void ajoutPort(){
    Port p = ov.encodePort();
    String msg = om.ajouterPort(p);
    ov.affMsg(msg);
}

public void affilierPort(){
    listeDeplacementsBateau();
    Bateau b = rechercherDeplacementBateau();
    if(b==null){
        ov.affMsg("DéplacementBateau introuvable !");
        return;
    }
    ov.affDeplacementBateau(b);
    
    listePorts();
    ov.affMsg("Port de départ :");
    Port p = rechercherPort();
    if(p==null){
        ov.affMsg("Port introuvable !");
        return;
    }
    ov.affPort(p);
    
    listePorts();
    ov.affMsg("Port d'arrivée :");
    Port p2 = rechercherPort();
    if(p2==null){
        ov.affMsg("Port introuvable !");
        return;
    }
    else{
        if(p2.equals(p)){
            ov.affMsg("Vous ne pouvez pas choisir le même port");
            return;
        }
    }
    ov.affPort(p2);
    String msg = om.affilierPort(b,p,p2);
    ov.affMsg(msg);
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