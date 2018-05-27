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

    private Aeroport(AeroportBuilder ab) {
        this.codeAeroport = ab.codeAeroport;
        this.nom = ab.nom;
        this.ville = ab.ville;
        this.pays = ab.pays;
    }

    public Aeroport() {
        //constructeur par défaut
    }

    public Aeroport(String codeAeroport, String nom, String ville, String pays) {//constructeur complet
        this.codeAeroport = codeAeroport;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
    }

    public Aeroport(String codeAeroport) {//constructeur rech
        this.codeAeroport = codeAeroport;
    }

    /**
     * @return
     */
    public String getCodeAeroport() {
        // TODO implement here
        return codeAeroport;
    }

    /**
     * @return
     */
    public String getNom() {
        // TODO implement here
        return nom;
    }

    /**
     * @return
     */
    public String getVille() {
        // TODO implement here
        return ville;
    }

    /**
     * @return
     */
    public String getPays() {
        // TODO implement here
        return pays;
    }

    @Override
    public String toString() {
        return "codeAeroport=" + codeAeroport + ", nom=" + nom
                + ", ville=" + ville + ", pays=" + pays;
    }

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
