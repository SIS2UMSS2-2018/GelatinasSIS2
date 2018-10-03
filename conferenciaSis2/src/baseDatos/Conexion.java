/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    private Connection conexion;
    public Conexion(){
        conexion=null;
        try {
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/conferencia","root","");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            conexion=null;
        }
        
    }
    public boolean isConectado(){
        return conexion!=null;
    }
    public Connection getConexion(){
        return conexion;
    }
}