package Er2;


public class Main extends Aarchivos {
    public static void main(String[] args) {
        
        Aarchivos a = new ArchivoTexto();
        Aarchivos b = new ArchivoBinario();
        Aarchivos c = new ArchivoImagen();
        
       
       a.abrirArchivo("fgf", "adfsdf");
       a.cerrarArchivo();
       a.desplegarArchivo();
       
       b.abrirArchivo("adfd","sdfa");
       b.cerrarArchivo();
       b.desplegarArchivo();
       
       c.abrirArchivo("asda","asd");
       c.desplegarArchivo();
       c.cerrarArchivo();
        
    }
   
}
