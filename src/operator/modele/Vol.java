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
    protected Aeroport departAeroport;

    /**
     * 
     */
    protected Aeroport arriveeAeroport;

    public Vol() {
        //constructeur par défaut
    }
    
    public Vol(String codeVol, Aeroport departAeroport,Aeroport arriveeAeroport){//constructeur complet
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
    public Aeroport getDepartAeroport() {
        // TODO implement here
        return departAeroport;
    }

    /**
     * 
     * @param departAeroport 
     */
    public void setDepartAeroport(Aeroport departAeroport) {
        // TODO implement here
        this.departAeroport=departAeroport;
    }

    /**
     * @return
     */
    public Aeroport getArriveeAeroport() {
        // TODO implement here
        return arriveeAeroport;
    }

    /**
     * 
     * @param arriveeAeroport 
     */
    public void setArriveeAeroport(Aeroport arriveeAeroport) {
        // TODO implement here
        this.arriveeAeroport=arriveeAeroport;
    }
    
    @Override
    public String toString() {
        return "codeVol=" + codeVol + 
                ", Aéroport de départ=" + departAeroport + ", Aéroport d'arrivée=" + arriveeAeroport;              
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