package archivos;



import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class ColorearFilas extends DefaultTableCellRenderer {

    private final int columna_patron;
    private Component componente; 
    public ColorearFilas(int Colpatron) {
        this.columna_patron = Colpatron;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean Selected, boolean hasFocus, int row, int col) {
        
        componente=super.getTableCellRendererComponent(table, value, Selected, hasFocus, row, col);
        String valor=table.getValueAt(row, columna_patron).toString();
            if(Integer.parseInt(valor)<=5){
            componente.setBackground(Color.red);
            }else  componente.setBackground(Color.WHITE);
        return this;
    }

}
