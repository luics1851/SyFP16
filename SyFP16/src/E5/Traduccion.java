package E5;
import java.util.List;
import java.util.ArrayList;

public class Traduccion {
   List <String> palabras;
   List <String> traducc;
   
   public String traducir(String s)
   {
       int i=palabras.indexOf(s);
               if(i==-1)
               {
                   return s;
               }
               
               else { return traducc.get(i);}
       
   }
   
   public void agregar(String a, String b)
   {
       palabras.add(a);
       traducc.add(b);
   }
    
   public Traduccion()
    {
       palabras = new ArrayList<>();
       traducc = new ArrayList<>();
    }
   
   
   public String eliminar(String m)
   {
       return "-1";
   }
   
    public static void main(String[] args) {
        
        Traduccion traduccion = new Traduccion();
        
        traduccion.agregar("repobar", "fail");
        
        List<Traduccion> lista;
       lista = new ArrayList<>();
        
        
    }
   
    
}
