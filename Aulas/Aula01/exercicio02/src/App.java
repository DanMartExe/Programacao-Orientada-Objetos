import java.util.Scanner;

public class App {

    private static final Scanner READ = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int idade = Integer.parseInt(READ.nextLine());

        System.out.println(classificarNadador(idade));
    }

    private static String classificarNadador(int idadeNadador) {
        if (idadeNadador < 12) {
            return "infantil";
        } else if (idadeNadador <= 14) {
            return "Juvenil A";
        } else if (idadeNadador <= 17) {
            return "Juvenil B";
        } else {
            return "Adulto";
        }
    }
}