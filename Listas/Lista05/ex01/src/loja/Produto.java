package loja;

public class Produto {
    private String descricao;
    private double preco;
    private double porcentagemDeDesconto;
    private boolean temNoEstoque;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco; 
    }

    public void ImprimirDetalhes() {
        System.out.println(descricao);
        System.out.println(preco);
        System.out.println(porcentagemDeDesconto);
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPorcentagemDeDesconto(double porcentagemDeDesconto) {
        this.porcentagemDeDesconto = porcentagemDeDesconto;
    }

    public double getPorcentagemDeDesconto() {
        return this.porcentagemDeDesconto;
    }

    public void setTemNoEstoque(boolean temNoEstoque) {
        this.temNoEstoque = temNoEstoque;
    }

    public boolean getTemNoEstoque() {
        return this.temNoEstoque;
    }
}