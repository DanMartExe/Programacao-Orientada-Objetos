public class Musica {
    private String titulo;
    private String artista;
    private String album;

    public Musica(String titulo, String artista, String album) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}