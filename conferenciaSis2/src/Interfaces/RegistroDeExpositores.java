/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import baseDatos.Consultas;

/**
 *
 * @author Edgar Ruben B
 */
public class RegistroDeExpositores extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDeExpositores
     */
    Consultas co;
    public RegistroDeExpositores(Consultas co) {
        this.co = co;
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

        jButtonAtras = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAtras.setBackground(new java.awt.Color(102, 102, 255));
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 370, -1));

        jButtonRegistrar.setBackground(new java.awt.Color(102, 102, 255));
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar Expositor");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Apellido:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de contacto:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 370, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 370, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 370, -1));

        jLabelNombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre1.setText("Historial:");
        getContentPane().add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 70, -1));

        jLabelNombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre2.setText("Nombre:");
        getContentPane().add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 70, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 560, -1));

        jLabelNombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre3.setText("Actividades:");
        getContentPane().add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 100, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informacion del expositor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 330, 50));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesInterfaces/FondoAzul.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Principal interfaz = new Principal(co);
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeExpositores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeExpositores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeExpositores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeExpositores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new RegistroDeExpositores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
