package exceptions;

public class AlternativaInvalidaException extends Exception {

    public AlternativaInvalidaException() {
        super("A alternativa escolhida não existe, por favor, tente novamente.");
    }
}