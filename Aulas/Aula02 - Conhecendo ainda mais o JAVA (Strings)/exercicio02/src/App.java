import java.util.Scanner;

public class App {

    public static final String USUARIO = "MeuNomeNaoEhZelda";
    public static final String SENHA = "meuNomeEHL1nk";
    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        boolean usuarioEstaAutenticado;
        
        do {
            String usuario = SCAN.nextLine();
            String senha = SCAN.nextLine();
        
            usuarioEstaAutenticado = validarUsuario(usuario, senha);

            if (usuarioEstaAutenticado) {
                System.out.println(String.format("Seja bem vindo %s!", USUARIO));
            } else {
                System.out.println("Usuário e/ou senha inválido!");
            }

        } while (!usuarioEstaAutenticado);
    }

    public static boolean validarUsuario(String usuario, String senha) {
        if (!usuario.equalsIgnoreCase(USUARIO)) {
            return false;
        }

        if (!senha.equals(SENHA)) {
            return false;
        }

        return true;
    }
}