/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import baseDatos.Conexion;
import baseDatos.Consultas;

/**
 *
 * @author NewUser
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    private static Conexion co;
    private static Consultas con;
    public static void main(String[] args) {
        co = new Conexion();
        con = new Consultas(co.getConexion());
        Principal prin = new Principal(con);
        prin.setVisible(true);
    }
    
}
