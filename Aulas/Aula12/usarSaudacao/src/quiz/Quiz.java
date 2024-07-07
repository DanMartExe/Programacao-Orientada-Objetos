package quiz;

import java.util.List;
import java.util.Scanner;

import exceptions.AlternativaInvalidaException;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Quiz {

    @NonNull
    private String participante;
    @NonNull
    List<Questao> questoes;
    private int quantidadeAcertos = 0;

    public void realizarQuiz() {
        iniciarQuiz();
        for (Questao questao : questoes) {
            questao.imprimirQuestao();
            Alternativa alternativa = buscarAlternativa(questao);
            verificarSeParticipanteAcertou(alternativa, questao);
        }
        encerrarQuis();
    }

    private int receberResposta() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    private Alternativa buscarAlternativa(Questao questao) {
        do {
            try {
                return questao.buscarAlternativa(receberResposta());
            } catch (AlternativaInvalidaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Houve um erro, tente novamente!");
            }
        } while (true);
    }

    private void verificarSeParticipanteAcertou(Alternativa alternativa, Questao questao) {
        if (alternativa.equals(questao.getAlternativaCorreta())) {
            quantidadeAcertos++;
        }
    }

    private void iniciarQuiz() {
        System.out.println("PREPARE-SE, " + participante + "!!!");
    }

    private void encerrarQuis() {
        StringBuilder mensagemFinal = new StringBuilder();

        mensagemFinal.append(participante).append(", ");
        if (quantidadeAcertos == 0) {
            mensagemFinal.append("errou feio, errou rude.");
        } else if (quantidadeAcertos == questoes.size()) {
            mensagemFinal.append("GG Easy");
        } else if (quantidadeAcertos >= (questoes.size() / 2)) {
            mensagemFinal.append("melhor que nada!");
        } else {
            mensagemFinal.append("era melhor nem ter tentado!");
        }

        mensagemFinal.append("\n").append("Acertou ").append(quantidadeAcertos);
        mensagemFinal.append("\n").append("Quantidade perguntas: ").append(questoes.size());

        System.out.println(mensagemFinal);
    }
}