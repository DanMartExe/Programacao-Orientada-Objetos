import java.util.Scanner;

public class App {
    public static final int ANO_ATUAL = 2024;

    public static void main(String[] args) {
        Scanner SCAN = new Scanner(System.in);
        System.out.println("Digite o seu ano de nascimento: ");
        int anoNascimento = Integer.parseInt(SCAN.nextLine());

        int idade = contarIdadeAteAnoAtual(anoNascimento);
        System.out.println(String.format("Ate o final de 2024 voce tera %s anos", idade));
    }

    public static int contarIdadeAteAnoAtual(int anoNascimento) {
        return ANO_ATUAL - anoNascimento;
    }
}