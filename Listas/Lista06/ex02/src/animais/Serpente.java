package animais;

public class Serpente implements Animal {
    private String nome;
    private double comprimentoM;

    public Serpente(String nome, double comprimentoM) {
        this.nome = nome;
        this.comprimentoM = comprimentoM;
    }

    public void comer() {
        System.out.println("~Mordendo, enrolando, sufocando e engolindo a presa");
    }

    public void emitirSom() {
        System.out.println("ssSSSsssSSSSsss");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setComprimento(double comprimentoM) {
        this.comprimentoM = comprimentoM;
    }

    public double getCor() {
        return this.comprimentoM;
    }
}