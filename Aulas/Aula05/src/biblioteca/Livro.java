package biblioteca;

public class Livro {
    private String nome;
    private int classificacaoIndicativa;
    private boolean estaEmprestado;

    public Livro(String nome, int classificacaoIndicativa) {
        setNome(nome);
        this.classificacaoIndicativa = classificarLivro(classificacaoIndicativa);
    }

    public Livro() {} //construtores são sempre os primeiros metodos

    //outras classes (convencao)

    private int classificarLivro(int classificacaoIndicativa) {
        if (classificacaoIndicativa < 0) {
            return 0;
        }

        if (classificacaoIndicativa > 18) {
            return 18;
        }

        return classificacaoIndicativa;
    }

    public Livro(String nome) {
        this.nome = nome;
    }

    public void setClassificacaoIndicativa(int classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public int getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public Boolean setEstaEmprestado(boolean estaEmprestado) {
        return this.estaEmprestado;
    }

    public Boolean getEstaEmprestado() {
        return estaEmprestado;
    }

    public void setNome(String nome) { //getters e setters vem sempre no final
        if (nome.isBlank()) {
            this.nome = "DESCONHECIDO";
        } else {
            this.nome = nome; //this se refere a propria classe Livro
        } 
    }

    public String getNome() {
        return nome;
    }
}