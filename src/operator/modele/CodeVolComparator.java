/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;

import java.util.Comparator;

/**
 *
 * @author Thoma
 */
public class CodeVolComparator implements Comparator<Vol> {
    @Override
    public int compare(Vol v1, Vol v2){
        return v1.getCodeVol().compareTo(v2.getCodeVol());
    }
    
}
