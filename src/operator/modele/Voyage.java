package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Voyage {

     /**
     * 
     */
    private int code_voyage;

    /**
     * 
     */
    private String type;
    
    //private Position myPosition;

    public Voyage() {
        //constructeur par défaut
    }

    /**
     * @return
     */
    public int getCode_voyage() {
        // TODO implement here
        return code_voyage;
    }

    /**
     * @param value
     */
    public void setCode_voyage(int code_voyage) {
        // TODO implement here
        this.code_voyage=code_voyage;
    }

    /**
     * @return
     */
    public String getType() {
        // TODO implement here
        return type;
    }

    /**
     * @param value
     */
    public void setType(String type) {
        // TODO implement here
        this.type=type;
    }
    
    @Override
    public String toString() {
        return "code_voyage=" + code_voyage + ", type=" + type;              
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.code_voyage);
        hash = 23 * hash + Objects.hashCode(this.type);
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
        final Voyage other = (Voyage) obj;
        if (!Objects.equals(this.code_voyage, other.code_voyage)) {
            return false;
        }
        return true;
    }

}