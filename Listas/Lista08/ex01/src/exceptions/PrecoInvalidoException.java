package exceptions;

public class PrecoInvalidoException extends Exception {
    public PrecoInvalidoException() {
        super("O preco declarado precisa ser positivo e diferente de zero!");
    }
}