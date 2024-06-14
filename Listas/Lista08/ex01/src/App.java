import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto queijo = new Produto("Queijo", 39.99);

        System.out.println(
            "Nome: %s, Preco: R$ %s ".formatted(
            queijo.getNome(),
            queijo.getPreco())
        );

        try {
            Produto queijoSemNome = new Produto("Qu", 39.99);
        } catch(NomeInvalidoException | PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }

        try {
            Produto queijoSemPreco = new Produto("Queijo", 0);
        } catch(NomeInvalidoException | PrecoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}