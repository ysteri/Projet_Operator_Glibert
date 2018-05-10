package operator.modele;


//import operator.modele.Voyage;
//import operator.modele.Port;
import java.util.*;

/**
 * @author Thomas
 */
public class Bateau extends Deplacement {

       /**
     * Variable du code alphanumérique d'un voyage en bateau
     */
    protected String codeBateau;

    /**
     * variable du supplément single d'un voyage en bateau
     */
    protected float supSingle;

    /**
     * variable qui contient le port de départ
     */
    protected Port departPort;

    /**
     * variable qui contient le port d'arrivée
     */
    protected Port arriveePort;
    /**
     * constructeur par défaut
     */
    public Bateau() {
    }
    /**
     * constructeur pour les recherches
     * @param codeBateau 
     */
    public Bateau(String codeBateau){
        this.codeBateau=codeBateau;
    }
    /**
     * constructeur pour les ajouts
     * @param codeBateau
     * @param supSingle
     */
    public Bateau(String codeBateau,float supSingle){//constructeur pour la méthode ajout
        this.codeBateau=codeBateau;
        this.supSingle=supSingle;
    }

    /**
     * retourne le code alphanumérique d'un voyage en bateau
     * @return
     */
    public String getCodeBateau() {
        // TODO implement here
        return codeBateau;
    }

    /**
     * établi un nouveau code alphanumérique
     * @param codeBateau 
     */
    public void setCodeBateau(String codeBateau) {
        // TODO implement here
        this.codeBateau=codeBateau;
    }

    /**
     * méthode qui retourne le supplément single
     * @return le supplément single
     */
    public float getSupSingle() {
        // TODO implement here
        return supSingle;
    }

    /**
     * établi un nouveau supplément single
     * @param supSingle 
     */
    public void setSupSingle(float supSingle) {
        // TODO implement here
        this.supSingle=supSingle;
    }

    /**
     * méthode qui retourne le port de départ
     * @return le port de départ
     */
    public Port getDepartPort() {
        // TODO implement here
        return departPort;
    }

    /**
     * établi un nouveau port de départ
     * @param departPort 
     */
    public void setDepartPort(Port departPort) {
        // TODO implement here
        this.departPort=departPort;
    }

    /**
     * méthode qui retourne le port d'arrivée
     * @return le port d'arrivée
     */
    public Port getArriveePort() {
        // TODO implement here
        return arriveePort;
    }

    /**
     * établi un nouveau port d'arrivée
     * @param arriveePort
     */
    public void setArriveePort(Port arriveePort) {
        // TODO implement here
        this.arriveePort=arriveePort;
    }
    /**
     * méthode redéfinie qui Affiche les variables du constructeur
     * @return
     */
    @Override
    public String toString() {
        return "codeBateau=" + codeBateau + ", supSingle=" + supSingle + 
                ", port de départ=" + departPort + ", Port d'arrivée=" + arriveePort;              
    }
    /**
     * méthode redéfinie qui donne un hashcode aux variables du constructeur
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codeBateau);
    //    hash = 23 * hash + Objects.hashCode(this.supSingle);
    //    hash = 23 * hash + Objects.hashCode(this.departPort);
    //    hash = 23 * hash + Objects.hashCode(this.arriveePort);
        return hash;
    }
    /**
    * méthode redéfinie qui compare des objets en paramètre
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
        final Bateau other = (Bateau) obj;
        if (!Objects.equals(this.codeBateau, other.codeBateau)) {
            return false;
        }
        return true;
    }

}

