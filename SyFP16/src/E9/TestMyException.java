package E9;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestMyException {
    public void test(String m)throws MyException{
          
        if (m==null) {
            throw new MyException("Mi excepción fue lanzada");
        }
        else{
            System.out.println(m);
        }
    }
    
    public static void main(String[] args) {
        try {
            TestMyException n = new TestMyException();
            
            n.test("HOLA");
        } catch (MyException ex) {
            System.out.println(":(");
        }
     
    }
    
}
