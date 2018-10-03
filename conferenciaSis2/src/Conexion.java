package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Conexion {

    Connection conect = null;
    Statement sentencia;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/conferencia", "root", "");
            sentencia=(com.mysql.jdbc.Statement) conect.createStatement();
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion " + e);
        }
        return conect;
    }

    public boolean consulta(String consultaSQL) {
        boolean res=false;
        try {
            PreparedStatement pst = conect.prepareStatement(consultaSQL);
            int n = pst.executeUpdate();
            res=(n>0);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            res=false;
        }
        return res;
    }

    public ArrayList<Integer> grupo() throws SQLException {
        ArrayList<Integer> respuesta = new ArrayList<>();
        ResultSet rs = sentencia.executeQuery("SELECT DISTINCT grupos_id_grupo  FROM asisten_grupo");
        while (rs.next()) {
            respuesta.add(Integer.parseInt(rs.getString("grupos_id_grupo")));
        }
        rs.close();
        return respuesta;
    }
}
