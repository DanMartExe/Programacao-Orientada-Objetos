import java.util.Scanner;

public class App {
    private static final Scanner READ = new Scanner(System.in);
    private static int TAMANHO_MATRIZ_QUADRATICA = 4;
    private static boolean[][] matriz = new boolean[TAMANHO_MATRIZ_QUADRATICA][TAMANHO_MATRIZ_QUADRATICA];

    public static void main(String[] args) throws Exception {
        preencherMatrizComFalse(matriz);

        System.out.println("Digite as coordenadas da torre no mapa " + matriz.length + "X" + matriz[0].length);
        System.out.println("Linha: ");
        int coordenadaX = Integer.parseInt(READ.nextLine());
        System.out.println("Coluna: ");
        int coordenadaY = Integer.parseInt(READ.nextLine());
        inserirTrueNaCoordenada(matriz, coordenadaX, coordenadaY);

        imprimirMapa(matriz);
    }

    public static void preencherMatrizComFalse(boolean[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = false;
            }
        }
    }

    public static void inserirTrueNaCoordenada(boolean[][] matriz, int coordenadaX, int coordenadaY) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == coordenadaX && j == coordenadaY) {
                    matriz[i][j] = true;
                }
            }
        }
    }

    public static void imprimirMapa(boolean[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == false) {
                    System.out.print("X|");
                } else if (matriz[i][j] = true) {
                    System.out.print("O|");
                }
            }
            System.out.println();
        }
    }
}