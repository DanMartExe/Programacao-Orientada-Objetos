import java.util.Scanner;

public class App {
    private static Scanner READ = new Scanner(System.in);
    public static int quantidadePerguntas = 3;
    private static String[] respostasUsuario = new String[quantidadePerguntas];
    private static String[] gabarito = new String[quantidadePerguntas];

    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        String nome = receberNome();
        comecarQuiz(nome);

        enviarPergunta1();
        enviarPergunta2();
        enviarPergunta3();

        int quantidadeAcertos = contarAcertos(respostasUsuario, gabarito);
        retornarResultados(quantidadePerguntas, quantidadeAcertos);

        agradecerParticipacao(nome);
    }

    public static String formatarNome(String nome) {
        String primeiraLetraNome = String.valueOf(nome.charAt(0));
        String nomeSemInicial = nome.substring(1);

        return primeiraLetraNome.toUpperCase() + nomeSemInicial.toLowerCase();
    }

    public static String receberNome() {
        return formatarNome(READ.nextLine());
    }

    public static void comecarQuiz(String nome) {
        System.out.println(String.format(
            """
            %n%nSaudações, %s!

            Bem-vindo à arena do conhecimento.
            Prepare-se para desafiar as sombras da ignorância e enfrentar os enigmas
            que espreitam nas profundezas deste jogo de Quiz.

            São %s perguntas de multipla escolha que testarão sua astúcia.
            Digite a letra correspondente à alternativa que considera correta.

            Que os jogos comecem! 

            
            [Aperte ENTER para continuar]
            """,
            nome,
            quantidadePerguntas
        ));
        READ.nextLine();
    }

    public static void enviarPergunta1() {
        String resposta = "";
        do {
            System.out.println(String.format(
                """
                %nPrimeira pergunta:

                Nasci do sol e do mar, sou a luz que dança no ar.
                Quem sou eu?

                [A] Uma estrela
                [B] Uma onda
                [C] Uma borboleta
                [D] Uma nuvem
                [E] Um arco-íris
                """
            ));
            resposta = READ.nextLine();
        } while (!validarResposta(resposta));

        respostasUsuario[0] = resposta;
        gabarito[0] = "E";
    }

    public static void enviarPergunta2() {
        String resposta = "";
        do {
            System.out.println(String.format(
                """
                %nSegunda pergunta:

                À noite eu apareço sem ser chamado,
                de dia eu desapareço sem ser roubado. O que sou?

                [A] Uma estrela cadente
                [B] O brilho da lua
                [C] A sombra de uma árvore
                [D] O silêncio da noite
                [E] O reflexo da luz
                """
            ));
            resposta = READ.nextLine();
        } while (!validarResposta(resposta));

        respostasUsuario[1] = resposta;
        gabarito[1] = "C";
    }

    public static void enviarPergunta3() {
        String resposta = "";
        do {
            System.out.println(String.format(
                """
                %nTerceira e ultima pergunta:

                Dura mais que a terra, mais forte que aço.
                Estendido para o céu, de vasto espaço.
                Muitos o atravessam, mas poucos o veem. O que sou eu?

                [A] Uma ponte
                [B] Uma estrada
                [C] Um rio
                [D] Uma montanha
                [E] Uma caverna
                """
            ));
            resposta = READ.nextLine();
        } while (!validarResposta(resposta));

        respostasUsuario[2] = resposta;
        gabarito[2] = "D";
    }

    public static boolean validarResposta(String respostaUsuario) {
        if (respostaUsuario.isBlank() || respostaUsuario.isEmpty()) {
            System.out.println("Você deve digitar sua resposta para a pergunta.");
            return false;
        }
        return true;
    }

    public static int contarAcertos(String[] respostasUsuario, String[] gabarito) {
        int quantidadeAcertos = 0;
        for (int i = 0; i < quantidadePerguntas; i++) {
            if (String.valueOf(respostasUsuario[i]).equalsIgnoreCase(String.valueOf(gabarito[i]))) {
                quantidadeAcertos++;
            }
        }
        return quantidadeAcertos;
    }

    public static void retornarResultados(int quantidadePerguntas, int quantidadeAcertos) {
        double quantidadeAcertosDouble = quantidadeAcertos;
        double percentualAcertos = (quantidadeAcertosDouble / quantidadePerguntas) * 100; //converter ambos para double e testar

        if (percentualAcertos == 100) {
            System.out.println(String.format(
                """
                Parabéns pela sua impressionante façanha ô/
                Você acertou %s de %s perguntas, sua precisão e astúcia são dignas de admiração!
                """,
                quantidadeAcertos,
                quantidadePerguntas
            ));
        } else if (percentualAcertos >= 65) {
            System.out.println(String.format(
                """
                Parabéns!
                %s acertos em %s desafios é uma marca a ser reconhecida.
                """,
                quantidadeAcertos,
                quantidadePerguntas
            ));
        } else if (percentualAcertos >= 30) {
            System.out.println(String.format(
                """
                %s acerto em %s é um passo rumo à luz do entendimento.
                Se esforce mais!
                """,
                quantidadeAcertos,
                quantidadePerguntas
            )); 
        } else {
            System.out.println(String.format(
                """
                %nVergonha!
                Com %s acertos em %s, você QUASE não tem salvação.
                """,
                quantidadeAcertos,
                quantidadePerguntas
            ));  
        }
    }

    public static void agradecerParticipacao(String nomeformatado) {
        System.out.println(String.format(
            """
            Agradeço por sua ousadia, %s.
            Até o próximo Quiz :D
            """,
            nomeformatado
        ));
    }
}