import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in); //Crtl .
    private static final int DISCIPLINAS = 3;

    public static void main(String[] args) throws Exception {
        int quantidadeAlunos = receberQuantidadeAlunos();

        int[][] alunos = new int[quantidadeAlunos][DISCIPLINAS]; //"new" pode ser passado como referencia
        solicitarNotasDosAlunos(alunos, quantidadeAlunos);
        apresentarNotaDosAlunosComStatus(alunos, quantidadeAlunos);
    }

    public static int receberQuantidadeAlunos() {
        System.out.println("Digite a quantidade de ALUNOS");
        return Integer.parseInt(SCAN.nextLine());
    }

    public static void solicitarNotasDosAlunos(int[][] alunos, int quantidadeAlunos) {
        for(int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno: " + (i + 1));
            for(int j = 0; j < DISCIPLINAS; j++) {
                System.out.println("Digite a nota da " + (j + 1) + "ª disciplina: ");
                alunos[i][j] = Integer.parseInt(SCAN.nextLine());
            }
            System.out.println();
        }
    }

    public static void apresentarNotaDosAlunosComStatus(int[][] alunos, int quantidadeAlunos) {
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Aluno " + (i + 1));
            double somaDasNotas = 0.0;
            for(int j = 0; j < DISCIPLINAS; j++) {
                somaDasNotas = somaDasNotas + alunos[i][j];
            }
            double media = somaDasNotas / DISCIPLINAS;
            boolean foiAprovado = media >= 5 ? true : false; //preferivel usar If

            System.out.print("Média: " + media + "Status: ");
            if (foiAprovado) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO"); //atralho "sout"
            }
            System.out.println();
        }
    }
}