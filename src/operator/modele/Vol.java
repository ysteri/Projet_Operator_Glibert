package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Vol extends Deplacement{

      /**
     * 
     */
    protected String codeVol;

    /**
     * 
     */
    protected Port departAeroport;

    /**
     * 
     */
    protected Port arriveeAeroport;

    public Vol() {
        //constructeur par défaut
    }
    
    public Vol(String codeVol, Port departAeroport,Port arriveeAeroport){//constructeur complet
        this.codeVol=codeVol;
        this.departAeroport=departAeroport;
        this.arriveeAeroport=arriveeAeroport;
    }

    /**
     * @return
     */
    public String getCodeVol() {
        // TODO implement here
        return codeVol;
    }

    /**
     * 
     * @param codeVol 
     */
    public void setCode_vol(String codeVol) {
        // TODO implement here
        this.codeVol=codeVol;
    }

    /**
     * @return
     */
    public Port getDepartAeroport() {
        // TODO implement here
        return departAeroport;
    }

    /**
     * 
     * @param departAeroport 
     */
    public void setDepartAeroport(Port departAeroport) {
        // TODO implement here
        this.departAeroport=departAeroport;
    }

    /**
     * @return
     */
    public Port getArriveeAeroport() {
        // TODO implement here
        return arriveeAeroport;
    }

    /**
     * 
     * @param arriveeAeroport 
     */
    public void setArriveeAeroport(Port arriveeAeroport) {
        // TODO implement here
        this.arriveeAeroport=arriveeAeroport;
    }
    
    @Override
    public String toString() {
        return "code_vol=" + codeVol + 
                ", départ_aéroport=" + departAeroport + ", arrivée_aéroport=" + arriveeAeroport;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeVol);
        //hash = 23 * hash + Objects.hashCode(this.departAeroport);
        //hash = 23 * hash + Objects.hashCode(this.arriveeAeroport);
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
        if (!Objects.equals(this.codeVol, other.codeVol)) {
            return false;
        }
        return true;
    }

}