package exceptionhandling;

public class InvalidWithdrawalException extends Exception{
    public InvalidWithdrawalException(String msg)
    {
        super(msg);
    }
}
