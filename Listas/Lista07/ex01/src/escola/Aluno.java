package escola;

public class Aluno extends Usuario {
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println(getNome());
        System.out.println(getEmail());
        System.out.println(this.matricula);
    }

    public void exibirInfo(boolean exibirNome, boolean exibirEmail, boolean exibirMatricula) {
        if (exibirNome) {
            System.out.println(getNome());
        }

        if (exibirEmail) {
            System.out.println(getEmail());
        }

        if (exibirMatricula) {
            System.out.println(this.matricula);
        }
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }
}