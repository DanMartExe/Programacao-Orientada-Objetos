import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Digite um número inteiro: ");
        boolean numeroEhPar = ehPar(Integer.parseInt(SCAN.nextLine()));

        if (numeroEhPar) {
            System.out.println("Eh par");
        } else {
            System.out.println("Nao eh par");
        }
    }

    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}