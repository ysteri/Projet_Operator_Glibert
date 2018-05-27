package operator.modele;

import java.util.*;

/**
 * @author Thomas
 */
public class Vol extends Deplacement {

    /**
     *variable alphanumérique qui contient le code
     */
    protected String codeVol;

    /**
     *variable qui contient l'aéroport de départ
     */
    protected Aeroport departAeroport;

    /**
     *variable qui contient l'aéroport d'arrivée
     */
    protected Aeroport arriveeAeroport;
    
    /**
     * variable qui contient le code de l'aéroport de départ
     */
    protected String depAeroport;
    
    /**
     * variable qui contient le code de l'aéroport d'arrivée
     */
    protected String arrAeroport;

    /**
     * constructeur par défaut
     */
    public Vol() {
  
    }

    /**
     * constructeur de recherche
     * @param codeVol 
     */
    public Vol(String codeVol) {
        this.codeVol = codeVol;
    }

    /**
     * constructeur ajout jbdc
     * @param codeVol
     * @param departAeroport
     * @param arriveeAeroport 
     */
    public Vol(String codeVol, Aeroport departAeroport, Aeroport arriveeAeroport) {
        this.codeVol = codeVol;
        this.departAeroport = departAeroport;
        this.arriveeAeroport = arriveeAeroport;
    }

    /**
     * méthode qui récupère le code
     * @return code
     */
    public String getCodeVol() {
        // TODO implement here
        return codeVol;
    }

    /**
     *méthode qui modifie le code
     * @param codeVol code
     */
    public void setCode_vol(String codeVol) {
        // TODO implement here
        this.codeVol = codeVol;
    }

    /**
     * méthode qui récupère l'aéroport de départ
     * @return aeroport
     */
    public Aeroport getDepartAeroport() {
        // TODO implement here
        return departAeroport;
    }

    /**
     *méthode qui modifie l'aéroport de départ
     * @param departAeroport
     */
    public void setDepartAeroport(Aeroport departAeroport) {
        // TODO implement here
        this.departAeroport = departAeroport;
    }

    /**
     * méthode qui récupère l'aéroport d'arrivée
     * @return aeroport
     */
    public Aeroport getArriveeAeroport() {
        // TODO implement here
        return arriveeAeroport;
    }

    /**
     *méthode qui modifie l'aéroport d'arrivée
     * @param arriveeAeroport
     */
    public void setArriveeAeroport(Aeroport arriveeAeroport) {
        // TODO implement here
        this.arriveeAeroport = arriveeAeroport;
    }
    
    /**
     * méthode qui récupère le code de l'aéroport de départ (jbdc)
     * @return code aéroport
     */
    public String getDepAeroport() {
        // TODO implement here
        return depAeroport;
    }

    /**
     *méthode qui modifie le code de l'aéroport de départ (jbdc)
     * @param depAeroport code aéroport
     */
    public void setDepAeroport(String depAeroport) {
        // TODO implement here
        this.depAeroport = depAeroport;
    }
    
    /**
     * méthode qui récupère le code de l'aéroport d'arrivée (jbdc)
     * @return code aéroport
     */
    public String getArrAeroport() {
        // TODO implement here
        return arrAeroport;
    }

    /**
     *méthode qui modifie le code de l'aéroport d'arrivée (jbdc)
     * @param arrAeroport code aéroport
     */
    public void setArrAeroport(String arrAeroport) {
        // TODO implement here
        this.arrAeroport = arrAeroport;
    }

    /**
     * méthode qui affiche les infos du vol
     * @return infos 
     */
    @Override
    public String toString() {
        return "codeVol=" + codeVol
                + ", Aéroport de départ=" + departAeroport + ", Aéroport d'arrivée=" + arriveeAeroport;
    }

    /**
     * méthode redéfinie qui donne un hashcode aux variables du constructeur
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeVol);
        //hash = 23 * hash + Objects.hashCode(this.departAeroport);
        //hash = 23 * hash + Objects.hashCode(this.arriveeAeroport);
        return hash;
    }

    /**
     * méthode redéfinie qui compare des objets en paramètre
     *
     * @param obj
     * @return
     */
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
