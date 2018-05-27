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
    
    @Override
    public void populateAeroportVol(){
       //ne rien faire car données déjà présentes dans BD
   }
   
   @Override
   public void populatePort(){
        //ne rien faire car données déjà présentes dans BD
    }
   
   @Override
   public List<Bateau> tousBateaux(){
        String query = "select * from BATEAU ";
        List<Bateau> lb = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try{
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while(rs.next()){
                String codeBateau = rs.getString(2);
                double supSingle = rs.getDouble(3);
                //String depPort = rs.getString(4);
                //String arrPort = rs.getString(5);
                
                Bateau b = new Bateau(codeBateau,supSingle);
                
                lb.add(b);
            }
        }catch(SQLException e){
            System.out.println("Erreur lors de la recherche de Bateaux "+ e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de resultset "+ e);
            }
            try{
                if(stm != null){
                    stm.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de statement "+ e);
            }
        }
        return lb;
    }
    
    @Override
    public List<Port> tousPorts(){
        String query = "select * from PORT ";
        List<Port> lp = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try{
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while(rs.next()){
                String codePort = rs.getString(2);
                String ville = rs.getString(3);
                String pays = rs.getString(4);
                
                Port p = new Port(codePort,ville,pays);
                
                lp.add(p);
            }
        }catch(SQLException e){
            System.out.println("Erreur lors de la recherche de Bateaux "+ e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de resultset "+ e);
            }
            try{
                if(stm != null){
                    stm.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de statement "+ e);
            }
        }
        return lp;
    }
    
    @Override
    public Bateau getBateau(String codeBateau){
        String query = "select * from BATEAU where CODE_BATEAU= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Bateau b = null;
        try{
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codeBateau);
            rs=pstm.executeQuery();
            if(rs.next()){
                String codeBat = rs.getString(2);
                Double supSingle = rs.getDouble(3);
                
                b = new Bateau(codeBat, supSingle);
            }
        }catch(SQLException e){
            System.out.println("Erreur lors de la recherche de Bateau "+ e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de resultset "+ e);
            }
            try{
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de preparedstatement "+ e);
            }
        }
        return b;
    }
   
    @Override
    public Port getPort(String codePort){
        String query = "select * from PORT where CODE_PORT= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Port p = null;
        try{
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codePort);
            rs=pstm.executeQuery();
            if(rs.next()){
                String codeP = rs.getString(2);
                String ville = rs.getString(3);
                String pays = rs.getString(4);
                
                p = new Port(codeP, ville, pays);
            }
        }catch(SQLException e){
            System.out.println("Erreur lors de la recherche de Bateau "+ e);
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de resultset "+ e);
            }
            try{
                if(pstm != null){
                    pstm.close();
                }
            }catch(SQLException e){
                System.out.println("Erreur de fermeture de preparedstatement "+ e);
            }
        }
        return p;
    }
    
}

