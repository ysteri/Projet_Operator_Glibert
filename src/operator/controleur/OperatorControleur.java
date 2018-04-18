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
                ajoutDeplacementBateau();
                break;
            case 2:
                ajoutPort();
                break;
            case 3:/*
                listeDeplacementBateau();
                */
                break;
            case 4:
                /*
                listePort();
                */
                break;
            case 5:
                ov.affMsg("Aurevoir !");
                break;
            default:
                ov.affMsg("Choix incorrect !");
        }
    }while(choix != 5);
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

public void listeDeplacementsBateau(){
    /*
    List<Bateau> lb = om.tousDeplacementsBateau();
    ov.affListe(lp);
    */
}

public void listePorts(){
    /*
    List<Port> lp = om.tousPorts();
    ov.affListe(lp);
    */
}



}