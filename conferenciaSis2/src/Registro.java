import baseDatos.Conexion;
import baseDatos.Consultas;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Registro {

    Connection conect = null;
    Statement sentencia;
    Conexion con;
    public Registro() {
        con=new Conexion();
        if(con.isConectado()){
            conect=con.getConexion();
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }
    }

    public boolean consulta(String consultaSQL) {
        boolean res=false;
        try {
            PreparedStatement pst = conect.prepareStatement(consultaSQL);
            int n = pst.executeUpdate();
            res=(n>0);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            res=false;
        }
        return res;
    }

    public ArrayList<Integer> grupo() throws SQLException {
        ArrayList<Integer> respuesta = new ArrayList<>();
        Consultas consulta= new Consultas(conect);
        //ResultSet rs = sentencia.executeQuery("SELECT DISTINCT grupos_id_grupo  FROM asisten_grupo");
        ResultSet rs = consulta.query();
        while (rs.next()) {
            respuesta.add(Integer.parseInt(rs.getString("id_grupo")));
        }
        rs.close();
        return respuesta;
    }
}
