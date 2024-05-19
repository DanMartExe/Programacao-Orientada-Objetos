package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;

        livros.add(new Livro("Romeu e Julieta", 18));
        livros.add(new Livro("Senhor dos aneis", 12));
        livros.add(new Livro("Percy Jackson e o Ladrao de Raios", 0));
    }

    public void emprestarLivro(Usuario usuario, Livro livro) {
        if (livros.contains(livro)) {
            System.out.println("Nem existe!!!");
        }

        if (usuario.getIdade() < livro.getClassificacaoIndicativa()) {
            System.out.println("Vê se cresce");
            return;
        }

        if (livro.getEstaEmprestado()) {
            System.out.println("Ja emprestamos");
            return;
        }

        System.out.println("Ta aqui: " + livro.getNome());
        usuario.getLivros().add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
}