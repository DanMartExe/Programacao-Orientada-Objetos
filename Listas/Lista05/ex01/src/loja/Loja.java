package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String endereco;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarProduto(String descricao, double preco) {
        produtos.add(new Produto(descricao, preco));
    }

    public void listarProdutos() {
        for (Produto produto: produtos) {
            System.out.println(produto.getDescricao());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public ArrayList<Produto> getProduto() {
        return this.produtos;
    }
}