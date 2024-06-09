import exceptions.IdadeInvalidaException;
import exceptions.NomeInvalidoException;

public class Usuario {
    private String nome;
    private int idade;

    //lança a exception de set ainda mais pra frente
    public Usuario(String nome, int idade) throws NomeInvalidoException, IdadeInvalidaException {
        //usar set, ja que agora ele está "tratando" a exception
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if (!nome.isBlank()) {
            this.nome = nome;
        } else {
            throw new NomeInvalidoException();
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade > 0) {
            this.idade = idade;
        } else {
            throw new IdadeInvalidaException();
        }
    }

    public int getIdade() {
        return this.idade;
    }
}