package carta;

public final class CartaDesarme extends Carta {

    public CartaDesarme(String nome) {
        super("Desarme");
    }

    @Override
    public void realizarAcao() {
        System.out.println("Desarmou a bomba, ta safe");
    }
}