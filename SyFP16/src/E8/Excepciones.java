package E8;

public class Excepciones {
    
    public static void main(String[] args) {
        
       int arr []= {1,2,3,4};
        
        for (int i = 0; i <= 5; i++) {
            
            try{
            System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Estás fuera de límites");
                System.out.println(e.toString());
            }
            finally{
                System.out.println("Archivo cerrado");
            }
        }
    }
    
}
