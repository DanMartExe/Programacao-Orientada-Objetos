import java.util.List;

import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme(
            "Furiosa",
            "George Miller",
            List.of("Anya", "Thor")
        );
        
        Jogo jogo = new Jogo(
            "Advance Wars",
            "Visual Game Boy Advance"
        );

        Locadora locadora = new Locadora<>();
        locadora.adicionarItem(filme);
        locadora.adicionarItem(jogo);

        locadora.listarItens();

        String tituloProcurado = "Advance Wars";

        locadora.buscarItem(tituloProcurado);
    }
}