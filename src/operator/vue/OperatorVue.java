/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.vue;

import operator.modele.Bateau;
import operator.modele.Port;
import operator.controleur.OperatorControleur;
import java.util.*;
/**
 *
 * @author Thoma
 */
public class OperatorVue {
    private Scanner sc = new Scanner(System.in);
    private OperatorControleur oc = null;
    
    public int menu(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un déplacement par bateau",
            "Ajouter un port",
            "Afficher les déplacements par bateau",
            "Afficher les ports",
            "Modifier le supplément single",
            "Supprimer un DéplacementBateau",
            "Fin"));
        affListe(listeOptions);
        
        int choix;
        do{
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <=listeOptions.size()){
                break;
            }
            affMsg("choix incorrect");
        }while(true);
        return choix;
    }
    
    public String rechercherPort(){
        String codePort;
        codePort = getMsg("Code du port : ");
        return codePort;
    }
            
    public String rechercherDeplacementBateau(){
        String codeBateau;
        codeBateau = getMsg("Code du DéplacementBateau : ");
        return codeBateau;
    }
    
    public Bateau encodeDeplacementBateau(){
        
        String codeBateau = getMsg("Entrez le code du DéplacementBateau : ");
        String supSingles = getMsg("Entrez le supplément single : ");
        float supSingle = Float.parseFloat(supSingles);
        String departPort = getMsg("Entrez le port de départ : ");
        String arriveePort = getMsg("Entrez le port d'arrivée : ");
        Bateau b = new Bateau(codeBateau, supSingle,departPort,arriveePort);
        return b;
    }
    
    public Port encodePort(){
        String codePort = getMsg("Entrez le code du port : ");
        String ville = getMsg("Entrez la ville : ");
        String pays = getMsg("Entrez le pays : ");
        Port p = new Port(codePort, ville, pays);
        return p;
    }
    
    public void affDeplacementBateau(Bateau b){
        affMsg("Code du deplacement en bateau : "+b.getCodeBateau());
        affMsg("Supplément single : "+b.getSupSingle());
        affMsg("Port de départ : "+b.getDepartPort());
        affMsg("Port d'arrivée : "+b.getArriveePort());
    }
    
    public void affPort(Port p){
        affMsg("code du port : "+p.getCodePort());
        affMsg("Ville du port : "+p.getVille());
        affMsg("Pays du port : "+p.getPays());
    }
    
    public String getMsg(){
        String msg = sc.nextLine();
        return msg;
    }

    public void affMsg(Object msg){
        System.out.println(msg);
    }
    
    public String getMsg(String msg){//surcharge de la méthode getMsg
            affMsg(msg);
            return getMsg();
    }
    
    public void affListe(Collection liste){
        int i=1;
        for(Object o : liste){
            affMsg((i++)+"." + o);
        }
    }

}
