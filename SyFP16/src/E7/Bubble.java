
package E7;

import java.util.ArrayList;
import java.util.List;


public class Bubble implements ISort{

    @Override
    public int[] ordenar(int[] array) {
          int arra[];
        System.out.println("Estoy en la clase Bubble y en el metodo Arreglo de enteros");
        return array;
    }

    @Override
    public List<Integer> ordenar(List<Integer> array) {
         List<Integer> x=new ArrayList<>();
        
        Integer a= new Integer ("8");
        Integer b= new Integer ("7");
        Integer c= new Integer ("6");
        Integer d= new Integer ("5");
        Integer e= new Integer ("4");
        
        x.add(a);
        x.add(b);
        x.add(c);
        x.add(d);
        x.add(e);
        
        return x;
    }
    
}
