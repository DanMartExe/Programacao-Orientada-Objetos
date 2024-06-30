import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Turma {
    private Map<Integer, Pessoa> alunos = new LinkedHashMap<>();

    public void adicionarAluno(int numeroAluno, Pessoa aluno) {
        alunos.put(numeroAluno, aluno);
    }

    public Pessoa buscarAluno(int numeroAluno) throws Exception {
        Pessoa pessoa = this.alunos.get(numeroAluno);
        if (pessoa == null) {
            throw new Exception("Aluno não encontrado!");
        }
        return pessoa;
    }

    public void listarAlunos() {
        for(Entry<Integer, Pessoa> entrada : this.alunos.entrySet()) {
            System.out.println("Numero do aluno: " + entrada.getKey());
            System.out.println("Numero do aluno: " + entrada.getValue());
        }
    }
}