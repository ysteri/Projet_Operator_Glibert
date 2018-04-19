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
public class CodePortComparator implements Comparator<Port> {
    @Override
    public int compare(Port p1, Port p2){
        return p1.getCodePort().compareTo(p2.getCodePort());
    }
    
}
