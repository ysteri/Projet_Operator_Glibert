package operator.modele;


import operator.modele.Voyage;
import java.util.*;

/**
 * @author Thomas
 */
public class Position {

    /**
     * Default constructor
     */
    
    
    /**
     * 
     */
    protected int num;

    /**
     * 
     */
    protected Voyage à;


    public Position() {
        //constructeur par défaut
    }
    
    public Position(int num, Voyage à){//constructeur complet
        this.num=num;
        this.à=à;
    }

    /**
     * @return
     */
    public int getNum() {
        // TODO implement here
        return num;
    }

    /**
     * @param value
     */
    public void setNum(int num) {
        // TODO implement here
        this.num=num;
    }

}