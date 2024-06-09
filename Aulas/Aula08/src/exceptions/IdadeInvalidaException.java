package exceptions;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
        super("A idade não pode ser 0 ou negativa");
    }
}