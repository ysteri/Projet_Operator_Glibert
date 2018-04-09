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
    protected String code_port;

    /**
     * 
     */
    protected String ville;

    /**
     * 
     */
    protected String pays;

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

}