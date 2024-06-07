import escola.Aluno;
import escola.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("Daniel", "d@aluno.ifsp.edu.br", "666");
        Professor professor = new Professor("Davi", "dd@gmail.com", "Programação Orientada a Objeto");

        aluno.exibirInfo();
        professor.exibirInfo();

        aluno.exibirInfo(true, true, false);
        professor.exibirInfo(true, false, true);
    }
}