package Excel;
import baseDatos.Conexion;
import baseDatos.Consultas;
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

public class Reporte {

    public static void main(String args[]) throws SQLException {
        reporte();
    }

    public static void reporte() throws SQLException {

        Workbook book = new XSSFWorkbook();
        Sheet sheet = book.createSheet("Reporte");

        try {
            int imgIndex;
            try (InputStream is = new FileInputStream("src\\ImagenesInterfaces\\repor.jpg")) {
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
            fuenteTitulo.setFontName("Vivaldi");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 30);
            tituloEstilo.setFont(fuenteTitulo);

            Row filaTitulo = sheet.createRow(1);
            Cell celdaTitulo = filaTitulo.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Reporte Grupos");
            sheet.addMergedRegion(new CellRangeAddress(1,3,1,4));
            String[] cabecera = new String[]{"Hora","Id Grupo", "Nombre Expositor","Apellido Expositor", "Tema"};
            CellStyle estiloCabezera = book.createCellStyle();
            
            estiloCabezera.setFillForegroundColor(IndexedColors.GOLD.getIndex());
            estiloCabezera.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            estiloCabezera.setAlignment(HorizontalAlignment.CENTER);
            estiloCabezera.setVerticalAlignment(VerticalAlignment.CENTER);
            estiloCabezera.setBorderTop(BorderStyle.THIN);
            estiloCabezera.setBorderLeft(BorderStyle.THIN);
            estiloCabezera.setBorderRight(BorderStyle.THIN);
            estiloCabezera.setBorderBottom(BorderStyle.THIN);
            Font fuenteCabezera = book.createFont();
            fuenteCabezera.setFontName("Lucida Calligraphy");
            fuenteCabezera.setBold(true);
            fuenteCabezera.setColor(IndexedColors.BLACK.getIndex());
            fuenteCabezera.setFontHeightInPoints((short) 14);
            estiloCabezera.setFont(fuenteCabezera);
            Row filaEncabezados = sheet.createRow(5);
            for (int i = 0; i < cabecera.length; i++) {
                Cell celdaEncabezado = filaEncabezados.createCell(i);
                celdaEncabezado.setCellStyle(estiloCabezera);
                celdaEncabezado.setCellValue(cabecera[i]);
            }
            Conexion con = new Conexion();
            Connection conn = con.getConexion();
            Consultas consulta = new Consultas(conn);
            PreparedStatement ps;
            ResultSet rs = consulta.reporteGrupos();
            

            int numFilaDatos = 6;
            Font fuenteDatos = book.createFont();
            fuenteDatos.setFontName("Lucida Handwriting");
            fuenteDatos.setBold(false);
            fuenteDatos.setColor(IndexedColors.BLACK.getIndex());
            fuenteDatos.setFontHeightInPoints((short) 12);
            CellStyle datosEstilo = book.createCellStyle();
            datosEstilo.setFont(fuenteDatos);
            datosEstilo.setAlignment(HorizontalAlignment.RIGHT);
            datosEstilo.setVerticalAlignment(VerticalAlignment.CENTER);
            datosEstilo.setBorderTop(BorderStyle.THIN);
            datosEstilo.setBorderLeft(BorderStyle.THIN);
            datosEstilo.setBorderRight(BorderStyle.THIN);
            datosEstilo.setBorderBottom(BorderStyle.THIN);
            int numCol = 5;
            
            while (rs.next()) {
                Row filaDatos = sheet.createRow(numFilaDatos);
                for (int a = 0; a <numCol; a++) {
                    Cell CeldaDatos = filaDatos.createCell(a);
                    CeldaDatos.setCellStyle(datosEstilo);
                    if(a == 1){
                        CeldaDatos.setCellValue(rs.getInt(a+1));
                    }else{
                        CeldaDatos.setCellValue(rs.getString(a+1).toUpperCase());
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
            try (FileOutputStream fileOut = new FileOutputStream("src\\ReporteExcel\\ReporteGrupos.xlsx")) {
                book.write(fileOut);
                String file = "src\\ReporteExcel\\ReporteGrupos.xlsx";
                Runtime.getRuntime().exec("cmd /c start "+file);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | SQLException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
