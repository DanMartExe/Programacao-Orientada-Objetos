import java.util.ArrayList;
import java.util.List;
import eventos.Show;
import eventos.StandUp;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> artistas = new ArrayList<>();
        artistas.add("Arthur Fleck");
        artistas.add("Bruce Wayne");

        Show show = new Show("Psicose", "Dunas de Dubai", "30/02", artistas);
        StandUp standUp = new StandUp("Neurose", "Caverna na Amazônia", "30/02", artistas.get(0));

        show.exibirInformacoes();
        standUp.exibirInformacoes();
    }
}