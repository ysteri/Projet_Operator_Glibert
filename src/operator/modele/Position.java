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
    private int num;

    /**
     * 
     */
    private Voyage à;


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
    
    @Override
    public String toString() {
        return "num=" + num;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.num);
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
        final Position other = (Position) obj;
        if (!Objects.equals(this.num, other.num)) {
            return false;
        }
        return true;
    }

}