package Banco;

public class Cuenta{

    double s;
    
    public double checkSaldo(){
    return s;
    }
    
    public void deposito (double a) throws WrongAmountException {
        
        if(a<=0){
            throw new WrongAmountException ("Error");
            }
        else{s=s+a;}
    }  
    public void retiro(double b)throws SaldoInsuficienteException{
        
        if(s>b){
            throw new SaldoInsuficienteException ("Saldo insuficiente");
        }
        else{ s=s-b;}
    }
    
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        
        double saldo = cuenta.checkSaldo();
        System.out.println(saldo);
        
        try{
            cuenta.deposito(500.00);
            System.out.println(saldo+cuenta.checkSaldo());
        }
        catch(WrongAmountException | SaldoInsuficienteException e){
            System.out.println(e.toString());
        }
    }
   
}
