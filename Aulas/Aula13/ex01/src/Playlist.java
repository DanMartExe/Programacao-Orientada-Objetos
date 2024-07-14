import java.util.List;

public class Playlist {
    List<Musica> musica;

    public Playlist() {
    }

    public Playlist(List<Musica> musica) {
        this.musica = musica;
    }

    public void adicionarMusica(int id, String titulo, int duracaoEmSegundos, boolean estaFavoritada) {
        musica.add(new Musica(
            id,
            titulo,
            duracaoEmSegundos,
            estaFavoritada
        ));
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }
}