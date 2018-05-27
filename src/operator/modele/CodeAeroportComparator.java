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
public class CodeAeroportComparator implements Comparator<Aeroport> {

    @Override
    public int compare(Aeroport a1, Aeroport a2) {
        return a1.getCodeAeroport().compareTo(a2.getCodeAeroport());
    }

}
