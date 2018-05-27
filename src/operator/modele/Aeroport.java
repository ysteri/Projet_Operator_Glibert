package operator.modele;

import java.util.*;

/**
 * @author Thomas
 */
public class Aeroport {

    /**
     *variable alphanumérique contenant le code
     */
    private String codeAeroport;

    /**
     *variable String contenant le nom
     */
    private String nom;

    /**
     *variable String contenant la ville
     */
    private String ville;

    /**
     *variable String contenant le pays
     */
    private String pays;

    /**
     * constructeur builder
     * @param ab aeroport builder
     */
    private Aeroport(AeroportBuilder ab) {
        this.codeAeroport = ab.codeAeroport;
        this.nom = ab.nom;
        this.ville = ab.ville;
        this.pays = ab.pays;
    }

    /**
     * constructeur par défaut
     */
    public Aeroport() {
 
    }

    /**
     * constructeur complet
     * @param codeAeroport
     * @param nom
     * @param ville
     * @param pays 
     */
    public Aeroport(String codeAeroport, String nom, String ville, String pays) {//constructeur complet
        this.codeAeroport = codeAeroport;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
    }

    /**
     * constructeur de recherche
     * @param codeAeroport 
     */
    public Aeroport(String codeAeroport) {//constructeur rech
        this.codeAeroport = codeAeroport;
    }

    /**
     * méthode qui récupère le code de l'aéroport
     * @return le code de l'aéroport
     */
    public String getCodeAeroport() {
        // TODO implement here
        return codeAeroport;
    }

    /**
     * méthode qui récupère le nom
     * @return nom
     */
    public String getNom() {
        // TODO implement here
        return nom;
    }

    /**
     * méthode qui récupère la ville
     * @return ville
     */
    public String getVille() {
        // TODO implement here
        return ville;
    }

    /**
     * méthode qui récupère le pays
     * @return pays
     */
    public String getPays() {
        // TODO implement here
        return pays;
    }

    /**
     * méthode qui affiche les infos de l'aéroport
     * @return infos
     */
    @Override
    public String toString() {
        return "codeAeroport=" + codeAeroport + ", nom=" + nom
                + ", ville=" + ville + ", pays=" + pays;
    }

    /**
     * builder de la classe
     */
    public static class AeroportBuilder {

        private String codeAeroport;
        private String nom;
        private String ville;
        private String pays;

        public AeroportBuilder() {
        }

        public AeroportBuilder setCodeAeroport(String codeAeroport) {
            this.codeAeroport = codeAeroport;
            return this;
        }

        public AeroportBuilder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public AeroportBuilder setVille(String ville) {
            this.ville = ville;
            return this;
        }

        public AeroportBuilder setPays(String pays) {
            this.pays = pays;
            return this;
        }

        public Aeroport build() throws Exception {
            if (codeAeroport == null) {
                throw new Exception("informations de base manquantes");
            }
            if (nom.trim().equals("")) {
                throw new Exception("informations de base manquantes");
            }
            return new Aeroport(this);
        }
    }

    /**
     * méthode redéfinie qui donne un hashcode aux variables du constructeur
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeAeroport);
        //hash = 23 * hash + Objects.hashCode(this.nom);
        //hash = 23 * hash + Objects.hashCode(this.ville);
        //hash = 23 * hash + Objects.hashCode(this.pays);
        return hash;
    }

    /**
     * méthode redéfinie qui compare des objets en paramètre
     *
     * @param obj
     * @return
     */
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
