/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Temperatura;

/**
 *
 * @author samuelson
 */
public class TemperaturaDAO {
    
    public boolean save(Temperatura t){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO temperatura (valor) VALUES (?)");
            stmt.setDouble(1, t.getValor());
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            
            System.err.println("Erro no Create: "+ex);
            return false;
            
        } finally {
            ConnectionFactory.closeConnection(con,stmt);
        }
        
    }
    
}
