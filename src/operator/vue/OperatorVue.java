/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.vue;

import operator.modele.Bateau;
import operator.modele.Port;
import java.util.*;
/**
 *
 * @author Thoma
 */
public class OperatorVue {
    private Scanner sc = new Scanner(System.in);
    
    public int menu(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un déplacement par bateau",
            "Ajouter un port",
            "Afficher les déplacements par bateau",
            "Afficher les ports",
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
    
    public Bateau encodeDeplacementBateau(){
        
        String codeBateau = getMsg("Entrez le code du DéplacementBateau : ");
        String supSingles = getMsg("Entrez le supplément single : ");
        float supSingle = Float.parseFloat(supSingles);
        String departPort = getMsg("Entrez le port de départ : ");
        String arriveePort = getMsg("Entrez le port d'arrivée : ");
        Bateau b = new Bateau(codeBateau, supSingle, departPort, arriveePort);
        return b;
    }
    
    public Port encodePort(){
        String codePort = getMsg("Entrez le code du port : ");
        String ville = getMsg("Entrez la ville : ");
        String pays = getMsg("Entrez le pays : ");
        Port p = new Port(codePort, ville, pays);
        return p;
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
