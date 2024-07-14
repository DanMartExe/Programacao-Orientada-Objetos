import java.math.BigDecimal;

public class Produto {
    private int id;
    private String nome;
    //BigDecimal p/ valores sensíveis;
    private BigDecimal preco;

    public Produto(int id, String nome, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.preco = valor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getPreco() {
        return preco;
    }
    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}