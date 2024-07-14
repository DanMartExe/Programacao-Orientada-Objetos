public class Musica {
    private int id;
    private String titulo;
    private int duracaoEmSegundos;
    private boolean estaFavoritada;

    public Musica() {
    }

    public Musica(int id, String titulo, int duracaoEmSegundos, boolean estaFavoritada) {
        this.id = id;
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.estaFavoritada = estaFavoritada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public boolean isEstaFavoritada() {
        return estaFavoritada;
    }

    public void setEstaFavoritada(boolean estaFavoritada) {
        this.estaFavoritada = estaFavoritada;
    }
}