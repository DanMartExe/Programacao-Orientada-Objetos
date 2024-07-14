import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Musica> playList = new ArrayList<>();
        // Adicionando musicas na playList
        {
            playList.add(new Musica(
                1,
                "Thriller",
                354,
                true
            ));

            playList.add(new Musica(
                2,
                "Hey Jude",
                421,
                false
            ));

            playList.add(new Musica(
                3,
                "Bohemian Rhapsody",
                357,
                false
            ));

            playList.add(new Musica(
                4,
                "Skyline Pidgeon",
                210,
                true
            ));

            playList.add(new Musica(
                5,
                "Smooth Criminal",
                412,
                true
            ));
        }

        for (Musica musica : playList) {
            if (musica.isEstaFavoritada()) {
                System.out.println(musica.getTitulo());
            }
        }

        // Paradigma funcional: (pesquisar Lambda)
        playList
            .stream()
            .filter(musica -> musica.isEstaFavoritada())
            .forEach(musica -> System.out.println(musica.getTitulo()));
    }
}