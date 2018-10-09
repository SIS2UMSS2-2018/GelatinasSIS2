package correo;


import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sabo
 */
public class Correo {
        private String usuario;
        private String pass;
        private String rutaArch;
        private String nomArch;
        private String destino;
        private String asunto;
        private String mensaje;
    public Correo(String des){
        
        destino=des;
        usuario="confsis2@gmail.com";
        pass="kzdgbbpwkqfbyomi";
        asunto="verificacion de inscripcion";
        mensaje="usted esta inscrito para la conferencia UMSS 2018";
    }
    public String getUsuario(){
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the rutaArch
     */
    public String getRutaArch() {
        return rutaArch;
    }

    /**
     * @param rutaArch the rutaArch to set
     */
    public void setRutaArch(String rutaArch) {
        this.rutaArch = rutaArch;
    }

    /**
     * @return the nomArch
     */
    public String getNomArch() {
        return nomArch;
    }

    /**
     * @param nomArch the nomArch to set
     */
    public void setNomArch(String nomArch) {
        this.nomArch = nomArch;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the asunto
     */
    public String getAsunto() {
        return asunto;
    }

    /**
     * @param asunto the asunto to set
     */
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    public boolean enviarCorreo(){
            try {
                Properties pro= new Properties();
                pro.put("mail.smtp.host","smtp.gmail.com");
                pro.setProperty("mail.smtp.starttls.enable", "true");
                pro.setProperty("mail.smtp.port", "587");
                pro.setProperty("mail.smtp.auth", "true");
                
                Session se=Session.getDefaultInstance(pro);
               
                MimeMessage men=new MimeMessage(se);
                
                men.setFrom(new InternetAddress(usuario));
                men.addRecipient(Message.RecipientType.TO, new InternetAddress(destino));
                men.setSubject(asunto);
                men.setText(mensaje);
                Transport t=se.getTransport("smtp");
                t.connect(usuario, pass);
                t.sendMessage(men, men.getRecipients(Message.RecipientType.TO));
                t.close();
                return true;
            } catch (MessagingException ex) {
                System.out.println("error"+ex);
                return false;
            }
        
    }
}