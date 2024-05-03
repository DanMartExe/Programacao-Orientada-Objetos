import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //extensão SonarLint p/ dar sugestões no algoritmo
        String teste =
            """
            auhsdhusadhas
            uahsdhuasdhuasuhdas
            ausdhuasuhdahs
            auhsdauhsdhuasduhashud
            asdajkdhnsajdhasjd
            """;
        
        System.out.println(teste);

        String nome = SCAN.nextLine();
        int idade = 99;
        //%n pula linha, %s substitui por variavel em respectiva ordem
        String exemploInterpolacao = String.format( 
            """
            Nome: %s
            idade: %s
            altura: %s
            Gosta de frio: %s
            Comida favorita: %s
            """,
            nome,
            idade,
            1.85,
            true,
            SCAN.nextLine()
        );
        //posso passar por parametro variavel/constante, valor chumbado ou retorno de funções

        System.out.println(exemploInterpolacao);

        int exemplo = 1;
         //varios tipos de ValueOf
        String exemplo2 = String.valueOf(exemplo);

        String comparacao = "Daniel";
        String comparacao2 = new String("Daniel");
        //True: pega na mesma região de memoria
        System.out.println(comparacao == "Daniel");
        //False: endereçoes diferentes, precisa comparar de outra forma
        System.out.println(comparacao == comparacao2);
        //True, comparação definitiva
        System.out.println(comparacao.equals(comparacao2));
        //True, compara independente se for caixa alta ou baixa
        System.out.println(comparacao.equalsIgnoreCase(comparacao2));

        //verifica se contem uma letra
        System.out.println(comparacao.contains("a"));

        //verifica se contem uma sequencia
        System.out.println(comparacao.contains("ani"));

        //True se for vazio
        System.out.println(comparacao.isEmpty());

        //True se for só espaços
        System.out.println(comparacao.isBlank());

        String removerEspacoVazio = "        ab     ";
        System.out.println(removerEspacoVazio.trim());

        String trocaTermos = "        ab     ";
        System.out.println(trocaTermos.replace(" ", "b"));

        //regex: serve pra identificar padrões em texto; usado para fazer validação de email, nome, numero...
        String nomes = "Daniel Pudim Freddy Loires";
        String[] nomesSeparados = nomes.split(" ");

        //for it itera item por item, p/ cada nomess em nomesSeparados, faça: imprimir
        //nomess vai ganhando o valor de cada item da lista
        for (String nomess : nomesSeparados) {
            System.out.println(nomess);
        }

        //Corta de um ponto até outro
        String stringSemODaniel = nomes.substring(4, 9);

        String daniel = "Daniel";
        int indiceDaniel = nomes.indexOf("Daniel") + daniel.length();
        String stringSemODaniel2 = nomes.substring(indiceDaniel, 9);

        //mais funções no PDF, mais ainda na internet :D
    }
}