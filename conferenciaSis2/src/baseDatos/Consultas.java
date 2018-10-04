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
        try {
            sentencia=(com.mysql.jdbc.Statement) conect.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet query(){
        ResultSet res;
        
        try {
            res= sentencia.executeQuery("SELECT DISTINCT id_grupo  FROM grupos");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res=null;
        }
        
        
        return res;
    }
    public boolean validarAsistente(int ciAsistente){
        boolean res=false;
        String query= "SELECT * FROM asistentes WHERE ci_asis='"+ciAsistente+"'";
        ResultSet r;
        
        
        try {
            
            r = sentencia.executeQuery(query);
            if(r.next()){
                res=true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
        
    }
    public boolean cancelarInscripcion(int ciAsistente,int idGrupo){
        boolean res=false;
        
        try {
            String query="SELECT cupos_dispo FROM grupos WHERE id_grupo='"+idGrupo+"'";
            ResultSet aux=sentencia.executeQuery(query);
            int cupos=-1;
            while(aux.next()){
                cupos=aux.getInt(1);
                System.out.println(cupos);
            }
            
            query="DELETE FROM asistentes WHERE ci_asis='"+ciAsistente+"'";
            sentencia.executeUpdate(query);
            cupos+=1;
            query="UPDATE grupos SET cupos_dispo='"+cupos+"' WHERE id_grupo='"+idGrupo+"'";
            sentencia.executeUpdate(query);
            res=true;
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return res;
    }
}
