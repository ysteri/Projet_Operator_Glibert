/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.vue;

import operator.modele.Bateau;
import operator.modele.Port;
import operator.modele.Aeroport;
import operator.modele.Vol;
import java.util.*;
/**
 *
 * @author Thoma
 */
public class OperatorVue {
    private Scanner sc = new Scanner(System.in);
    
    public int menu(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Gestion des bateaux",
            "Gestion des ports",
            "Gestion des aéroports",
            "Gestion des vols",
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
    
    public int menuPort(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un port",
            "Afficher les ports",
            "Rechercher un port",
            "Supprimer un port",
            "Retour"));
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
    
    public int menuBateau(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un bateau",
            "Affilier un port",
            "Afficher les bateaux",
            "Rechercher un port",
            "Modifier le supplément single",
            "Supprimer un bateau",
            "Retour"));
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
    
    public int menuVol(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un vol",
            "Affilier un aéroport",
            "Afficher les vols",
            "Rechercher un vol",
            "Supprimer un vol",
            "Retour"));
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
    
    public int menuAeroport(){
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
            "Ajouter un aéroport",
            "Afficher les aéroports",
            "Rechercher un aéroport",
            "Supprimer un aéroport",
            "Retour"));
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
    
    public String rechPort(){
        String codePort;
        codePort = getMsg("Code du port : ");
        return codePort;
    }
            
    public String rechBateau(){
        String codeBateau;
        codeBateau = getMsg("Code du bateau : ");
        return codeBateau;
    }
    
    public String rechAeroport(){
        String codeAeroport;
        codeAeroport = getMsg("Code de l'aéroport : ");
        return codeAeroport;
    }
            
    public String rechVol(){
        String codeVol;
        codeVol = getMsg("Code du vol : ");
        return codeVol;
    }
    
    public Bateau encodeBateau(){
        
        String codeBateau = getMsg("Entrez le code du bateau : ");
        String supSingles = getMsg("Entrez le supplément single : ");
        float supSingle = Float.parseFloat(supSingles);
        Bateau b = new Bateau(codeBateau, supSingle);
        return b;
    }
    
    public Port encodePort(){
        String codePort = getMsg("Entrez le code du port : ");
        String ville = getMsg("Entrez la ville : ");
        String pays = getMsg("Entrez le pays : ");
        Port p = new Port(codePort, ville, pays);
        return p;
    }
    
    public Aeroport encodeAeroport(){
        System.out.println("Entrez le code de l'aéroport : ");
        String codeAeroport = sc.nextLine();
        System.out.println("Entrez le nom : ");
        String nom = sc.nextLine();
        System.out.println("Entrez la ville : ");
        String ville = sc.nextLine();
        System.out.println("Entrez le pays : ");
        String pays = sc.nextLine();
        Aeroport a = new Aeroport(codeAeroport, nom, ville, pays);
        return a;
    }
    
    public Vol encodeVol(){
        String codeVol = getMsg("Entrez le code du vol : ");
        Vol v = new Vol(codeVol);
        return v;
    }

    public void affBateau(Bateau b){
        affMsg("Code du bateau : "+b.getCodeBateau());
        affMsg("Supplément single : "+b.getSupSingle());
        affMsg("Port de départ : "+b.getDepartPort());
        affMsg("Port d'arrivée : "+b.getArriveePort());
    }
    
    public void affPort(Port p){
        affMsg("code du port : "+p.getCodePort());
        affMsg("Ville du port : "+p.getVille());
        affMsg("Pays du port : "+p.getPays());
    }
    
    public void affVol(Vol v){
        affMsg("Code du vol : "+v.getCodeVol());
        affMsg("Aéroport de départ : "+v.getDepartAeroport());
        affMsg("Aéroport d'arrivée : "+v.getArriveeAeroport());
    }
    
    public void affAeroport(Aeroport a){
        affMsg("Code de l'aéroport : "+a.getCodeAeroport());
        affMsg("Nom de l'aéroport : "+a.getNom());
        affMsg("Ville de l'aéroport : "+a.getVille());
        affMsg("Pays de l'aéroport : "+a.getPays());
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
