/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import archivos.GenerarReporte;
import baseDatos.Conexion;
//import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS H
 */
public class Historial extends javax.swing.JFrame {

    /**
     * Creates new form EliminarAlum
     */
    
    DefaultTableModel model_expo;
Connection conn;
Statement sent=null;
Conexion con;

    public Historial() {
        con=new Conexion();
        initComponents();
        llenarTablaExposi();
/// ImageIcon icon = new ImageIcon(getClass().getResource("/src/ImagenesInterfaces/fondo.jpg"));

//Icon icono = new ImageIcon(icon.getImage().getScaledInstance(fondoel.getWidth(), fondoel.getHeight(), Image.SCALE_DEFAULT));
  //  fondoel.setIcon(icono);
                setLocationRelativeTo(null);

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_expo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(102, 102, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, 30));

        tabla_expo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_expo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(tabla_expo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 480, 260));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Imprimir");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("src/ImagenesInterfaces/FondoAzul.jpg"));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        ListaInformes interfaz = new ListaInformes();
        interfaz.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GenerarReporte g=new GenerarReporte();
        g.reporte();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_expo;
    // End of variables declaration//GEN-END:variables


 public void llenarTablaExposi(){
   
     if(con.isConectado()){
         System.out.println("conexion exitosa");
            conn=con.getConexion();
             try {
            
            String[]titulos = {"Carnet", "Nombre","Apellido", "Historial","Nro Contacto"}; 
            String sql = "SELECT  id_expo,nombre_expo,apellido_expo,historial,nro_contacto FROM   expositores";
            model_expo = new DefaultTableModel(null, titulos);
            sent= conn.createStatement();
            ResultSet rs=sent.executeQuery(sql);
            
            String[]fila = new String[5];
            while(rs.next()){
                fila[0]=rs.getString("id_expo");
                fila[1]=rs.getString("nombre_expo");
                fila[2]=rs.getString("apellido_expo");
                fila[3]=rs.getString("historial");
                fila[4]=rs.getString("nro_contacto");
                
                
                
                
                model_expo.addRow(fila);
            }
            tabla_expo.setModel(model_expo);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }
     
    
    }

}
