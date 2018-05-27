package operator.modele;

import java.util.*;

/**
 * @author Thomas
 */
public class Deplacement {

    /**
     *
     */
    protected float prix;

    /**
     *
     */
    protected String départ_date;

    /**
     *
     */
    protected String arrivée_date;

    /**
     *
     */
    protected String départ_heure;

    /**
     *
     */
    protected String arrivée_heure;

    public Deplacement() {
        //constructeur par défaut

    }

    public Deplacement(float prix, String départ_date, String arrivée_date, String départ_heure, String arrivée_heure) {//constructeur complet
        this.prix = prix;
        this.départ_date = départ_date;
        this.arrivée_date = arrivée_date;
        this.départ_heure = départ_heure;
        this.arrivée_heure = arrivée_heure;
    }

    /**
     * @return
     */
    public float getPrix() {
        // TODO implement here
        return prix;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(float prix) {
        // TODO implement here
        this.prix = prix;
    }

    /**
     * @return
     */
    public String getDépart_date() {
        // TODO implement here
        return départ_date;
    }

    /**
     *
     * @param départ_date
     */
    public void setDépart_date(String départ_date) {
        // TODO implement here
        this.départ_date = départ_date;
    }

    /**
     * @return
     */
    public String getArrivée_date() {
        // TODO implement here
        return arrivée_date;
    }

    /**
     *
     * @param arrivée_date
     */
    public void setArrivée_date(String arrivée_date) {
        // TODO implement here
        this.arrivée_date = arrivée_date;
    }

    /**
     * @return
     */
    public String getDépart_heure() {
        // TODO implement here
        return départ_heure;
    }

    /**
     *
     * @param départ_heure
     */
    public void setDépart_heure(String départ_heure) {
        // TODO implement here
        this.départ_heure = départ_heure;
    }

    /**
     * @return
     */
    public String getArrivée_heure() {
        // TODO implement here
        return arrivée_heure;
    }

    /**
     *
     * @param arrivée_heure
     */
    public void setArrivée_heure(String arrivée_heure) {
        // TODO implement here
        this.arrivée_heure = arrivée_heure;
    }

    @Override
    public String toString() {
        return "prix=" + prix + ", départ_date=" + départ_date
                + ", arrivée_date=" + arrivée_date + ", départ_heure=" + départ_heure
                + ", arrivée_heure=" + arrivée_heure;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.départ_date);
        hash = 23 * hash + Objects.hashCode(this.arrivée_date);
        hash = 23 * hash + Objects.hashCode(this.départ_heure);
        hash = 23 * hash + Objects.hashCode(this.arrivée_heure);
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
        final Deplacement other = (Deplacement) obj;
        if (!Objects.equals(this.départ_date, other.départ_date)) {
            return false;
        }
        if (!Objects.equals(this.arrivée_date, other.arrivée_date)) {
            return false;
        }
        if (!Objects.equals(this.départ_heure, other.départ_heure)) {
            return false;
        }
        if (!Objects.equals(this.arrivée_heure, other.arrivée_heure)) {
            return false;
        }
        return true;
    }

}
