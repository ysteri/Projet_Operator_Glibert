package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Aeroport {

    /**
     * 
     */
    private String codeAeroport;

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
    public Aeroport(String codeAeroport,String nom, String ville,String pays){//constructeur complet
        this.codeAeroport=codeAeroport;
        this.nom=nom;
        this.ville=ville;
        this.pays=pays;
    }
 
    /**
     * @return
     */
    public String getCodeAeroport() {
        // TODO implement here
        return codeAeroport;
    }

    /**
     * 
     * @param codeAeroport 
     */
    public void setCodeAeroport(String codeAeroport) {
        // TODO implement here
        this.codeAeroport=codeAeroport;
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
        return "codeAeroport=" + codeAeroport + ", nom=" + nom + 
                ", ville=" + ville + ", pays=" + pays;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeAeroport);
        //hash = 23 * hash + Objects.hashCode(this.nom);
        //hash = 23 * hash + Objects.hashCode(this.ville);
        //hash = 23 * hash + Objects.hashCode(this.pays);
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
        if (!Objects.equals(this.codeAeroport, other.codeAeroport)) {
            return false;
        }
        return true;
    }

}