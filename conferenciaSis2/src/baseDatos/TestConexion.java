/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author sabo
 */
public class TestConexion {
    public static void main(String[] args) throws SQLException {
        Conexion c= new Conexion();
        System.out.println(c.isConectado());
        
    }
}
