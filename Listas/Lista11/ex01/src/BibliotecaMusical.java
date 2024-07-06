import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BibliotecaMusical {
    Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(String titulo, Musica musica) {
        acervo.put(titulo, musica);
    }
    
    public void listarMusicas() {
        for (String musica : acervo.keySet()) {
            System.out.println(musica);
        }
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        for (Entry<String, Musica> musica : this.acervo.entrySet()) {
            if (acervo.containsKey(titulo)) {
                return musica.getValue();
            }
        }
        throw new MusicaNaoEncontradaException();
    }

    public Map<String, Musica> getAcervo() {
        return acervo;
    }
    
    public void setAcervo(Map<String, Musica> acervo) {
        this.acervo = acervo;
    }
}