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
    protected List<Bateau> mesBateaux = new ArrayList<>();
    /**
     * liste de tous les ports
     */
    protected List<Port> mesPorts = new ArrayList<>();
    
    protected List<Vol> mesVols = new ArrayList<>();
    
    protected List<Aeroport> mesAeroports = new ArrayList<>();
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
    public String ajouterBateau(Bateau b){
        if(b==null)return "Bateau null !";
        if(mesBateaux.contains(b)){
            Log lg=Log.getInstance();
            lg.ajouter("Refus de l'ajout de "+b+" !");
            return "Bateau déjà Enregistré !";
        }
        mesBateaux.add(b);
        Log lg=Log.getInstance();
        lg.ajouter("Bateau "+b+" enregistré !");
        return "Ajout bateau effectué !";
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
    
    public String ajouterAeroport(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("informations obligatoires : ");
        System.out.println("Code de l'aéroport : ");
        String codeAeroport = sc.nextLine();
        
        System.out.println("informations facultatives :");
        System.out.println("Nom : ");
        String nom = sc.nextLine();
        System.out.println("ville : ");
        String ville = sc.nextLine();
        System.out.println("pays : ");
        String pays = sc.nextLine();
        
        return "ajout aéroport effectué !";
        
    }
    /**
     * méthode permettant de retrouver tous les voyages en bateau
     * @return tous les voyages en bateau
     */
    public List<Bateau> tousBateaux(){
        mesBateaux.sort(new CodeBateauComparator());
        return mesBateaux;
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
    public Bateau getBateau(String codeBateau){
        Bateau b = new Bateau(codeBateau);
        int containt = mesBateaux.indexOf(b);
        if(containt<0)return null;
        else return mesBateaux.get(containt);
    }
    /**
     * méthode permettant de trouver un port sur base de son code
     * @param codePort object encapsulant le code
     * @return port trouvé ou null si aucun ne correspond
     */
    public Port getPort(String codePort){
        Port p = new Port(codePort);
        int containt = mesPorts.indexOf(p);
        if(containt<0)return null;
        else return mesPorts.get(containt);
    }
    
    public String affilierPort(Bateau b, Port p, Port p2){
        b.setDepartPort(p);
        b.setArriveePort(p2);
        return "Affiliation des ports effectuée !";
    }
    
    /**
     * méthode permettant de changer le supplément single d'un voyage en bateau
     * @param b voyage en bateau dont on désire changer le supplément single
     * @param supSingle nouveau supplément single
     * @return diagnostic de la modification
     */
    public String modifSupSingle(Bateau b,double supSingle){
        b.setSupSingle(supSingle);
        return "changement du supplément single effectué !";
    }
    
    /**
     * méthode permettant de supprimer un voyage en bateau
     * @param b voyage en bateau à supprimer
     * @return diagnostic de la suppression
     */
    public String suppBateau(Bateau b){
        boolean ok = mesBateaux.remove(b);
        if(ok) return "Bateau supprimé !";
        else return "Bateau introuvable ou suppression impossible !";
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
    
    public void populateAeroportVol(){
       mesVols.addAll(Arrays.asList(
               new Vol("Vol1",new Aeroport("Ae1","Air-Line","Bruxelles","Belgique"),new Aeroport("Ae2","Fresh","Paris","France")),
               new Vol("Vol2",new Aeroport("Ae3","Race","Dublin","Allemagne"),new Aeroport("Ae4","Sublime","Amsterdam","Pays-Bas")),
               new Vol("Vol3",new Aeroport("Ae5","Tencent","Rome","Italie"),new Aeroport("Ae6","Zerial","Barcelone","Espagne")))
               );
       mesAeroports.addAll(Arrays.asList(
               new Aeroport("Ae1","Air-Line","Bruxelles","Belgique"),
               new Aeroport("Ae2","Fresh","Paris","France"),
               new Aeroport("Ae3","Race","Dublin","Allemagne"),
               new Aeroport("Ae4","Sublime","Amsterdam","Pays-Bas"),
               new Aeroport("Ae5","Tencent","Rome","Italie"),
               new Aeroport("Ae6","Zerial","Barcelone","Espagne"))
       );
   }
   
   public void populatePort(){
        mesPorts.addAll(Arrays.asList(           
            new Port("A1","Marseille","France"),
            new Port("A2","Paris","France"),
            new Port("A3","Dijon","France"),
            new Port("A4","Maubeuge","France"),
            new Port("A5","Bordeaux","France"),
            new Port("A6","Bruxelles","Belgique"),
            new Port("A7","Mons","Belgique"),
            new Port("A8","Anvers","Belgique"),
            new Port("A9","Charleroi","Belgique"),
            new Port("A10","Gant","Belgique"))
            );
    }

}
