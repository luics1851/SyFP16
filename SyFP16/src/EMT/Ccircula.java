package EMT;

public class Ccircula implements Icircula {

    @Override
    public String getHoyNoCircula() {
        return "hoy no circula engomado verde y terminacion 1 y 2";
    }

    @Override
    public String getByPlaca(String a) {
        if(a=="5y6")
        {
            return "Lunes";
        }
        if(a=="9y0")
        {
            return "Viernes";
        }
        if(a=="7y8")
        {
            return "Martes";
        }
        if(a=="3y4")
        {
            return "Miercoles";
        }
        if(a=="1y2")
        {
            return "Jueves";
        }
        return "";
    }

    @Override
    public String getTerminacionPlaca(String b) {
        if(b=="Lunes")
        {
            return "5y6";
        }
        if(b=="Viernes")
        {
            return "9y0";
        }
        if(b=="Martes")
        {
            return "7y8";
        }
        if(b=="Miercoles")
        {
            return "3y4";
        }
        if(b=="Jueves")
        {
            return "1y2";
        }
        return"";
    }

    @Override
    public String getColor(String c) {
        if(c=="Amarillo")
        {
            return "Lunes";
        }
        if(c=="Azul")
        {
            return "Viernes";
        }
        if(c=="Rosa")
        {
            return "Martes";
        }
        if(c=="Rojo")
        {
            return "Miercoles";
        }
        if(c=="Verde")
        {
            return "Jueves";
        }
        return"";
    }
    
}
