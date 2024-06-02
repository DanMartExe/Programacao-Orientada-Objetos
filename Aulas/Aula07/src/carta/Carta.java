package carta;

public abstract class Carta {
    private String nome;
    private Boolean revelada = false;

    //O construtor/set/get nesse caso dispensa o protected
    public Carta(String nome) {
        this.nome = nome;
    }

    public Carta(String nome, boolean revelada) {
        this.nome = nome;
        this.revelada = revelada;
    }

    //final no método: não pode ser subscrito
    public final void revelarCarta() { 
        if (revelada) {
            return;
        }

        revelada = true;
    }

    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s,
            Revelada: %s,
            """,
            nome,
            revelada
        ));
    }

    //uma espécie de cláusula do contrato, semelhante aos da interface
    //neste caso as subclasses são obrigadas a subescrever
    public abstract void realizarAcao();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //is é equivalente a get de um Boolean
    public boolean isRevelada() {
        return revelada;
    }

    public void setRevelada(boolean revelada) {
        this.revelada = revelada;
    }
}