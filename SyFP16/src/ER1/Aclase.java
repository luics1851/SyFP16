
package ER1;

public abstract class Aclase implements Iclase {
    
    protected String descripcion;

    public Aclase(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
 public void print(){
     System.out.println(descripcion);
 }
     
     
    
}
