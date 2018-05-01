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
    /**
     * liste de tous les voyages en bateau
     */
    protected List<Bateau> mesDeplacementsBateau = new ArrayList<>();
    /**
     * liste de tous les ports
     */
    protected List<Port> mesPorts = new ArrayList<>();
    
    /**
     * constructeur par défaut
     */
    public OperatorModele(){
    }
    /**
     * méthode permettant l'ajout d'un voyage en bateau
     * @param b voyage en bateau à ajouter
     * @return diagnostic de l'ajout
     */
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
    /**
     * méthode permettant l'ajout d'un port
     * @param p port à ajouter
     * @return diagnostic de l'ajout
     */
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
    /**
     * méthode permettant de retrouver tous les voyages en bateau
     * @return tous les voyages en bateau
     */
    public List<Bateau> tousDeplacementsBateau(){
        mesDeplacementsBateau.sort(new CodeDeplacementBateauComparator());
        return mesDeplacementsBateau;
    }
    /**
     * méthode permettant de retrouver tous les ports
     * @return tous les ports
     */
    public List<Port> tousPorts(){
        mesPorts.sort(new CodePortComparator());
        return mesPorts;
    }
    /**
     * méthode permettant de trouver un voyage en bateau sur base de son code
     * @param codeBateau object encapsulant le code 
     * @return voyage en bateau trouvé ou null si aucun ne correspond
     */
    public Bateau getDeplacementBateau(String codeBateau){
        Bateau b = new Bateau(codeBateau);
        int containt = mesDeplacementsBateau.indexOf(b);
        if(containt<0)return null;
        else return mesDeplacementsBateau.get(containt);
    }
    /**
     * méthode permettant de trouver un port sur base de son code
     * @param codePort object encapsulant le code
     * @return port trouvé ou null si aucun ne correspond
     */
    public Port getPort(String codePort){
        Port p = new Port(codePort);
        int containt = mesPorts.indexOf(p.getCodePort());
        if(containt<0)return null;
        else return mesPorts.get(containt);
    }
    /**
     * méthode permettant de changer le supplément single d'un voyage en bateau
     * @param b voyage en bateau dont on désire changer le supplément single
     * @param supSingle nouveau supplément single
     * @return diagnostic de la modification
     */
    public String modifierSupSingle(Bateau b,float supSingle){
        b.setSupSingle(supSingle);
        return "changement du supplément single effectué !";
    }
    
    boolean modifbatMax(Port p,int batMax){
        if(batMax<0||batMax>1000)return false;
        p.setBatMax(batMax);
        return true;
    }
    /**
     * méthode permettant de supprimer un voyage en bateau
     * @param b voyage en bateau à supprimer
     * @return diagnostic de la suppression
     */
    public String suppDeplacementBateau(Bateau b){
        boolean ok = mesDeplacementsBateau.remove(b);
        if(ok) return "DeplacementBateau supprimé !";
        else return "DeplacementBateau introuvable ou suppression impossible !";
    }
    /**
     * méthode permettant de supprimer un port
     * @param p port à supprimer
     * @return diagnostic de la suppression
     */
    public String suppPort(Port p){
        boolean ok = mesPorts.remove(p);
        if(ok) return "Port supprimé !";
        else return "Port introuvable ou suppression impossible !";
    }
    
    /*public void populate(){
       mesVoitures.addAll(Arrays.asList(
               new Voiture("AXR345","Citroën","c3",2010,105000,3500),
               new Voiture("BZR443","VW","Passat",2008,205000,5000),
               new Voiture("XYZ322","Kia","Rio",2012,80000,4000))
               );
       mesClients.addAll(Arrays.asList(
               new Client("Lenoir","Eric","0456778899","Mons"),
               new Client("Levert","Aline","0478223344","BXL"),
               new Client("Lerouge","Carine","0498662277","La Louvière"))
       );
       mesVoitures.get(1).vendre(mesClients.get(2));
       
       
   }
*/
}
