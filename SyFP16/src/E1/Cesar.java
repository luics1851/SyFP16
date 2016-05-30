package E1;
public class Cesar {
    public static void main(String[] args) {
        
        String mensaje = "Hola amorcito";
        
        char array [] = mensaje.toCharArray();
        
        for(int i=0;i<array.length; i++ )
        {
            array[i]= (char)(array[i]+(char)1);
        }
        
        
        String cifrado = String.valueOf(array);
        
        
        System.out.println(cifrado);
    }
   
}
