import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final String LOGIN_SISTEMA = "admin";
    private static final String SENHA_SISTEMA = "senha123";

    public static void main(String[] args) throws Exception {
        System.out.println("Login: ");
        String nomeUsuario = SCAN.nextLine();
        System.out.println("Senha: ");
        String senhaUsuario = SCAN.nextLine();

        if (realizarLogin(nomeUsuario, senhaUsuario)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login");
        }
    }

    public static boolean realizarLogin(String nomeUsuario, String senha) {
        if (nomeUsuario.equals(LOGIN_SISTEMA) && senha.equals(SENHA_SISTEMA)) {
            return true;
        }
        return false;
    }
}