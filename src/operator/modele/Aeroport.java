package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Aeroport {

    /**
     * 
     */
    private String code_aéroport;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String ville;

    /**
     * 
     */
    private String pays;

    public Aeroport() {
        //constructeur par défaut
    }
    public Aeroport(String code_aéroport,String nom, String ville,String pays){//constructeur complet
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
     * 
     * @param code_aéroport 
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
     * 
     * @param nom 
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
     * 
     * @param ville 
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
     * 
     * @param pays 
     */
    public void setPays(String pays) {
        // TODO implement here
        this.pays=pays;
    }
    
     @Override
    public String toString() {
        return "code_aéroport=" + code_aéroport + ", nom=" + nom + 
                ", ville=" + ville + ", pays=" + pays;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code_aéroport);
        hash = 23 * hash + Objects.hashCode(this.nom);
        hash = 23 * hash + Objects.hashCode(this.ville);
        hash = 23 * hash + Objects.hashCode(this.pays);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aeroport other = (Aeroport) obj;
        if (!Objects.equals(this.code_aéroport, other.code_aéroport)) {
            return false;
        }
        return true;
    }

}