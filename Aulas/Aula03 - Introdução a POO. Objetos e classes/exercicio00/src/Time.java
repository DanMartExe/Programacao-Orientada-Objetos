import java.util.ArrayList;

public class Time {
    ArrayList<Atleta> atletas = new ArrayList<>();
    Atleta capitao;
    String nomeDoTime;
    String mascote;
    String tecnico;
    boolean melhorTimeDoUniverso;

    public boolean verificarTimeEhForte() {
        int quantidadeAtletasTreinados = 0;

        for (Atleta atleta : atletas) {
            quantidadeAtletasTreinados++;
        }

        return quantidadeAtletasTreinados > (atletas.size() / 2);
    }
}