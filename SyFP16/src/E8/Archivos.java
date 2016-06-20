package E8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    
    public void leer() throws IOException {
       BufferedReader br=null;
        try {
            br = new BufferedReader(new FileReader("ejemplo.txt"));
            String linea;
            linea = br.readLine();
            while (linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
        } 
        
        catch (FileNotFoundException ex) {
           
            System.out.println("Archivo no encontrado");
        } catch (IOException ex) {
           
        }
        
        finally {
           br.close();
        }
    }
    
    public void escribir() throws IOException{
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter("ejemplo.txt",true));
        bw.write("Hola Mundo");
        bw.close();
    }
    public static void main(String[] args) throws IOException {
        Archivos L = new Archivos();
        Archivos E= new Archivos();
        
        L.leer();
        E.escribir();
    }
}
