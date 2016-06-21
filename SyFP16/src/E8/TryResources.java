package E8;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryResources {
    public static void main(String[] args) {
        
        try(BufferedReader br = new BufferedReader(new FileReader("ejemplo.txt"))){
            String linea = br.readLine();
            System.out.println(linea);
        }
        catch(Exception e){
            
        }
    }
}
