package operator.modele;


import operator.modele.Voyage;
import operator.modele.Port;
import java.util.*;

/**
 * @author Thomas
 */
public class Bateau extends Déplacement {

       /**
     * 
     */
    private String code_bateau;

    /**
     * 
     */
    private float sup_single;

    /**
     * 
     */
    private String départ_port;

    /**
     * 
     */
    private String arrivée_port;

    private Port myPort;
    
    public Bateau() {
        //constructeur par défaut
    }
    
    public Bateau(String code_bateau,float sup_single, String départ_port,String arrivée_port){//constructeur complet
        this.code_bateau=code_bateau;
        this.sup_single=sup_single;
        this.départ_port=départ_port;
        this.arrivée_port=arrivée_port;
    }

    /**
     * @return
     */
    public String getCode_bateau() {
        // TODO implement here
        return code_bateau;
    }

    /**
     * @param value
     */
    public void setCode_bateau(String code_bateau) {
        // TODO implement here
        this.code_bateau=code_bateau;
    }

    /**
     * @return
     */
    public float getSup_single() {
        // TODO implement here
        return sup_single;
    }

    /**
     * @param value
     */
    public void setSup_single(float sup_single) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getDépart_port() {
        // TODO implement here
        return départ_port;
    }

    /**
     * @param value
     */
    public void setDépart_port(String départ_port) {
        // TODO implement here
        this.départ_port=départ_port;
    }

    /**
     * @return
     */
    public String getArrivée_port() {
        // TODO implement here
        return arrivée_port;
    }

    /**
     * @param value
     */
    public void setArrivée_port(String arrivée_port) {
        // TODO implement here
        this.arrivée_port=arrivée_port;
    }
    
    @Override
    public String toString() {
        return "code_bateau=" + code_bateau + ", sup_single=" + sup_single + 
                ", départ_port=" + départ_port + ", arrivée_port=" + arrivée_port;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code_bateau);
        hash = 23 * hash + Objects.hashCode(this.sup_single);
        hash = 23 * hash + Objects.hashCode(this.départ_port);
        hash = 23 * hash + Objects.hashCode(this.arrivée_port);
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
        if (!Objects.equals(this.code_bateau, other.code_bateau)) {
            return false;
        }
        return true;
    }

}

