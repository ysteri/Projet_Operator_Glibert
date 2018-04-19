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
public class CodeDeplacementBateauComparator implements Comparator<Bateau> {
    @Override
    public int compare(Bateau b1, Bateau b2){
        return b1.getCodeBateau().compareTo(b2.getCodeBateau());
    }
    
}
