package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Port {

    /**
     * Default constructor
     */
    
      /**
     * 
     */
    private String code_port;

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

    /**
     * @return
     */
    public String getCode_port() {
        // TODO implement here
        return code_port;
    }

    /**
     * @param value
     */
    public void setCode_port(String code_port) {
        // TODO implement here
        this.code_port=code_port;
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
    
    @Override
    public String toString() {
        return "code_port=" + code_port + ", ville=" + ville + ", pays=" + pays;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code_port);
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
        if (!Objects.equals(this.code_port, other.code_port)) {
            return false;
        }
        return true;
    }

}