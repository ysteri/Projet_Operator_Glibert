package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Port {
    
      /**
     * 
     */
    private String codePort;

    /**
     * 
     */
    private String ville;

    /**
     * 
     */
    private String pays;

    public Port() {
        //constructeur par défaut
    }

    public Port(String codePort){//constructeur basé sur les critères de recherche
        this.codePort=codePort;
    }
    
    public Port(String codePort, String ville, String pays){//constructeur complet
        this.codePort=codePort;
        this.ville=ville;
        this.pays=pays;
    }
    
    /**
     * @return
     */
    public String getCodePort() {
        // TODO implement here
        return codePort;
    }

    /**
     *
     */
    public void setCodePort(String codePort) {
        // TODO implement here
        this.codePort=codePort;
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
     */
    public void setPays(String pays) {
        // TODO implement here
        this.pays=pays;
    }
    
    @Override
    public String toString() {
        return "code_port=" + codePort + ", ville=" + ville + ", pays=" + pays;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codePort);
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
        final Port other = (Port) obj;
        if (!Objects.equals(this.codePort, other.codePort)) {
            return false;
        }
        return true;
    }

}