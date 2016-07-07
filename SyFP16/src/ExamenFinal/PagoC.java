package ExamenFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public final class PagoC extends AbstractTableModel{
    public String m[][];
    public String names[];
    public String nombreArchivo;
    int amex=0, cash=0, chec=0, mast=0, othe=0, visa=0;

    @Override
    public String getColumnName(int column) {
        return names[column];
    }

    public PagoC(String nombre) {
        
        names = new String[]{"id", "payment method", "total"};
        nombreArchivo = nombre;
        leerArchivo();
        m = new String[6][3];
        m[0][0]="1";
        m[0][1]="AMEX";
        m[0][2]=" "+amex;
        
        m[1][0]="2";
        m[1][1]="CASH";
        m[1][2]=" "+ cash;
        
        m[2][0]="3";
        m[2][1]="CHEC";
        m[2][2]=" "+chec;
        
        m[3][0]="4";
        m[3][1]="MAST";
        m[3][2]=" "+mast;
        
        m[4][0]="5";
        m[4][1]="OTHE";
        m[4][2]=""+othe;
        
        m[5][0]="6";
        m[5][1]="VISA";
        m[5][2]=" "+visa;
        
    }
    
    
    
    @Override
    public int getRowCount() {
        return 6;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    public void leerArchivo()
    {
        
        try(BufferedReader br = new BufferedReader(new FileReader("invoices.csv")))
        {
            String linea;
            linea = br.readLine();
            
            while(linea != null)
            {
                String row[];
                row = linea.split(";");               
                if(row[3].equals("\"AMEX\""))
                {
                    amex = amex + 1;
                }
                if(row[3].equals("\"CASH\""))
                {
                    cash = cash + 1;
                }
                if(row[3].equals("\"CHEC\""))
                {
                    chec= chec + 1;
                }
                if(row[3].equals("\"MAST\""))
                {
                    mast = mast + 1;
                }
                if(row[3].equals("\"OTHE\""))
                {
                    othe = othe + 1;
                }
                if(row[3].equals("\"VISA\""))
                {
                    visa = visa + 1;
                }
                linea = br.readLine();
             
            }                       
        } catch (IOException ex) {
            System.out.println("hola");
        }
        System.out.println(mast);
    }
}
