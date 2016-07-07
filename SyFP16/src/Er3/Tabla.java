package Er3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public final class Tabla extends AbstractTableModel {
    
    String m[][];
    int i=0;

    public Tabla(String s){
        m=new String [4][3];
        m[0][0]="1";
        m[0][1]="Frame";
        m[0][2]=" "+frame(s);
        
        m[1][0]="2";
        m[1][1]="glue";
        m[1][2]=" "+glue(s);
        
        m[2][0]="3";
        m[2][1]="puzzle";
        m[2][2]=" "+puzzle(s);
        
        m[3][0]="4";
        m[3][1]="storage";
        m[3][2]=" " + storage(s);
        
    }
    
    public int frame (String s) {
        String row[];
        BufferedReader br;
            
        try {
                br= new BufferedReader(new FileReader(s));
                  String linea =br.readLine();
                while(linea!=null){
                    row=linea.split(";");
                    if(linea.equals("FRAME")){
                        i=i+1;
                    }                   
                }
            } 
        
        catch (FileNotFoundException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }       
        return i;
    }
    
    public int glue (String s) {
        String row[];
        BufferedReader br;
            
        try {
                br= new BufferedReader(new FileReader(s));
                  String linea =br.readLine();
                while(linea!=null){
                    row=linea.split(";");
                    if(linea.equals("GLUE")){
                        i=i+1;
                    }                   
                }
            } 
        
        catch (FileNotFoundException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }    
        return i;
    }
        
    public int puzzle (String s) {
        String row[];
        BufferedReader br;
            
        try {
                br= new BufferedReader(new FileReader(s));
                  String linea =br.readLine();
                while(linea!=null){
                    row=linea.split(";");
                    if(linea.equals("PUZZLE")){
                        i=i+1;
                    }                   
                }
            } 
                
        catch (FileNotFoundException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }   
        return i;
    }
            
    public int storage (String s) {    
        String row[];
        BufferedReader br;
            
        try {
                br= new BufferedReader(new FileReader(s));
                  String linea =br.readLine();
                while(linea!=null){
                    row=linea.split(";");
                    if(linea.equals("STORAGE")){
                        i=i+1;
                    }                   
                }
            } 
        
        catch (FileNotFoundException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
            }   
        return i;
    }
   
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return m[rowIndex][columnIndex];
    }
    
}
