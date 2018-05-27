/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator.modele;

import myconnections.DBConnection;
import java.util.*;
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

    /**
     * constructeur de la classe pour se connecter à la bd
     */
    public OperatorModeleJDBC() {
        dbconnect = DBConnection.getConnection();
        if (dbconnect == null) {
            System.out.println("Erreur de connexion => arrêt du pgm");
            System.exit(1);
        }
    }

    /**
     * méthode qui permet de se déconnecter de la bd
     */
    public void close() {
        try {
            dbconnect.close();
        } catch (Exception e) {
            System.out.println("Erreur lors de la fermeture de la connexion " + e);
        }
    }

    /**
     * Override de la méthode populatearoportvol modele
     */
    @Override
    public void populateAeroportVol() {
        //ne rien faire car données déjà présentes dans BD
    }

    /**
     * Override de la méthode populateport modele
     */
    @Override
    public void populatePort() {
        //ne rien faire car données déjà présentes dans BD
    }

    /**
     * méthode qui retourne toutes les lignes de la table BATEAU
     * @return liste bateau
     */
    @Override
    public List<Bateau> tousBateaux() {
        String query = "select * from BATEAU ";
        List<Bateau> lb = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codeBateau = rs.getString(1);
                double supSingle = rs.getDouble(2);
                //String depPort = rs.getString(3);
                //String arrPort = rs.getString(4);

                Bateau b = new Bateau(codeBateau, supSingle);

                lb.add(b);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Bateaux " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de statement " + e);
            }
        }
        return lb;
    }

    /**
     * méthode qui retourne toutes les lignes de la table PORT
     * @return liste des ports
     */
    @Override
    public List<Port> tousPorts() {
        String query = "select * from PORT ";
        List<Port> lp = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codePort = rs.getString(1);
                String ville = rs.getString(2);
                String pays = rs.getString(3);

                Port p = new Port(codePort, ville, pays);

                lp.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Ports " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de statement " + e);
            }
        }
        return lp;
    }
    
    /**
     * méthode qui retourne toutes les lignes de la table VOL
     * @return la liste des vols
     */
    @Override
    public List<Vol> tousVols() {
        String query = "select * from VOL ";
        List<Vol> lv = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codeVol = rs.getString(1);
                //String depAeroport = rs.getString(2);
                //String arrAeroport = rs.getString(3);

                Vol v = new Vol(codeVol);

                lv.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Ports " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de statement " + e);
            }
        }
        return lv;
    }
    
    /**
     * méthode qui retourne toutes les lignes de la table AEROPORT
     * @return la liste des aéroports
     */
    @Override
    public List<Aeroport> tousAeroports() {
        String query = "select * from AEROPORT ";
        List<Aeroport> la = new ArrayList<>();
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = dbconnect.createStatement();
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codeAeroport = rs.getString(1);
                String nom = rs.getString(2);
                String ville = rs.getString(3);
                String pays = rs.getString(4);

                Aeroport a = new Aeroport(codeAeroport, nom, ville, pays);

                la.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Ports " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de statement " + e);
            }
        }
        return la;
    }

    /**
     * méthode qui retourne la ligne recherchée dans la table BATEAU
     * @param codeBateau
     * @return ligne bateau
     */
    @Override
    public Bateau getBateau(String codeBateau) {
        String query = "select * from BATEAU where CODE_BATEAU= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Bateau b = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codeBateau);
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codeBat = rs.getString(1);
                Double supSingle = rs.getDouble(2);
                String depPort = rs.getString(3);
                String arrPort = rs.getString(4);
                
                b = new Bateau(codeBat, supSingle, depPort, arrPort);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Bateau " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedstatement " + e);
            }
        }
        return b;
    }

    /**
     * méthode qui retourne la ligne de la table PORT recherchée
     * @param codePort
     * @return ligne port
     */
    @Override
    public Port getPort(String codePort) {
        String query = "select * from PORT where CODE_PORT= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Port p = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codePort);
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codeP = rs.getString(1);
                String ville = rs.getString(2);
                String pays = rs.getString(3);

                p = new Port(codeP, ville, pays);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Port " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedstatement " + e);
            }
        }
        return p;
    }
    
    /**
     * méthode qui retourne la ligne de la table VOL recherchée
     * @param codeVol
     * @return 
     */
    @Override
    public Vol getVol(String codeVol) {
        String query = "select * from VOL where CODE_VOL= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Vol v = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codeVol);
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codeV = rs.getString(1);

                v = new Vol(codeV);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Port " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedstatement " + e);
            }
        }
        return v;
    }
    
    /**
     * méthode qui retourrne la ligne de la table AEROPORT recherchée
     * @param codeAeroport
     * @return 
     */
    @Override
    public Aeroport getAeroport(String codeAeroport) {
        String query = "select * from AEROPORT where CODE_AEROPORT= ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Aeroport a = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, codeAeroport);
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codeA = rs.getString(1);
                String nom = rs.getString(2);
                String ville = rs.getString(3);
                String pays = rs.getString(4);

                a = new Aeroport(codeA, nom, ville, pays);
            }
        } catch (SQLException e) {
            System.out.println("Erreur lors de la recherche de Port " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedstatement " + e);
            }
        }
        return a;
    }
    
    /**
     * méthode qui ajoute un bateau dans la BATEAU
     * @param b
     * @return bateau
     */
    @Override
    public String ajouterBateau(Bateau b) {
        String msg;
        String query = "insert into BATEAU(CODE_BATEAU,SUP_SINGLE,CODE_PORT_DEP,CODE_PORT_ARR) values(?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, b.getCodeBateau());
            pstm.setDouble(2, b.getSupSingle());
            pstm.setString(3, b.getDepPort());
            pstm.setString(4, b.getArrPort());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout bateau effectué";
            } else {
                msg = "ajout bateau non effectué";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de l'ajout d'un bateau " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedStatement " + e);
            }
        }
        return msg;
    }

    /**
     * méthode qui ajoute un port dans la table PORT
     * @param p
     * @return port
     */
    @Override
    public String ajouterPort(Port p) {
        String msg;
        String query = "insert into PORT(CODE_PORT,VILLE,PAYS) values(?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, p.getCodePort());
            pstm.setString(2, p.getVille());
            pstm.setString(3, p.getPays());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout port effectué";
            } else {
                msg = "ajout port non effectué";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de l'ajout d'un port " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedStatement " + e);
            }
        }
        return msg;
    }
    
    /**
     * méthode qui ajoute un vol dans la table VOL
     * @param v
     * @return vol
     */
    @Override
    public String ajouterVol(Vol v) {
        String msg;
        String query = "insert into VOL(CODE_VOL,CODE_AEROPORT_DEP,CODE_AEROPORT_ARR) values(?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, v.getCodeVol());
            pstm.setString(2, v.getDepAeroport());
            pstm.setString(3, v.getArrAeroport());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout vol effectué";
            } else {
                msg = "ajout vol non effectué";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de l'ajout d'un vol " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedStatement " + e);
            }
        }
        return msg;
    }
    
    /**
     * méthode qui ajoute un aéroport dans la table AEROPORT
     * @param a
     * @return aeroport
     */
    @Override
    public String ajouterAeroport(Aeroport a) {
        String msg;
        String query = "insert into AEROPORT(CODE_AEROPORT,NOM,VILLE,PAYS) values(?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, a.getCodeAeroport());
            pstm.setString(2, a.getNom());
            pstm.setString(3, a.getVille());
            pstm.setString(4, a.getPays());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout aéroport effectué";
            } else {
                msg = "ajout aéroport non effectué";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de l'ajout d'un aéroport " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.out.println("Erreur de fermeture de preparedStatement " + e);
            }
        }
        return msg;
    }

    /**
     * méthode qui modifie le supplément single d'une ligne de la table BATEAU
     * @param b
     * @param supSingle
     * @return bateau
     */
    @Override
    public String modifSupSingle(Bateau b, double supSingle) {
        String query = "UPDATE BATEAU SET SUP_SINGLE= ? where CODE_BATEAU= ?";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setDouble(1, supSingle);
            pstm.setString(2, b.getCodeBateau());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Changement de supplément single effectué";
            } else {
                msg = "Changement de supplément single non effectué";
            }
        } catch (SQLException e) {
            msg = "Erreur lors du changement de supplément single " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "Erreur de fermeture de preparedStatement " + e;
            }
        }
        return msg;
    }

    /**
     * méthode qui supprime une ligne de la table BATEAU
     * @param b
     * @return bateau
     */
    @Override
    public String suppBateau(Bateau b) {
        String query = "DELETE FROM BATEAU WHERE CODE_BATEAU= ?";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, b.getCodeBateau());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression de bateau effectuée";
            } else {
                msg = "Suppression de bateau non effectuée";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de la suppression " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "Erreur de fermeture de preparedStatement " + e;
            }
        }
        return msg;
    }

    /**
     * méthode qui supprime une ligne de la table PORT
     * @param p
     * @return port
     */
    @Override
    public String suppPort(Port p) {
        String query = "DELETE FROM PORT WHERE CODE_PORT= ?";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, p.getCodePort());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression de port effectuée";
            } else {
                msg = "Suppression de port non effectuée";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de la suppression " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "Erreur de fermeture de preparedStatement " + e;
            }
        }
        return msg;
    }
    
    /**
     * méthode qui supprime une ligne de la table VOL
     * @param v
     * @return vol
     */
    @Override
    public String suppVol(Vol v) {
        String query = "DELETE FROM VOL WHERE CODE_VOL= ?";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, v.getCodeVol());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression de vol effectuée";
            } else {
                msg = "Suppression de vol non effectuée";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de la suppression " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "Erreur de fermeture de preparedStatement " + e;
            }
        }
        return msg;
    }
    
    /**
     * méthode qui supprime une ligne de la table AEROPORT
     * @param a
     * @return aeroport
     */
    @Override
    public String suppAeroport(Aeroport a) {
        String query = "DELETE FROM AEROPORT WHERE CODE_AEROPORT= ?";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, a.getCodeAeroport());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression de l'aéroport effectuée";
            } else {
                msg = "Suppression de l'aéroport non effectuée";
            }
        } catch (SQLException e) {
            msg = "Erreur lors de la suppression " + e;
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "Erreur de fermeture de preparedStatement " + e;
            }
        }
        return msg;
    }
}
