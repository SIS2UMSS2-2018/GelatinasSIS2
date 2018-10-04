/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.*;
import javax.swing.*;
public class Conexion {
    Connection conect = null;
    public Connection conectar()
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://localhost/conferencia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
                System.out.println("conexion establecida");
                JOptionPane.showMessageDialog(null,"Conectado");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion " +e);
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
     
}
