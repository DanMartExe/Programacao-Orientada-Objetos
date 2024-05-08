import java.util.Scanner;

public class App {
    public static final Scanner SCAN = new Scanner(System.in);
    public static final int QUANTIDADE_CRITICOS = 3;
    public static double[] notas = new double[QUANTIDADE_CRITICOS];

    public static void main(String[] args) {
        System.out.println("Digite as notas dos criticos sobre o filme\n");
        receberNotasDosCriticos();
        imprimirNotaMediaDoFilme();
    }

    public static void receberNotasDosCriticos() {
        for (int i = 0; i < QUANTIDADE_CRITICOS; i++) {
            System.out.println(String.format("Digite a nota do %s° critico: ", (i + 1)));
            notas[i] = Integer.parseInt(SCAN.nextLine());
        }
    }

    public static void imprimirNotaMediaDoFilme() {
        int mediaDoFilme = 0;
        for (int i = 0; i < QUANTIDADE_CRITICOS; i++) {
            mediaDoFilme += notas[i];
        }
        System.out.println(String.format("%nA media do filme eh: %s!",(mediaDoFilme / QUANTIDADE_CRITICOS)));
    }
}