package correo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sabo
 */
public class TestCorreo {
    public static void main(String[] args) {
        Correo c= new Correo();
        if(c.enviarCorreo("cbrt113@gmail.com")){
            System.out.println("enviado");
        }else{
            System.out.println("error");
        }
    }
    
}