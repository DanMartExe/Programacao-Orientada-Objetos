import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Vitrine {
    private List<Produto> produtos;

    public Vitrine(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutosFiltrados(Predicate<? super Produto> condicao) {
        return produtos.stream().filter(condicao).toList();
    }

    public List<Produto> getProdutosFiltrados(String tipoFiltro, BigDecimal valor) {
        if (tipoFiltro.equals("maior")) {
            List<Produto> produtosFiltrados = new ArrayList<>();
            for (Produto produto : produtos) {
                if (produto.getPreco().compareTo(valor) == 1) {
                    produtosFiltrados.add(produto);
                }
            }
            return produtosFiltrados;
        }

        if (tipoFiltro.equals("menor")) {
            List<Produto> produtosFiltrados = new ArrayList<>();
            for (Produto produto : produtos) {
                if (produto.getPreco().compareTo(valor) == -1) {
                    produtosFiltrados.add(produto);
                }
            }
            return produtosFiltrados;
        }

        List<Produto> produtosFiltrados = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getPreco().compareTo(valor) == 0) {
                produtosFiltrados.add(produto);
            }
        }
        return produtosFiltrados;
    }
}