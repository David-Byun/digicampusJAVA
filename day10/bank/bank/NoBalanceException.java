package bank.bank;

public class NoBalanceException extends RuntimeException{

    public NoBalanceException(String message) {
        super(message);
    }


    public NoBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
