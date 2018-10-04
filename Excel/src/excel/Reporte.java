package excel;
import baseDatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.common.IOUtil;

public class Reporte {

    public static void main(String args[]) throws SQLException {
        reporte();
    }

    public static void reporte() throws SQLException {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Reporte");

        try {
            int imgIndex;
            try (InputStream is = new FileInputStream("src\\img\\Repor.jpg")) {
                byte[] bytes = IOUtils.toByteArray(is);
                imgIndex = book.addPicture(bytes, Workbook.PICTURE_TYPE_JPEG);
            }

            CreationHelper help = book.getCreationHelper();
            Drawing draw = sheet.createDrawingPatriarch();

            ClientAnchor anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setRow1(1);
            Picture pict = draw.createPicture(anchor, imgIndex);
            pict.resize(1, 3);

            CellStyle tituloEstilo = book.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            Font fuenteTitulo = book.createFont();
            fuenteTitulo.setFontName("Comic Sans MS");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 20);
            tituloEstilo.setFont(fuenteTitulo);

            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte Grupos");
            sheet.addMergedRegion(new CellRangeAddress(1,3,1,4));
            String[] cabecera = new String[]{"Hora","Id Grupo", "Nombre Expositor","Apellido Expositor", "Tema"};
            CellStyle headerStyle = book.createCellStyle();
            headerStyle.setFillForegroundColor(IndexedColors.GOLD.getIndex());
            headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            headerStyle.setBorderLeft(BorderStyle.THIN);
            headerStyle.setBorderRight(BorderStyle.THIN);
            headerStyle.setBorderBottom(BorderStyle.THIN);
            Font font = book.createFont();
            font.setFontName("Comic Sans MS");
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            font.setFontHeightInPoints((short) 13);
            headerStyle.setFont(font);
            Row filaEncabezados = sheet.createRow(5);
            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellStyle(headerStyle);
                celdaEncabezado.setCellValue(cabecera[i]);
            }
            Conexion con = new Conexion();
            PreparedStatement ps;
            ResultSet rs;
            Connection conn = con.conectar();

            int numFilaDatos = 6;

            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            datosEstilo.setBorderLeft(BorderStyle.THIN);
            datosEstilo.setBorderRight(BorderStyle.THIN);
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            
            ps = (PreparedStatement) conn.prepareStatement("SELECT hora, grupos_id_grupo, nombre_expo, apellido_expo, nombre_tema FROM cronograma, expositores, temas WHERE id_expo = id_expo and id_expo = id_temas");
            rs = (ResultSet) ps.executeQuery();
            int numCol = 5;
            
            while (rs.next()) {
                Row filaDatos = sheet.createRow(numFilaDatos);
                String hora = rs.getString(1);
                int id_grupo = rs.getInt(2);
                String nombreExpo = new String();
                nombreExpo = rs.getString(3);
                String apellidoExpo = rs.getString(4);
                System.out.println(hora+" "+id_grupo+"-"+nombreExpo + "-" + apellidoExpo+"-");
                String nombreTema = rs.getString(5);
                for (int a = 0; a < numCol; a++) {

                    Cell CeldaDatos = filaDatos.createCell(a);
                    CeldaDatos.setCellStyle(datosEstilo);
                    if(a == 0){
                        CeldaDatos.setCellValue(hora);
                    }
                    if(a == 1){
                        CeldaDatos.setCellValue(id_grupo);
                    }
                    if(a == 2){
                        CeldaDatos.setCellValue(nombreExpo.toUpperCase());
                    }
                    if(a == 3){
                        CeldaDatos.setCellValue(apellidoExpo.toUpperCase());
                    }
                    if(a == 4){
                        CeldaDatos.setCellValue(nombreTema.toUpperCase());
                    }            
                }
                numFilaDatos++;
            }         
            sheet.autoSizeColumn(0);
            sheet.autoSizeColumn(1);
            sheet.autoSizeColumn(2);
            sheet.autoSizeColumn(3);
            sheet.autoSizeColumn(4);
            
            sheet.setZoom(120);
            try (FileOutputStream fileOut = new FileOutputStream("ReporteGrupos.xlsx")) {
                book.write(fileOut);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

            

            

            

            

            

            
            
