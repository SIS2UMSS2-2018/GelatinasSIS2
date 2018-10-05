/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Edgar Ruben B
 */
public class IngresarDatos extends javax.swing.JFrame {

    /**
     * Creates new form InterfazIngresarDatos
     */
    public IngresarDatos() {
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

        jButtonIngresarDatos = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldOcupacion = new javax.swing.JTextField();
        jTextFieldActividad = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelOcupacion = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelActividad = new javax.swing.JLabel();
        jLabelImagenEstudiante = new javax.swing.JLabel();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 440));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(740, 520));
        setSize(new java.awt.Dimension(740, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIngresarDatos.setBackground(new java.awt.Color(102, 102, 255));
        jButtonIngresarDatos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresarDatos.setText("Ingresar Datos");
        jButtonIngresarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, -1, -1));
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 340, -1));
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 340, -1));
        getContentPane().add(jTextFieldOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 340, -1));
        getContentPane().add(jTextFieldActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 340, -1));

        jButtonAtras.setBackground(new java.awt.Color(102, 102, 255));
        jButtonAtras.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setText("Atrás");
        jButtonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("NOMBRE:");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 70, -1));

        jLabelOcupacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelOcupacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOcupacion.setText("OCUPACIÓN:");
        getContentPane().add(jLabelOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, -1, -1));

        jLabelCorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("CORREO:");
        getContentPane().add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabelActividad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelActividad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActividad.setText("ACTIVIDAD:");
        getContentPane().add(jLabelActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabelImagenEstudiante.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/Estudiante.png"));
        getContentPane().add(jLabelImagenEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 20, 460, 480));

        jLabelRegistro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setText("REGISTRO ASISTENTES");
        getContentPane().add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/FondoAzul.jpg"));
        jLabelFondo.setMaximumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 1, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        InscripcionYCancelacion interfaz = new InscripcionYCancelacion();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonIngresarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarDatosActionPerformed
        NotificacionRegistro interfaz = new NotificacionRegistro();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonIngresarDatosActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonIngresarDatos;
    private javax.swing.JLabel jLabelActividad;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelImagenEstudiante;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelOcupacion;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JTextField jTextFieldActividad;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldOcupacion;
    // End of variables declaration//GEN-END:variables
}
