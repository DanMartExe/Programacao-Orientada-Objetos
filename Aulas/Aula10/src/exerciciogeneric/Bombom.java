package exerciciogeneric;

public class Bombom {
    private String nome;

    public Bombom(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //tudo em Java é filho, neto, etc... de Object
    //sobescrevendo metodo de Object:
    //sobrescrever pq se n vai comparar endereço de memória
    @Override
    public boolean equals(Object objeto) {
        if (super.equals(objeto)) {
            return true;
        }

        if (objeto instanceof Bombom) {
            Bombom bombom = (Bombom) objeto;
            if (bombom.getNome().equals(this.nome)) {
                return true;
            }
        }
        return false;
    }

    //p n imprimir endereço de memória
    //toString está implicito na impressão de algo na tela, sout(a.toString)
    // @Override
    // public String toString() {
    //     return this.nome;
    // }

    @Override
    public String toString() {
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("O bombom se chama: ").append(this.nome).append(", ");

        if (!ehChocolateBranco) {
            mensagem.append("e não é de chocolate branco!").toString();
        } else {
            mensagem.append("e é de chocolate branco!").toString();
        }

        return mensagem.toString();
    }
}