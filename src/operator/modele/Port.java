package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Port {
    
    /**
     * variable du code alphanumérique d'un port
     */
    private String codePort;

    /**
     * variable qui contient la ville du port
     */
    private String ville;

    /**
     * variable qui contient le pays du port
     */
    private String pays;

    /**
     * constructeur par défaut
     */
    public Port() {
    }
    /**
     * constructeur de recherche
     * @param codePort 
     */
    public Port(String codePort){
        this.codePort=codePort;
    }
    /**
     * constructeur d'ajout
     * @param codePort
     * @param ville
     * @param pays 
     */
    public Port(String codePort, String ville, String pays){//constructeur complet
        this.codePort=codePort;
        this.ville=ville;
        this.pays=pays;
    }
    
    /**
     * méthode qui retourne le code du port
     * @return le code du port
     */
    public String getCodePort() {
        // TODO implement here
        return codePort;
    }

    /**
     * établi un nouveau code pour le port
     * @param codePort le code du port
     */
    public void setCodePort(String codePort) {
        // TODO implement here
        this.codePort=codePort;
    }

    /**
     * méthode qui retourne la ville du port
     * @return la ville du port
     */
    public String getVille() {
        // TODO implement here
        return ville;
    }

    /**
     * établi une nouvelle ville pour le port
     * @param ville 
     */
    public void setVille(String ville) {
        // TODO implement here
        this.ville=ville;
    }

    /**
     * méthode qui retourne le pays du port
     * @return le pays du port
     */
    public String getPays() {
        // TODO implement here
        return pays;
    }

    /**
     * établi un nouveau pays pour le port
     * @param pays 
     */
    public void setPays(String pays) {
        // TODO implement here
        this.pays=pays;
    }
    /**
     * méthode redéfinie qui affiche les variables du constructeur
     * @return 
     */
    @Override
    public String toString() {
        return "code_port=" + codePort + ", ville=" + ville + ", pays=" + pays;              
    }
    /**
     * méthode redéfinie qui associe un hashcode aux variables du constructeur
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codePort);
        //hash = 23 * hash + Objects.hashCode(this.ville);
        //hash = 23 * hash + Objects.hashCode(this.pays);
        return hash;
    }
    /**
     * méthode redéfinie qui compare des objets d'une classe
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
        final Port other = (Port) obj;
        if (!Objects.equals(this.codePort, other.codePort)) {
            return false;
        }
        return true;
    }

}