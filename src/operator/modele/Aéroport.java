package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Aéroport {

    /**
     * Default constructor
     */
       /**
     * 
     */
    protected String code_aéroport;

    /**
     * 
     */
    protected String nom;

    /**
     * 
     */
    protected String ville;

    /**
     * 
     */
    protected String pays;

    public Aéroport() {
        //constructeur par défaut
    }
    public Aéroport(String code_aéroport,String nom, String ville,String pays){//constructeur complet
        this.code_aéroport=code_aéroport;
        this.nom=nom;
        this.ville=ville;
        this.pays=pays;
    }
 
    /**
     * @return
     */
    public String getCode_aéroport() {
        // TODO implement here
        return code_aéroport;
    }

    /**
     * @param value
     */
    public void setCode_aéroport(String code_aéroport) {
        // TODO implement here
        this.code_aéroport=code_aéroport;
    }

    /**
     * @return
     */
    public String getNom() {
        // TODO implement here
        return nom;
    }

    /**
     * @param value
     */
    public void setNom (String nom) {
        // TODO implement here
        this.nom=nom;
    }

    /**
     * @return
     */
    public String getVille() {
        // TODO implement here
        return ville;
    }

    /**
     * @param value
     */
    public void setVille(String ville) {
        // TODO implement here
        this.ville=ville;
    }

    /**
     * @return
     */
    public String getPays() {
        // TODO implement here
        return pays;
    }

    /**
     * @param value
     */
    public void setPays(String pays) {
        // TODO implement here
        this.pays=pays;
    }

}