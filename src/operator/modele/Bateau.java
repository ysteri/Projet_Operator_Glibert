package operator.modele;


import operator.modele.Voyage;
import operator.modele.Port;
import java.util.*;

/**
 * @author Thomas
 */
public class Bateau extends Voyage {

    /**
     * Default constructor
     */
       /**
     * 
     */
    protected String code_bateau;

    /**
     * 
     */
    protected float sup_single;

    /**
     * 
     */
    protected String départ_port;

    /**
     * 
     */
    protected String arrivée_port;

    /**
     * 
     */
    private Port dep;

    /**
     * 
     */
    private Port arr;
    
    public Bateau() {
        //constructeur par défaut
    }
    
    public Bateau(String code_bateau,float sup_single, String départ_port,String arrivée_port,Port dep,Port arr){//constructeur complet
        this.code_bateau=code_bateau;
        this.sup_single=sup_single;
        this.départ_port=départ_port;
        this.arrivée_port=arrivée_port;
        this.dep=dep;
        this.arr=arr;
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

}