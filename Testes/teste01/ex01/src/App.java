import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o multiplicador da tabuada que deseja consultar: ");
        int multiplicador = Integer.parseInt(SCAN.nextLine());
        imprimeTabuada(multiplicador);
    }

    public static void imprimeTabuada(int multiplicador) {
        final int TAMANHO_TABUADA = 10;

        for (int i = 1; i <= TAMANHO_TABUADA; i++) {
            System.out.println(
                String.format("%s X %s = %s", multiplicador, i, (multiplicador * i))
            );
        }
    }
}