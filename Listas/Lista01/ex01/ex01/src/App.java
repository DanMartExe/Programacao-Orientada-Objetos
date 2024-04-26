import java.util.Scanner;

public class App {
    private static final Scanner READ = new Scanner(System.in);
    private static final int TAMANHO_VETOR = 3;
    private static int[] vetor = new int[TAMANHO_VETOR];

    public static void main(String[] args) throws Exception {
        preencherVetor(vetor);

        System.out.println("\nDigite um numero inteiro para buscar no vetor: ");
        int numeroBuscado = Integer.parseInt(READ.nextLine());

        boolean numeroEncontrado = buscarNumeroNoVetor(vetor, numeroBuscado);
        if (numeroEncontrado) {
            System.out.println("\nACHEI");
        } else {
            System.out.println("\nNAO ACHEI");
        }
    }

    public static void preencherVetor(int[] vetor) {
        System.out.println("Digite " + vetor.length + " numeros inteiros para preencher o vetor");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println((i + 1) + "º termo: ");
            vetor[i] = Integer.parseInt(READ.nextLine());
        }
    }

    public static boolean buscarNumeroNoVetor(int[] vetor, int numeroBuscado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                return true;
            }
        }
        return false;
    }
}