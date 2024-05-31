package animais;

public class Gato implements Animal {
    private String nome;
    private String cor;

    public Gato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void comer() {
        System.out.println("croc croc croc...");
    }

    public void emitirSom() {
        System.out.println("Miau, Miau, MIAU");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }
}