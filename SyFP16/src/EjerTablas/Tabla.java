package EjerTablas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.AbstractTableModel;

public class Tabla extends AbstractTableModel {
    String m[][];
    int i=0;
    public Tabla(String s) throws FileNotFoundException, IOException{
        m=new String [101][5];
        String row[];
        BufferedReader br;
        br= new BufferedReader(new FileReader(s));
        
        String linea =br.readLine();
                while(linea!=null){
                    row=linea.split(",");
                    m[i]=row;
                    i=i+1;
                    linea=br.readLine();
                }
        
    }

    @Override
    public int getRowCount() {
        return 101;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return m[rowIndex][columnIndex];
    }
    
    
}
