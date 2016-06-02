package E1;
public class Cesar {
    public String cifrar(String m, int c) 
    {
        char array [] = m.toCharArray();
        for(int i=0;i<array.length; i++ )
        {
            array[i]= (char)(array[i]+(char)c);
        }
        
       
        String cifrado = String.valueOf(array);
        return cifrado ;
        } 
    
    public String descifrar(String m, int c) 
    {
        char array [] = m.toCharArray();
        for(int i=0;i<array.length; i++ )
        {
            array[i]= (char)(array[i]-(char)c);
        }
        
        
        String descifrado = String.valueOf(array);
        return descifrado ;
        }
    
  }
