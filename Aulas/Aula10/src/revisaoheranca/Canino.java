package revisaoheranca;
// só pode haver um extends (herança),
// mas varios implements (interface)

public class Canino extends Animal {
    private String cor;

    public Canino(String nomeCientifico, String cor) {
        super(nomeCientifico);
        setCor(cor);
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}