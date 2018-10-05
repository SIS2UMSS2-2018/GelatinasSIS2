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
    //devuelve los datos de los estudiantes por grupo y tema
    public ResultSet estudiantesGrupos(){
        ResultSet res;
        try {
                res = sentencia.executeQuery("select a.nombre_asis, a.apellido_asis, a.ocupacion_asis, g.id_grupo, g.temas_id_tema from asistentes a, grupos g, asisten_grupo ag where g.id_grupo= ag.grupos_id_grupo and a.ci_asistente = ag.asistentes_ci_asistente");
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res=null;
        }
        
        return res;
    }
    //Devuelve el contacto del expositor
    public ResultSet contactoExpositor(String nombre, String apellido){
            ResultSet res;
            try {
                res = sentencia.executeQuery("select nro_Contacto from expositores where nombre_expo ='"+nombre+"' and apellido_expo ='"+apellido+"'");
            } catch (SQLException ex) {
                Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
                res=null;
            }   
            return res;
    }
    // Inserta una tupla a la tabla de asistentes
    public void insertarAsistente(int ci_asistente, String nombre_asis, String apellido_asis, String ocupacion_asis, String correo_asis){
        String values = "(" + Integer.toString(ci_asistente) + ',' + "'"+apellido_asis+"'" + ',' + "'"+ocupacion_asis+"'" + ',' + "'"+correo_asis+"'" + ")";
        String query = "INSERT INTO asistentes VALUES " + values;
        try{
            sentencia.executeUpdate(query);
        }
        catch(SQLException ex){
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Reduce en 1 los cupos de un grupo dado su id 
    public void reducirCupo(int id_grupo){
        String query = "UPDATE grupos SET cupos_dispo = cupos_dispo - 1 WHERE id_grupo = " + Integer.toString(id_grupo);
        try{
            sentencia.executeUpdate(query);
        }
        catch(SQLException ex){
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Inserta un expositor a la tabla de expositores
    public void insertarExpositor(int id_expo, String nombre_expo, String apellido_expo, String historial, int nro_contacto, String actividades){
        String values = "(" + Integer.toString(id_expo) + ',' + "'"+nombre_expo+"'" + ',' + "'"+apellido_expo+"'" + ',' + "'"+historial+"'" + ',' + Integer.toString(nro_contacto) + ',' + "'"+actividades+"'";
        String query = "INSERT INTO expositores VALUES " + values;
        try{
            sentencia.executeUpdate(query);
        }
        catch(SQLException ex)
        {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Valida la existencia de un expositor
    public boolean validarExpositor(String nombre_expo, String apellido_expo){
        ResultSet res;
        try {
            res = sentencia.executeQuery("select nro_Contacto from expositores where nombre_expo ='"+nombre_expo+"' and apellido_expo ='"+apellido_expo+"'");
            if (res.last() == false) return false;
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    // Obtener apellido y nombre de expositores
    public ResultSet obtenerNombreApellidoDeExpositores()
    {
        ResultSet res;
        try {
            res = sentencia.executeQuery("SELECT nombre_expo, apellido_expo FROM expositores ORDER BY nombre_expo ASC, apellido_expo ASC");
        }
        catch (SQLException ex){
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res = null;
        }
        return res;
    }
    
    //devuelve id de grupo y cantidad de grupo 
    //variables de ResultSet id,cupo
    public ResultSet obtenerCantGrupo(){
        ResultSet res;
        try {
            String query="select id_grupo as id,cupos_dispo as cupo from grupos where cupos_dispo>0";
            res = sentencia.executeQuery(query);
            
        }
        catch (SQLException ex){
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res = null;
        }
        return res;
    }
    //devuelve el id del grupo y la cantidad de inscritos
    //variables ResultSet num,cant
    public ResultSet cantInscritosGrupo(){
        ResultSet res;
        try {
            String query="SELECT grupos_id_grupo as num, COUNT(*) as cant\n" +
                         "FROM inscripcion\n" +
                         "GROUP BY grupos_id_grupo";
            res = sentencia.executeQuery(query);
            
        }
        catch (SQLException ex){
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
            res = null;
        }
        return res;
    }
}
