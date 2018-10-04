/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import baseDatos.Conexion;

/**
 *
 * @author sabo
 */
public class TestConexion {
    public static void main(String[] args) {
        Conexion c= new Conexion();
        System.out.println(c.isConectado());
        Consultas co= new Consultas(c.getConexion());
        System.out.println(co.cancelarInscripcion(123, 1));
    }
}
