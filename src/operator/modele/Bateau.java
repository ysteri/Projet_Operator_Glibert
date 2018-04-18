package operator.modele;


//import operator.modele.Voyage;
//import operator.modele.Port;
import java.util.*;

/**
 * @author Thomas
 */
public class Bateau extends Deplacement {

       /**
     *
     */
    private String codeBateau;

    /**
     *
     */
    private float supSingle;

    /**
     *
     */
    private String departPort;

    /**
     *
     */
    private String arriveePort;

    private Port myPort;
    
    public Bateau() {
        //constructeur par défaut
    }
    
    public Bateau(String codeBateau){//constructeur basé sur les criètres de recherche
        this.codeBateau=codeBateau;
    }
    
    public Bateau(String codeBateau,float supSingle, String departPort,String arriveePort){//constructeur complet
        this.codeBateau=codeBateau;
        this.supSingle=supSingle;
        this.departPort=departPort;
        this.arriveePort=arriveePort;
    }

    /**
     * @return
     */
    public String getCodeBateau() {
        // TODO implement here
        return codeBateau;
    }

    /**
     *
     */
    public void setCodeBateau(String codeBateau) {
        // TODO implement here
        this.codeBateau=codeBateau;
    }

    /**
     * @return
     */
    public float getSupSingle() {
        // TODO implement here
        return supSingle;
    }

    /**
     * 
     */
    public void setSupSingle(float supSingle) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDepartPort() {
        // TODO implement here
        return departPort;
    }

    /**
     * 
     */
    public void setDepartPort(String departPort) {
        // TODO implement here
        this.departPort=departPort;
    }

    /**
     * @return
     */
    public String getArriveePort() {
        // TODO implement here
        return arriveePort;
    }

    /**
     * 
     */
    public void setArriveePort(String arriveePort) {
        // TODO implement here
        this.arriveePort=arriveePort;
    }
    
    @Override
    public String toString() {
        return "code_bateau=" + codeBateau + ", sup_single=" + supSingle + 
                ", départ_port=" + departPort + ", arrivée_port=" + arriveePort;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeBateau);
        hash = 23 * hash + Objects.hashCode(this.supSingle);
        hash = 23 * hash + Objects.hashCode(this.departPort);
        hash = 23 * hash + Objects.hashCode(this.arriveePort);
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
        final Bateau other = (Bateau) obj;
        if (!Objects.equals(this.codeBateau, other.codeBateau)) {
            return false;
        }
        return true;
    }

}

