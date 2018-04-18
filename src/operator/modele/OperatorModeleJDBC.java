/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;


import myconnections.DBConnection;
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Thoma
 */
public class OperatorModeleJDBC extends OperatorModele {
    
    Connection dbconnect;
    
    public OperatorModeleJDBC(){
        dbconnect = DBConnection.getConnection();
        if(dbconnect == null){
            System.out.println("Erreur de connexion => arrêt du pgm");
            System.exit(1);
        }
    }
    
    public void close(){
        try {
            dbconnect.close();         
        }catch (Exception e){
            System.out.println("Erreur lors de la fermeture de la connexion "+ e);
        }
    }
}
