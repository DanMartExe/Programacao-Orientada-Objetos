package biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private int idade;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void verLivros() {
        for (Livro livro: livros) {
            System.out.println(livro.getNome());
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
}