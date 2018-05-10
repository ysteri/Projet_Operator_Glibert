/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.main;

import operator.controleur.OperatorControleur;
import operator.vue.OperatorVue;
import operator.modele.OperatorModele;
import operator.modele.OperatorModeleJDBC;
import java.util.*;
/**
 *
 * @author Thoma
 */
public class OperatorMVC {
    private OperatorControleur oc;
    private OperatorVue ov;
    private OperatorModele om;
    
    public OperatorMVC(int mode){
        ov = new OperatorVue();
        om = new OperatorModele();
        om.populateAeroportVol();
        om.populatePort();
        switch(mode){
            case 1:
                om = new OperatorModele();
                break;
            case 2:
                om = new OperatorModeleJDBC();
                break;
            default:
                System.out.println("mode incorrect !");
                System.exit(1);
        }
        
        oc = new OperatorControleur(om, ov);
        oc.gestion();
        if(om instanceof OperatorModeleJDBC){
            ((OperatorModeleJDBC) om).close();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mode 1 : Sans DB\nMode 2 : Avec DB");
        int mode = sc.nextInt();
        OperatorMVC omvc = new OperatorMVC(mode);
    }
    
}
