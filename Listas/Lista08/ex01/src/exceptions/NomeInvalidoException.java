package exceptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException() {
        super("O nome do produto precisa conter no minimo TRES caracteres!");
    }
}