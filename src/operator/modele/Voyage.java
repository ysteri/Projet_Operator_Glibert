package operator.modele;


import java.util.*;

/**
 * @author Thomas
 */
public class Voyage {

    /**
     * Default constructor
     */
    
     /**
     * 
     */
    protected int code_voyage;

    /**
     * 
     */
    protected String type;

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

}