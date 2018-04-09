package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Vol extends Déplacement {

    /**
     * Default constructor
     */
    
      /**
     * 
     */
    protected String code_vol;

    /**
     * 
     */
    protected String départ_aéroport;

    /**
     * 
     */
    protected String arrivée_aéroport;

    /**
     * 
     */
    protected Aéroport dep;

    /**
     * 
     */
    protected Aéroport arr;

    public Vol() {
        //constructeur par défaut
    }

    /**
     * @return
     */
    public String getCode_vol() {
        // TODO implement here
        return code_vol;
    }

    /**
     * @param value
     */
    public void setCode_vol(String code_vol) {
        // TODO implement here
        this.code_vol=code_vol;
    }

    /**
     * @return
     */
    public String getDépart_aéroport() {
        // TODO implement here
        return départ_aéroport;
    }

    /**
     * @param value
     */
    public void setDépart_aéroport(String départ_aéroprot) {
        // TODO implement here
        this.départ_aéroport=départ_aéroport;
    }

    /**
     * @return
     */
    public String getArrivée_aéroport() {
        // TODO implement here
        return arrivée_aéroport;
    }

    /**
     * @param value
     */
    public void setArrivée_aéroport(String arrivée_aéroport) {
        // TODO implement here
        this.arrivée_aéroport=arrivée_aéroport;
    }

}