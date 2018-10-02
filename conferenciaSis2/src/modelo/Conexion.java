package modelo;

import java.sql.*;
import javax.swing.*;
public class Conexion {
    Connection conect = null;
    public Connection conexion()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://localhost/cuenta","root","");
                JOptionPane.showMessageDialog(null,"Conexion exitosa");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion "+e);
            }
            return conect;
        }
     
}
