/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tel.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author pc1
 */
public class connectController {
    public void connectControl (String sql) throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        try {
            Connection connect = DriverManager.getConnection("");
            PreparedStatement ps = connect.prepareStatement(sql);
            connectCol(ps);
        } catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    public PreparedStatement connectCol (PreparedStatement p){
        return p;
    }
}
