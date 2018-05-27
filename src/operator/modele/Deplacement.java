package operator.modele;

import java.util.*;

/**
 * @author Thomas
 */
public abstract class Deplacement {

    /**
     *
     */
    protected double prix;

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
    public double getPrix() {
        // TODO implement here
        return prix;
    }

    /**
     *
     * @param prix
     */
    public void setPrix(double prix) {
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


}
