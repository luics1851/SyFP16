package E6;

import java.util.HashMap;
import java.util.Map;


public class Convertidor 
{
    Map <String,Double> mapa;
    
    public double convertir(String a, Double b, String c)
    {
        if(mapa.containsKey(a))
        {
            double x=mapa.get(a);
            x=x*b;
            double y=mapa.get(c);
            return x/y;
        }
        return 0.0;
    }
   
    public Convertidor()
    {
        mapa = new HashMap();
        
        mapa.put("centimetros",0.01);
        mapa.put("metros",1.0);
        mapa.put("kilometros",1000.0);
        mapa.put("pulgadas",0.0254);
        mapa.put("pies",0.305);
        mapa.put("yardas",0.919);
        mapa.put("millas",1613.0);
    }
    public static void main(String[] args) 
    {
        Convertidor convertir = new Convertidor();
        double res;
        res = convertir.convertir("centimetros",30.0,"pies");
        System.out.println(res);
    }
}
