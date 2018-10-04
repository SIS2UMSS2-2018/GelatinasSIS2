/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sabo
 */
public class Consultas {
    Connection conect;
    Statement sentencia;
    public Consultas(Connection connect){
        conect=connect;
    }
    public ResultSet query(){
        ResultSet res;
        try {
            sentencia=(com.mysql.jdbc.Statement) conect.createStatement();
            res= sentencia.executeQuery("SELECT DISTINCT id_grupo  FROM grupos");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res=null;
        }
        return res;
    }
}
