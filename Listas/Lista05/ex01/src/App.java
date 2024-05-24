import loja.Loja;
import loja.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja("Mercador Ambulante", "Summoner's Rift");
        Produto produto = new Produto("Pocao de Elxir da Sabedoria", 500.00);
        produto.setPorcentagemDeDesconto(0.15);
        produto.setTemNoEstoque(true);

        System.out.println(produto.getDescricao());

        loja.adicionarProduto("Pocao de vida", 50.00);
        loja.adicionarProduto("Pocao de Mana", 50.00);

        loja.listarProdutos();

        System.out.println(loja.getProduto().get(1).getDescricao());
    }
}