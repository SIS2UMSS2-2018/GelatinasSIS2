/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgar Ruben B
 */
public class ListaInformes extends javax.swing.JFrame {

    /**
     * Creates new form ListaInformes
     */
    public ListaInformes() {
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

        jButtonAtrás = new javax.swing.JButton();
        jLabelTexto = new javax.swing.JLabel();
        jLabelTexto1 = new javax.swing.JLabel();
        jLabelTexto4 = new javax.swing.JLabel();
        jLabelTexto2 = new javax.swing.JLabel();
        jLabelTexto3 = new javax.swing.JLabel();
        jLabelTexto5 = new javax.swing.JLabel();
        jLabelTexto6 = new javax.swing.JLabel();
        jLabelTexto7 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtrás.setBackground(new java.awt.Color(102, 102, 255));
        jButtonAtrás.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtrás.setText("Atrás");
        jButtonAtrás.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrásActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtrás, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        jLabelTexto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto.setText("Informe cronograma de actividades");
        jLabelTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTextoMouseMoved(evt);
            }
        });
        jLabelTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTextoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTextoMouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, 30));

        jLabelTexto1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto1.setText("Informe participantes por tema");
        jLabelTexto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto1MouseMoved(evt);
            }
        });
        jLabelTexto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto1MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 230, 30));

        jLabelTexto4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto4.setText("Informe número de asistentes por grupo");
        jLabelTexto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto4MouseMoved(evt);
            }
        });
        jLabelTexto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto4MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 270, 30));

        jLabelTexto2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto2.setText("Informe historial de expositores");
        jLabelTexto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto2MouseMoved(evt);
            }
        });
        jLabelTexto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTexto2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto2MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 230, 30));

        jLabelTexto3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto3.setText("Información de contacto de expositores");
        jLabelTexto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto3MouseMoved(evt);
            }
        });
        jLabelTexto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTexto3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto3MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 270, 30));

        jLabelTexto5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto5.setText("Informe cupos disponibles por grupo");
        jLabelTexto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto5MouseMoved(evt);
            }
        });
        jLabelTexto5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTexto5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto5MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 270, 30));

        jLabelTexto6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto6.setText("Informe actividades por grupo");
        jLabelTexto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto6MouseMoved(evt);
            }
        });
        jLabelTexto6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto6MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 270, 30));

        jLabelTexto7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTexto7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTexto7.setText("Informe de estudiantes por grupo");
        jLabelTexto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        jLabelTexto7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelTexto7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelTexto7MouseMoved(evt);
            }
        });
        jLabelTexto7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelTexto7MouseExited(evt);
            }
        });
        getContentPane().add(jLabelTexto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 230, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/FondoAzul.jpg"));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTexto7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto7MouseMoved
        jLabelTexto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto7MouseMoved

    private void jLabelTextoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTextoMouseMoved
        jLabelTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTextoMouseMoved

    private void jLabelTexto1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto1MouseMoved
        jLabelTexto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto1MouseMoved

    private void jLabelTexto2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto2MouseMoved
        jLabelTexto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto2MouseMoved

    private void jLabelTexto4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto4MouseMoved
        jLabelTexto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto4MouseMoved

    private void jLabelTexto3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto3MouseMoved
        jLabelTexto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto3MouseMoved

    private void jLabelTexto5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto5MouseMoved
        jLabelTexto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto5MouseMoved

    private void jLabelTexto6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto6MouseMoved
        jLabelTexto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLabelTexto6MouseMoved

    private void jLabelTexto7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto7MouseExited
        jLabelTexto7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto7MouseExited

    private void jLabelTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTextoMouseExited
        jLabelTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTextoMouseExited

    private void jLabelTexto1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto1MouseExited
        jLabelTexto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto1MouseExited

    private void jLabelTexto2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto2MouseExited
        jLabelTexto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto2MouseExited

    private void jLabelTexto4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto4MouseExited
        jLabelTexto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto4MouseExited

    private void jLabelTexto3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto3MouseExited
        jLabelTexto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto3MouseExited

    private void jLabelTexto5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto5MouseExited
        jLabelTexto5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto5MouseExited

    private void jLabelTexto6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto6MouseExited
        jLabelTexto6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,51,102)));
    }//GEN-LAST:event_jLabelTexto6MouseExited

    private void jButtonAtrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrásActionPerformed
        Principal interfaz= new Principal();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtrásActionPerformed

    private void jLabelTexto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto2MouseClicked
        Historial interfaz = new Historial();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelTexto2MouseClicked

    private void jLabelTexto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto3MouseClicked
        InformacionExpositores interfaz = new InformacionExpositores();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelTexto3MouseClicked

    private void jLabelTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTextoMouseClicked
        InformacionGrupos interfaz = new InformacionGrupos();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelTextoMouseClicked

    private void jLabelTexto5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTexto5MouseClicked
        CupoDisponible interfaz = null;
        try {
            interfaz = new CupoDisponible();
        } catch (SQLException ex) {
            Logger.getLogger(ListaInformes.class.getName()).log(Level.SEVERE, null, ex);
        }
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelTexto5MouseClicked

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
            java.util.logging.Logger.getLogger(ListaInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaInformes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaInformes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtrás;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTexto;
    private javax.swing.JLabel jLabelTexto1;
    private javax.swing.JLabel jLabelTexto2;
    private javax.swing.JLabel jLabelTexto3;
    private javax.swing.JLabel jLabelTexto4;
    private javax.swing.JLabel jLabelTexto5;
    private javax.swing.JLabel jLabelTexto6;
    private javax.swing.JLabel jLabelTexto7;
    // End of variables declaration//GEN-END:variables
}