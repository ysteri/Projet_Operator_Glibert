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

    //regex
    public String codeRegex="([aA-zZ]*[0-9]*)";
    public String stringRegex="([aA-zZ]+ *-*)+";
    
    /**
     * Menu principal
     * @return retourne le choix
     */
    public int menu() {
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
                "Gestion des voyages",
                "Gestion des bateaux",
                "Gestion des ports",
                "Gestion des aéroports",
                "Gestion des vols",
                "Fin"));
        affListe(listeOptions);

        int choix;
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }

    /**
     * Menu des ports
     * @return retourne le choix
     */
    public int menuPort() {
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
                "Ajouter un port",
                "Afficher les ports",
                "Rechercher un port",
                "Supprimer un port",
                "Retour"));
        affListe(listeOptions);

        int choix;
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }

    /**
     * Menu des bateaux
     * @return retourne le choix
     */
    public int menuBateau() {
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
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }
   
    /**
     * menu des vols
     * @return retourne le choix
     */
    public int menuVol() {
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
                "Ajouter un vol",
                "Affilier un aéroport",
                "Afficher les vols",
                "Rechercher un vol",
                "Supprimer un vol",
                "Retour"));
        affListe(listeOptions);

        int choix;
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }

    /**
     * menu des aéroports
     * @return retourne le choix
     */
    public int menuAeroport() {
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
                "Ajouter un aéroport",
                "Afficher les aéroports",
                "Rechercher un aéroport",
                "Supprimer un aéroport",
                "Retour"));
        affListe(listeOptions);

        int choix;
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }
    
    /**
     * menu des voyages
     * @return retourne le choix
     */
    public int menuVoyage() {
        List<String> listeOptions = new ArrayList<>(Arrays.asList(
                "Ajouter un voyage",
                "Ajouter un déplacement",
                "Organiser un voyage",
                "Afficher les voyages",
                "Retour"));
        affListe(listeOptions);

        int choix;
        do {
            String choixs = getMsg("Votre choix : ");
            choix = Integer.parseInt(choixs);
            if (choix > 0 && choix <= listeOptions.size()) {
                break;
            }
            affMsg("choix incorrect");
        } while (true);
        return choix;
    }

    /**
     * méthode qui recherche un port
     * @return retourne un le code du port
     */
    public String rechPort() {
        String codePort;
        codePort = getMsg("Code du port : ");
        return codePort;
    }

    /**
     * méthode qui recherche un bateau
     * @return retourne le code du bateau
     */
    public String rechBateau() {
        String codeBateau;
        codeBateau = getMsg("Code du bateau : ");
        return codeBateau;
    }
    
    /**
     * méthode qui recherche un aéroport
     * @return retourne le code de l'aéroport
     */
    public String rechAeroport() {
        String codeAeroport;
        codeAeroport = getMsg("Code de l'aéroport : ");
        return codeAeroport;
    }

    /**
     * méthode qui recherche un vol
     * @return retourne le code du vol
     */
    public String rechVol() {
        String codeVol;
        codeVol = getMsg("Code du vol : ");
        return codeVol;
    }

    /**
     * méthode qui encore un bateau
     * @return retourne un bateau
     */
    public Bateau encodeBateau() {

        String codeBateau = getMsg("Entrez le code du bateau : ", codeRegex);
        String supSingles = getMsg("Entrez le supplément single : ");
        double supSingle = Double.parseDouble(supSingles);
        Bateau b = new Bateau(codeBateau, supSingle);
        return b;
    }

    /**
     * méthode qui encode un port
     * @return retourne un port
     */
    public Port encodePort() {
        String codePort = getMsg("Entrez le code du port : ", codeRegex);
        String ville = getMsg("Entrez la ville : ", stringRegex);
        String pays = getMsg("Entrez le pays : ", stringRegex);
        Port p = new Port(codePort, ville, pays);
        return p;
    }

    /**
     * méthode qui encode un aéroport
     * @return retourne un aéroport
     */
    public Aeroport encodeAeroport() {
        String codeAeroport = getMsg("Entrez le code du port : ", codeRegex);
        String nom = getMsg("Entrez le nom : ", stringRegex);
        String ville = getMsg("Entrez la ville : ", stringRegex);
        String pays = getMsg("Entrez le pays : ", stringRegex);
        Aeroport a = new Aeroport(codeAeroport, nom, ville, pays);
        return a;
    }

    /**
     * méthode qui encode un vol
     * @return retourne un vol
     */
    public Vol encodeVol() {
        String codeVol = getMsg("Entrez le code du vol : ", codeRegex);
        Vol v = new Vol(codeVol);
        return v;
    }

    /**
     * méthode qui affiche un bateau
     * @param b retourne un bateau
     */
    public void affBateau(Bateau b) {
        affMsg("Code du bateau : " + b.getCodeBateau());
        affMsg("Supplément single : " + b.getSupSingle());
        affMsg("Port de départ : " + b.getDepartPort());
        affMsg("Port d'arrivée : " + b.getArriveePort());
    }

    /**
     * méthode qui affiche un port
     * @param p retourne un port
     */
    public void affPort(Port p) {
        affMsg("code du port : " + p.getCodePort());
        affMsg("Ville du port : " + p.getVille());
        affMsg("Pays du port : " + p.getPays());
    }

    /**
     * méthode qui affiche un vol
     * @param v retourne un vol
     */
    public void affVol(Vol v) {
        affMsg("Code du vol : " + v.getCodeVol());
        affMsg("Aéroport de départ : " + v.getDepartAeroport());
        affMsg("Aéroport d'arrivée : " + v.getArriveeAeroport());
    }

    /**
     * méthode qui affiche aéroport
     * @param a retourne un aéroport
     */
    public void affAeroport(Aeroport a) {
        affMsg("Code de l'aéroport : " + a.getCodeAeroport());
        affMsg("Nom de l'aéroport : " + a.getNom());
        affMsg("Ville de l'aéroport : " + a.getVille());
        affMsg("Pays de l'aéroport : " + a.getPays());
    }

    /**
     * méthode qui récupère une saisie
     * @return retourne un String
     */
    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }

    /**
     * méthode qui affiche un message
     * @param msg message
     */
    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    /**
     * Surcharge de la classe getMsg()
     * @param msg message
     * @return retourne String
     */
    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }

    /**
     * méthode qui affiche une liste numérotée
     * @param liste Liste
     */
    public void affListe(Collection liste) {
        int i = 1;
        for (Object o : liste) {
            affMsg((i++) + "." + o);
        }
    }
    
    public String getMsg(String msg, String regex){
        Scanner scan = new Scanner(System.in);
        boolean flag = false;
        String message = null;
        do{
            affMsg(msg);
            message=scan.nextLine();
            
            if(message.matches(regex)){
                flag = true;
            }else{
                affMsg("Incorrect, réessayez ");
            }
        }while(!flag);
        return message;
    }

}
