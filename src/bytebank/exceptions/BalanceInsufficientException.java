package bytebank.exceptions;

public class BalanceInsufficientException extends RuntimeException {

    public BalanceInsufficientException(String message) {
        super(message);
    }

}
