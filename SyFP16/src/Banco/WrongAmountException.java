
package Banco;


public class WrongAmountException extends Exception{

    public WrongAmountException(String message) {
        super(message);
    }

    public WrongAmountException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
