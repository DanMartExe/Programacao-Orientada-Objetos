import java.util.Scanner;

public class App {

    private static final Scanner READ = new Scanner(System.in);
    private static final int QUANTIDADE_VAGOES = 12;
    private static final int PESO_MAXIMO_PERMITIDO = 50;

    public static void main(String[] args) throws Exception {
        int[] trem = new int[QUANTIDADE_VAGOES];
        carregarVagoes(trem);
        verificarVagoes(trem);
    }

    public static void carregarVagoes(int[] trem) {
        for (int i = 0; i < trem.length; i++) {
            trem[i] = Integer.parseInt(READ.nextLine());
        }
    }

    public static void verificarVagoes(int[] trem) {
        for (int i = 0; i < trem.length; i++) {
            if (trem[i] > PESO_MAXIMO_PERMITIDO) {
                System.out.println((i + 1) + "º vagão esta ultrapssando o limite de peso");
            }
        }
    }
}