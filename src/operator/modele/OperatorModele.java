/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;

import java.util.*;
import operator.main.Log;
/**
 *
 * @author Thoma
 */

public class OperatorModele {
    protected List<Bateau> mesDeplacementsBateau = new ArrayList<>();
    protected List<Port> mesPorts = new ArrayList<>();
    
    
    public OperatorModele(){
        //constructeur par défaut
    }
    
    public String ajouterDeplacementBateau(Bateau b){
        if(b==null)return "DéplacementBateau nul !";
        if(mesDeplacementsBateau.contains(b)){
            Log lg=Log.getInstance();
            lg.ajouter("Refus de l'ajout de "+b+" !");
            return "DéplacementBateau déjà Enregistré !";
        }
        mesDeplacementsBateau.add(b);
        Log lg=Log.getInstance();
        lg.ajouter("DéplacementBateau "+b+" enregistré !");
        return "Ajout DéplacementBateau effectué !";
    }
    
    public String ajouterPort(Port p){
        if(p==null)return "Port nul !";
        if(mesPorts.contains(p)){
            Log lg=Log.getInstance();
            lg.ajouter("Refus de l'ajout de "+p+" !");
            return "Port déjà enregistré !";
        }
        mesPorts.add(p);
        Log lg=Log.getInstance();
        lg.ajouter("Port "+p+" enregistré !");
        return "Ajout port effectué !";
    }
    
    public List<Bateau> tousDeplacementsBateau(){
        mesDeplacementsBateau.sort(new CodeDeplacementBateauComparator());
        return mesDeplacementsBateau;
    }
    
    public List<Port> tousPorts(){
        mesPorts.sort(new CodePortComparator());
        return mesPorts;
    }
    
    public Bateau getDeplacementBateau(String codeBateau){
        Bateau b = new Bateau();
        b.setCodeBateau(codeBateau);
        int containt = mesDeplacementsBateau.indexOf(b.getCodeBateau());
        if(containt<0)return null;
        else return mesDeplacementsBateau.get(containt);
    }
    

    
    public Port getPort(String codePort){
        Port p = new Port(codePort);
        int containt = mesPorts.indexOf(p.getCodePort());
        if(containt<0)return null;
        else return mesPorts.get(containt);
    }
    
    public String modifierSupSingle(Bateau b,float SupSingle){
        b.setSupSingle(SupSingle);
        return "changement du supplément single effectué !";
    }
    
    public String suppDeplacementBateau(Bateau b){
        boolean ok = mesDeplacementsBateau.remove(b);
        if(ok) return "DeplacementBateau supprimé !";
        else return "voiture introuvable ou suppression impossible !";
    }
    
    public String suppPort(Port p){
        boolean ok = mesPorts.remove(p);
        if(ok) return "Port supprimé !";
        else return "Port introuvable ou suppression impossible !";
    }
}
