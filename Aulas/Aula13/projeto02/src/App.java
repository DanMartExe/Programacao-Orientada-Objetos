import java.math.BigDecimal;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Vitrine vitrine = new Vitrine(new ArrayList<>());
        // Adicionando produtos
        {
            vitrine.adicionarProduto(new Produto(0, "Smartphone", new BigDecimal(1000)));
            vitrine.adicionarProduto(new Produto(1, "Fone de ouvido", new BigDecimal(30)));
            vitrine.adicionarProduto(new Produto(2, "Capinha", new BigDecimal(40)));
            vitrine.adicionarProduto(new Produto(3, "Caixinha de som", new BigDecimal(300)));
        }

        //utilizando Predicate: (envia condição/função por paramêtro, filtro + poderoso/flexível)
        List<Produto> produtosFiltradosPreco = vitrine.getProdutosFiltrados(produto ->
            produto
            .getPreco()
            .compareTo(new BigDecimal(50)) == 1
        );

        List<Produto> produtosFiltradosNome = vitrine.getProdutosFiltrados(produto ->
            produto
            .getNome().contains("som")
        );

        List<Produto> produtosFiltradosEhPar = vitrine.getProdutosFiltrados(produto ->
            produto
            .getId() % 2 == 0
        );

        //modo feio:
        // .getProdutosFiltrados("maior", new BigDecimal(100));
        
        for (Produto produto : produtosFiltradosNome) {
            System.out.println(produto);
        }
    }
}