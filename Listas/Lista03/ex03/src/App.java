import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner SCAN = new Scanner(System.in);

        System.out.println("Digite duas palavras p/ verificar se sao iguais\n");
        System.out.println("1° palavra");
        String palavra1 = SCAN.nextLine();
        System.out.println("2° palavra");
        String palavra2 = SCAN.nextLine();

        compararPalavras(palavra1, palavra2);
    }

    public static void compararPalavras(String palavra1, String palavra2) {
        if (palavra1.equals(palavra2)) {
            System.out.println("As palavras sao identicas");
        } else if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        } else {
            System.out.println("As palavras sao diferentes");
        }
    }
}