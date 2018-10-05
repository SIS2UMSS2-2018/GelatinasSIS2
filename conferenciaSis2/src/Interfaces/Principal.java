/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelTexto3 = new javax.swing.JLabel();
        jLabelTexto4 = new javax.swing.JLabel();
        jLabelImagen1 = new javax.swing.JLabel();
        jLabelImagen2 = new javax.swing.JLabel();
        jLabelImagen3 = new javax.swing.JLabel();
        jLabelImagen4 = new javax.swing.JLabel();
        jLabelMinimizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelSalir = new javax.swing.JLabel();
        jLabelHerramientas = new javax.swing.JLabel();
        jLabelMusica = new javax.swing.JLabel();
        jLabelInternet = new javax.swing.JLabel();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTexto1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Registro de expositores");
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 160, 20));

        jLabelTexto2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("Inscripciones");
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 90, 20));

        jLabelTexto3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setText("Información");
        getContentPane().add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 90, 20));

        jLabelTexto4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTexto4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTexto4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto4.setText("Registro de asistencia");
        getContentPane().add(jLabelTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 160, 20));

        jLabelImagen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen1.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Idea.png")); // NOI18N
        jLabelImagen1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelImagen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagen1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImagen1MouseMoved(evt);
            }
        });
        jLabelImagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImagen1MouseExited(evt);
            }
        });
        getContentPane().add(jLabelImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, 150));

        jLabelImagen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen2.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Handshake.png")); // NOI18N
        jLabelImagen2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelImagen2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagen2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImagen2MouseMoved(evt);
            }
        });
        jLabelImagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImagen2MouseExited(evt);
            }
        });
        getContentPane().add(jLabelImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 190, 150));

        jLabelImagen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen3.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Reloj.png")); // NOI18N
        jLabelImagen3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelImagen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelImagen3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagen3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImagen3MouseMoved(evt);
            }
        });
        jLabelImagen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImagen3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImagen3MouseExited(evt);
            }
        });
        getContentPane().add(jLabelImagen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 190, 150));

        jLabelImagen4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagen4.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Agenda.png")); // NOI18N
        jLabelImagen4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelImagen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelImagen4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelImagen4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelImagen4MouseMoved(evt);
            }
        });
        jLabelImagen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagen4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelImagen4MouseExited(evt);
            }
        });
        getContentPane().add(jLabelImagen4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 190, 150));

        jLabelMinimizar.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Expand32px.png")); // NOI18N
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 40, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 740, 20));

        jLabelSalir.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Multiply32px.png")); // NOI18N
        jLabelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalirMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 40, 40));

        jLabelHerramientas.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Icons32px.png")); // NOI18N
        jLabelHerramientas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHerramientasMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelHerramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabelMusica.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/MusicalNotes32px.png")); // NOI18N
        getContentPane().add(jLabelMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 170, 40, 40));

        jLabelInternet.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Globe32px.png")); // NOI18N
        getContentPane().add(jLabelInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 90, 40, 40));

        jLabelCalculadora.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Calculator.png")); // NOI18N
        getContentPane().add(jLabelCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 130, 40, 40));

        jLabelFondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFondo.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/FondoAzul.jpg")); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHerramientasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHerramientasMouseClicked
        //Mostrarse
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jLabelInternet);
        AnimationClass calculadora = new AnimationClass();
        calculadora.jLabelXRight(-40, 10, 10, 5, jLabelCalculadora);
        AnimationClass musica = new AnimationClass();
        musica.jLabelXRight(-40, 10, 10, 5, jLabelMusica);
        // Ocultarse
        AnimationClass internet1 = new AnimationClass();
        internet1.jLabelXLeft(10, -40, 10, 5, jLabelInternet);
        AnimationClass calculadora1 = new AnimationClass();
        calculadora1.jLabelXLeft(10, -40, 10, 5, jLabelCalculadora);
        AnimationClass musica1 = new AnimationClass();
        musica1.jLabelXLeft(10, -40, 10, 5, jLabelMusica); 
    }//GEN-LAST:event_jLabelHerramientasMouseClicked

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked

    private void jLabelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación?","EXIT",dialog);
        if (result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabelSalirMouseClicked

    private void jLabelImagen4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen4MouseMoved
        jLabelImagen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelImagen4MouseMoved

    private void jLabelImagen4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen4MouseExited
        jLabelImagen4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelImagen4MouseExited

    private void jLabelImagen1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen1MouseMoved
        jLabelImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelImagen1MouseMoved

    private void jLabelImagen1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen1MouseExited
        jLabelImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelImagen1MouseExited

    private void jLabelImagen2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen2MouseExited
        jLabelImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelImagen2MouseExited

    private void jLabelImagen2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen2MouseMoved
        jLabelImagen2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelImagen2MouseMoved

    private void jLabelImagen3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen3MouseMoved
        jLabelImagen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelImagen3MouseMoved

    private void jLabelImagen3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImagen3MouseEntered

    private void jLabelImagen3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen3MouseExited
        jLabelImagen3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelImagen3MouseExited

    private void jLabelImagen4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen4MouseClicked
        InscripcionYCancelacion ic= new InscripcionYCancelacion();
        ic.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelImagen4MouseClicked

    private void jLabelImagen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen1MouseClicked
        InformacionGrupos juego= new InformacionGrupos();
        juego.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelImagen1MouseClicked

    private void jLabelImagen2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagen2MouseClicked
        
    }//GEN-LAST:event_jLabelImagen2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelHerramientas;
    private javax.swing.JLabel jLabelImagen1;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JLabel jLabelImagen3;
    private javax.swing.JLabel jLabelImagen4;
    private javax.swing.JLabel jLabelInternet;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JLabel jLabelMusica;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTexto4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}