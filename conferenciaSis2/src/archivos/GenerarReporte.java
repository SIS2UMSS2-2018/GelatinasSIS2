/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import baseDatos.Conexion;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LUIS
 */

public class GenerarReporte {
    Conexion con;
Connection conn;
    public void reporte(){
            con=new Conexion();

        try {
            JasperReport reporte = (JasperReport)JRLoader.loadObject("historial.jasper");
            
            Map parametro= new HashMap();
            JasperPrint j = JasperFillManager.fillReport(reporte, null,con.getConexion());
            JasperViewer jv = new JasperViewer(j,false);
             jv.setTitle("INFORMACION EXPOSITORES");
             jv.setVisible(true);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "error al mostrar el reporte  "+e);
            System.out.println(""+ e);
        }
    }
  
    public void pdf1(){
    try {
            JasperReport reporte = (JasperReport)JRLoader.loadObject("tabla.jasper");
            
            Map parametro= new HashMap();
            JasperPrint j = JasperFillManager.fillReport(reporte, null,con.getConexion());
            JasperViewer jv = new JasperViewer(j,false);
          JasperExportManager.exportReportToPdfFile( j, "src/docs/Primera Etapa/reporte.pdf");

           //  jv.setTitle("Reporte Ganadores");
            // jv.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al mostrar el reporte"+e);
        }     
  }
  
}
