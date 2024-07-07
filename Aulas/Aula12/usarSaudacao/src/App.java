import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import quiz.Alternativa;
import quiz.Questao;
import quiz.Quiz;

public class App {
    public static void main(String[] args) throws Exception {
        List<Questao> questoes = new ArrayList<>();
        questoes.add(buscarMesmaQuestao());
        questoes.add(buscarMesmaQuestao());
        questoes.add(buscarMesmaQuestao());
        questoes.add(buscarMesmaQuestao());
        questoes.add(buscarMesmaQuestao());

        System.out.println("Digite seu nome: ");
        Questao questao1 = new Questao("Quantas semanas durou o módulo 2");
        Map<Integer, Alternativa> alternativasQuestao1 = new LinkedHashMap<>();
        Alternativa alternativa1Questao1 = new Alternativa("10");
        Alternativa alternativa2Questao1 = new Alternativa("375");
        Alternativa alternativa3Questao1 = new Alternativa("12");

        alternativasQuestao1.put(1, alternativa1Questao1);
        alternativasQuestao1.put(2, alternativa2Questao1);
        alternativasQuestao1.put(3, alternativa3Questao1);

        questao1.setAlternativas(alternativasQuestao1, alternativa1Questao1);
        
        questoes.add(questao1);

        Scanner scanner = new Scanner(System.in);

        Quiz quiz = new Quiz(scanner.nextLine(), questoes);

        quiz.realizarQuiz();
    }

    public static Questao buscarMesmaQuestao() {
        Questao questao = new Questao("Quantas semanas durou o módulo 2");
        Map<Integer, Alternativa> alternativas = new LinkedHashMap<>();
        Alternativa alternativa1 = new Alternativa("10");
        Alternativa alternativa2 = new Alternativa("375");
        Alternativa alternativa3 = new Alternativa("12");

        alternativas.put(1, alternativa1);
        alternativas.put(2, alternativa2);
        alternativas.put(3, alternativa3);

        questao.setAlternativas(alternativas, alternativa1);

        return questao;
    }
}