/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.controleur;

import operator.modele.OperatorModele;
import operator.vue.OperatorVue;
import java.util.*;
import operator.modele.Aeroport;
import operator.modele.Bateau;
import operator.modele.Port;
import operator.modele.Vol;
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
                gestionBateau();
                break;
            case 2:
                gestionPort();
                break;
            case 3:
                gestionVol();
                break;
            case 4:
                gestionAeroport();
                break;
            case 5:
                ov.affMsg("Aurevoir !");
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 5);
}

public void gestionBateau(){
    int choix;
    do{
        choix = ov.menuBateau();
        switch (choix){
            case 1:
                ajoutBateau();
                break;
            case 2:
                affilierPort();
                break;
            case 3:
                listeBateaux();
                break;
            case 4:
                rechBateau();
                break;
            case 5:
                modifSupSingle();
                break;
            case 6:
                suppBateau();
                break;
            case 7:
                ov.affMsg("Retour au menu principal !");
                ov.menu();
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 7);
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
                rechPort();
                break;
            case 4:
                suppPort();
                break;
            case 5:
                ov.affMsg("Retour au menu principal !");
                ov.menu();
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 5);
}

public void gestionVol(){
    int choix;
    do{
        choix = ov.menuVol();
        switch (choix){
            case 1:
                ajoutVol();
                break;
            case 2:
                affilierAeroport();
                break;
            case 3:         
                listeVols();
                break;
            case 4:
                rechVol();
                break;
            case 5:
                suppVol();
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

public void gestionAeroport(){
    int choix;
    do{
        choix = ov.menuAeroport();
        switch (choix){
            case 1:
                ajoutAeroport();
                break;
            case 2:         
                listeAeroports();
                break;
            case 3:
                rechAeroport();
                break;
            case 4:
                suppAeroport();
                break;
            case 5:
                ov.affMsg("Retour au menu principal !");
                ov.menu();
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 5);
}

public void ajoutBateau(){
    Bateau b = ov.encodeBateau();
    String msg = om.ajouterBateau(b);
    ov.affMsg(msg);
}

public void ajoutPort(){
    Port p = ov.encodePort();
    String msg = om.ajouterPort(p);
    ov.affMsg(msg);
}

public void ajoutAeroport(){
    Aeroport a = ov.encodeAeroport();
    String msg = om.ajouterAeroport(a);
    ov.affMsg(msg);
}

public void ajoutVol(){
    Vol v = ov.encodeVol();
    String msg = om.ajouterVol(v);
    ov.affMsg(msg);
}

public void affilierPort(){
    listeBateaux();
    Bateau b = rechBateau();
    if(b==null){
        ov.affMsg("Bateau introuvable !");
        return;
    }
    ov.affBateau(b);
    
    listePorts();
    ov.affMsg("Port de départ :");
    Port p = rechPort();
    if(p==null){
        ov.affMsg("Port introuvable !");
        return;
    }
    ov.affPort(p);
    
    listePorts();
    ov.affMsg("Port d'arrivée :");
    Port p2 = rechPort();
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

public void affilierAeroport(){
    listeVols();
    Bateau b = rechBateau();
    if(b==null){
        ov.affMsg("Bateau introuvable !");
        return;
    }
    ov.affBateau(b);
    
    listePorts();
    ov.affMsg("Port de départ :");
    Port p = rechPort();
    if(p==null){
        ov.affMsg("Port introuvable !");
        return;
    }
    ov.affPort(p);
    
    listePorts();
    ov.affMsg("Port d'arrivée :");
    Port p2 = rechPort();
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

public void modifSupSingle(){
    Bateau b = rechBateau();
    if(b==null){
        ov.affMsg("DéplacementBateau introuvable !");
        return;
    }
    ov.affBateau(b);
    String newSS = ov.getMsg("Nouveau supplément single : ");
    float newSupSingle = Float.parseFloat(newSS);
    String msg = om.modifSupSingle(b, newSupSingle);
    ov.affMsg(msg);
}

public void suppBateau(){
    Bateau b = rechBateau();
    if(b==null){
        ov.affMsg("Bateau introuvable !");
        return;
    }
    ov.affBateau(b);
    String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
    if(supp.equals("oui")){
        String msg = om.suppBateau(b);
        ov.affMsg(msg);
    }
    else ov.affMsg("Suppression annulée !");
        
}

public void suppPort(){
    Port p = rechPort();
    if(p==null){
        ov.affMsg("Port introuvable !");
        return;
    }
    ov.affPort(p);
    String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
    if(supp.equals("oui")){
        String msg = om.suppPort(p);
        ov.affMsg(msg);
    }
    else ov.affMsg("Suppression annulée !");
        
}

public void suppVol(){
    Vol v = rechVol();
    if(v==null){
        ov.affMsg("Vol introuvable !");
        return;
    }
    ov.affVol(v);
    String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
    if(supp.equals("oui")){
        String msg = om.suppVol(v);
        ov.affMsg(msg);
    }
    else ov.affMsg("Suppression annulée !");
        
}

public void suppAeroport(){
    Aeroport a = rechAeroport();
    if(a==null){
        ov.affMsg("Aéroport introuvable !");
        return;
    }
    ov.affAeroport(a);
    String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
    if(supp.equals("oui")){
        String msg = om.suppAeroport(a);
        ov.affMsg(msg);
    }
    else ov.affMsg("Suppression annulée !");
        
}

public Bateau rechBateau(){
    String codeBateau = ov.rechBateau();
    return om.getBateau(codeBateau);
}

public Port rechPort(){
    String codePort = ov.rechPort();
    return om.getPort(codePort);
}

public Vol rechVol(){
    String codeVol = ov.rechVol();
    return om.getVol(codeVol);
}

public Aeroport rechAeroport(){
    String codeAeroport = ov.rechAeroport();
    return om.getAeroport(codeAeroport);
}

public void listeBateaux(){
    
    List<Bateau> lb = om.tousBateaux();
    ov.affListe(lb);
    
}

public void listePorts(){
    
    List<Port> lp = om.tousPorts();
    ov.affListe(lp);
    
}

public void listeVols(){
    List<Vol> lv = om.tousVols();
    ov.affListe(lv);
}

public void listeAeroports(){
    List<Aeroport> la = om.tousAeroports();
    ov.affListe(la);
}


}