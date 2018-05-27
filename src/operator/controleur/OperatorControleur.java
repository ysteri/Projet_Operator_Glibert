/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.controleur;

import operator.modele.OperatorModele;
import operator.vue.OperatorVue;
import java.util.*;
import operator.modele.*;


/**
 *
 * @author Thoma
 */
public class OperatorControleur {

    private OperatorModele om = null;
    private OperatorVue ov = null;

    /**
     * Constructeur par défaut
     */
    public OperatorControleur() {

    }

    /**
     * Constructeur complet
     * @param om classe modele
     * @param ov class vue
     */
    public OperatorControleur(OperatorModele om, OperatorVue ov) {
        this.om = om;
        this.ov = ov;
    }

    /**
     * Gestion du menu des sous-menus
     */
    public void gestion() {
        int choix;
        do {
            choix = ov.menu();
            switch (choix) {
                case 1:
                    gestionVoyage();
                    break;
                case 2:
                    gestionBateau();
                    break;
                case 3:
                    gestionPort();
                    break;
                case 4:
                    gestionVol();
                    break;
                case 5:
                    gestionAeroport();
                    break;
                case 6:
                    ov.affMsg("Aurevoir !");
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 6);
    }

    /**
     * Gestion du menu des bateaux
     */
    public void gestionBateau() {
        int choix;
        do {
            choix = ov.menuBateau();
            switch (choix) {
                case 1://ajouter
                    ajoutBateau();
                    break;
                case 2://affilier un port
                    affilierPort();
                    break;
                case 3://afficher
                    listeBateaux();
                    break;
                case 4://recherche spécifique
                    rechBateau();
                    break;
                case 5://modifier le supplément single
                    modifSupSingle();
                    break;
                case 6://supprimer
                    suppBateau();
                    break;
                case 7://retour
                    ov.affMsg("Retour au menu principal !");
                    ov.menu();
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 7);
    }

    /**
     * Gestion du menu des ports
     */
    public void gestionPort() {
        int choix;
        do {
            choix = ov.menuPort();
            switch (choix) {
                case 1://ajouter
                    ajoutPort();
                    break;
                case 2://afficher
                    listePorts();
                    break;
                case 3://rechercher
                    rechPort();
                    break;
                case 4://supprimer
                    suppPort();
                    break;
                case 5://retour
                    ov.affMsg("Retour au menu principal !");
                    ov.menu();
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 5);
    }

    /**
     * Gestion du menu des vols
     */
    public void gestionVol() {
        int choix;
        do {
            choix = ov.menuVol();
            switch (choix) {
                case 1://ajouter
                    ajoutVol();
                    break;
                case 2://affilier un aéroport
                    affilierAeroport();
                    break;
                case 3://afficher
                    listeVols();
                    break;
                case 4://rechercher
                    rechVol();
                    break;
                case 5://supprimer
                    suppVol();
                    break;
                case 6://retour
                    ov.affMsg("Retour au menu principal !");
                    ov.menu();
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 6);
    }

    /**
     * Gestion du menu des aéroports
     */
    public void gestionAeroport() {
        int choix;
        do {
            choix = ov.menuAeroport();
            switch (choix) {
                case 1://ajouter
                    ajoutAeroport();
                    break;
                case 2://afficher
                    listeAeroports();
                    break;
                case 3://rechercher
                    rechAeroport();
                    break;
                case 4://supprimer
                    suppAeroport();
                    break;
                case 5://retour
                    ov.affMsg("Retour au menu principal !");
                    ov.menu();
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 5);
    }
    
    /**
     * Gestion du menu des voyages
     */
    public void gestionVoyage() {
        int choix;
        do {
            choix = ov.menuVoyage();
            switch (choix) {
                case 1://ajouter
                    //ajoutVoyage();
                    break;
                case 2://ajouter
                    //ajoutDeplacement();
                    break;
                case 3://affilier
                    //OrganiserVoyage();
                    break;
                case 4://afficher
                    //ListeVoyages();
                    break;
                case 5://retour
                    ov.affMsg("Retour au menu principal !");
                    ov.menu();
                    break;
                default:
                    ov.affMsg("Choix incorrect !");
            }
        } while (choix != 5);
    }

    /**
     * Méthode qui ajoute un bateau
     */
    public void ajoutBateau() {
        Bateau b = ov.encodeBateau();
        String msg = om.ajouterBateau(b);
        ov.affMsg(msg);
    }

    /**
     * méthode qui ajoute un port
     */
    public void ajoutPort() {
        Port p = ov.encodePort();
        String msg = om.ajouterPort(p);
        ov.affMsg(msg);
    }

    /**
     * méthode qui ajoute un aéroport
     */
    public void ajoutAeroport() {
        Aeroport a = ov.encodeAeroport();
        String msg = om.ajouterAeroport(a);
        ov.affMsg(msg);
    }

    /**
     * méthode qui ajoute un vol
     */
    public void ajoutVol() {
        Vol v = ov.encodeVol();
        String msg = om.ajouterVol(v);
        ov.affMsg(msg);
    }

    /**
     * méthode qui associe un port à un bateau
     */
    public void affilierPort() {
        listeBateaux();
        Bateau b = rechBateau();
        if (b == null) {
            ov.affMsg("Bateau introuvable !");
            return;
        }
        ov.affBateau(b);

        listePorts();
        ov.affMsg("Port de départ :");
        Port p = rechPort();
        if (p == null) {
            ov.affMsg("Port introuvable !");
            return;
        }
        ov.affPort(p);

        listePorts();
        ov.affMsg("Port d'arrivée :");
        Port p2 = rechPort();
        if (p2 == null) {
            ov.affMsg("Port introuvable !");
            return;
        } else {
            if (p2.equals(p)) {
                ov.affMsg("Vous ne pouvez pas choisir le même port");
                return;
            }
        }
        ov.affPort(p2);
        String msg = om.affilierPort(b, p, p2);
        ov.affMsg(msg);
    }

    /**
     * méthode qui associe un aéroport à un vol
     */
    public void affilierAeroport() {
        listeVols();
        Bateau b = rechBateau();
        if (b == null) {
            ov.affMsg("Bateau introuvable !");
            return;
        }
        ov.affBateau(b);

        listePorts();
        ov.affMsg("Port de départ :");
        Port p = rechPort();
        if (p == null) {
            ov.affMsg("Port introuvable !");
            return;
        }
        ov.affPort(p);

        listePorts();
        ov.affMsg("Port d'arrivée :");
        Port p2 = rechPort();
        if (p2 == null) {
            ov.affMsg("Port introuvable !");
            return;
        } else {
            if (p2.equals(p)) {
                ov.affMsg("Vous ne pouvez pas choisir le même port");
                return;
            }
        }
        ov.affPort(p2);
        String msg = om.affilierPort(b, p, p2);
        ov.affMsg(msg);
    }

    /**
     * méthode qui modifie le supplément single d'un bateau
     */
    public void modifSupSingle() {
        Bateau b = rechBateau();
        if (b == null) {
            ov.affMsg("DéplacementBateau introuvable !");
            return;
        }
        ov.affBateau(b);
        String newSS = ov.getMsg("Nouveau supplément single : ");
        float newSupSingle = Float.parseFloat(newSS);
        String msg = om.modifSupSingle(b, newSupSingle);
        ov.affMsg(msg);
    }

    /**
     * méthode qui supprime un bateau
     */
    public void suppBateau() {
        Bateau b = rechBateau();
        if (b == null) {
            ov.affMsg("Bateau introuvable !");
            return;
        }
        ov.affBateau(b);
        String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
        if (supp.equals("oui")) {
            String msg = om.suppBateau(b);
            ov.affMsg(msg);
        } else {
            ov.affMsg("Suppression annulée !");
        }

    }

    /**
     * méthode qui supprime un port
     */
    public void suppPort() {
        Port p = rechPort();
        if (p == null) {
            ov.affMsg("Port introuvable !");
            return;
        }
        ov.affPort(p);
        String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
        if (supp.equals("oui")) {
            String msg = om.suppPort(p);
            ov.affMsg(msg);
        } else {
            ov.affMsg("Suppression annulée !");
        }

    }

    /**
     * méthode qui supprime un vol
     */
    public void suppVol() {
        Vol v = rechVol();
        if (v == null) {
            ov.affMsg("Vol introuvable !");
            return;
        }
        ov.affVol(v);
        String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
        if (supp.equals("oui")) {
            String msg = om.suppVol(v);
            ov.affMsg(msg);
        } else {
            ov.affMsg("Suppression annulée !");
        }

    }

    /**
     * méthode qui supprime un aéroport
     */
    public void suppAeroport() {
        Aeroport a = rechAeroport();
        if (a == null) {
            ov.affMsg("Aéroport introuvable !");
            return;
        }
        ov.affAeroport(a);
        String supp = ov.getMsg("êtes-vous sur de vouloir le supprimer? oui/non");
        if (supp.equals("oui")) {
            String msg = om.suppAeroport(a);
            ov.affMsg(msg);
        } else {
            ov.affMsg("Suppression annulée !");
        }

    }

    /**
     * méthode qui recherche un bateau
     * @return retourne un bateau
     */
    public Bateau rechBateau() {
        String codeBateau = ov.rechBateau();
        return om.getBateau(codeBateau);
    }

    /**
     * méthode qui recherche un port
     * @return retourne un port
     */
    public Port rechPort() {
        String codePort = ov.rechPort();
        return om.getPort(codePort);
    }

    /**
     * méthode qui recherche un vol
     * @return retourne un vol
     */
    public Vol rechVol() {
        String codeVol = ov.rechVol();
        return om.getVol(codeVol);
    }

    /**
     * méthode qui recherche un aéroport
     * @return retourne un aéroport
     */
    public Aeroport rechAeroport() {
        String codeAeroport = ov.rechAeroport();
        return om.getAeroport(codeAeroport);
    }

    /**
     * méthode qui affiche la liste des bateaux
     */
    public void listeBateaux() {

        List<Bateau> lb = om.tousBateaux();
        ov.affListe(lb);

    }

    /**
     * méthode qui affiche la liste des ports
     */
    public void listePorts() {

        List<Port> lp = om.tousPorts();
        ov.affListe(lp);

    }

    /**
     * méthode qui affiche la liste des vols
     */
    public void listeVols() {
        List<Vol> lv = om.tousVols();
        ov.affListe(lv);
    }

    /**
     * méthode qui affiche la liste des aéroports
     */
    public void listeAeroports() {
        List<Aeroport> la = om.tousAeroports();
        ov.affListe(la);
    }

}
