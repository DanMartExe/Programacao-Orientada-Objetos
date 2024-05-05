import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    private static final int QUANTIDADE_CONVIDADOS = 10;
    private static String[] listaConvidados = new String[QUANTIDADE_CONVIDADOS];

    public static void main(String[] args) throws Exception {
        System.out.println(String.format("Preencha a lista de convidados com %s nomes", QUANTIDADE_CONVIDADOS));
        preencherListaDeConvidados();

        System.out.println("Digite um nome para verificar se está na lista de convidados: ");
        verificarRequisitanteNaListaDeConvidados(SCAN.nextLine());
    }

    public static void preencherListaDeConvidados() {
        for (int i = 0; i < QUANTIDADE_CONVIDADOS; i++) {
            listaConvidados[i] = SCAN.nextLine();
        }
    }

    public static void verificarRequisitanteNaListaDeConvidados(String nome) {
        boolean requisitanteEstaNaLista = false;
        for (int i = 0; i < QUANTIDADE_CONVIDADOS; i++) {
            if (listaConvidados[i].equalsIgnoreCase(nome)) {
                requisitanteEstaNaLista = true;
            };
        }

        if (requisitanteEstaNaLista) {
            System.out.println("Requisitante esta na lista. Seja bem vindo!");
        } else {
            System.out.println("Requisitante nao esta na lista. Nao pode entrar na festa");
        }
    }
}