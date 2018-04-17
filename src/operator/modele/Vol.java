package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Vol extends Déplacement {

      /**
     * 
     */
    private String code_vol;

    /**
     * 
     */
    private String départ_aéroport;

    /**
     * 
     */
    private String arrivée_aéroport;
    
    private Aéroport myAéroport;

    public Vol() {
        //constructeur par défaut
    }
    
    public Vol(String code_vol, String départ_aéroport,String arrivée_aéroport){//constructeur complet
        this.code_vol=code_vol;
        this.départ_aéroport=départ_aéroport;
        this.arrivée_aéroport=arrivée_aéroport;
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
    
    @Override
    public String toString() {
        return "code_vol=" + code_vol + 
                ", départ_aéroport=" + départ_aéroport + ", arrivée_aéroport=" + arrivée_aéroport;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code_vol);
        hash = 23 * hash + Objects.hashCode(this.départ_aéroport);
        hash = 23 * hash + Objects.hashCode(this.arrivée_aéroport);
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
        final Vol other = (Vol) obj;
        if (!Objects.equals(this.code_vol, other.code_vol)) {
            return false;
        }
        return true;
    }

}