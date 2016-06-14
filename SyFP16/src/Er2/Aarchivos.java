package Er2;


public abstract class Aarchivos {
    String nombre;
    int lectura;
    
    protected int abrirArchivo(String a, String b){
        if("leer".equals(b)){
            return 1;
        }
        return 0;
    }
    
    protected int cerrarArchivo(){
    if("leer".equals(lectura)){
        return 1;
    }
        return 0;
    }
    
    protected void desplegarArchivo(){
        
        System.out.println("no se ha abierto el archivo");
    }
    
}
