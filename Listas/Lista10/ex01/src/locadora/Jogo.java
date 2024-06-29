package locadora;

public class Jogo implements AudioVisual {
    private String titulo;
    private String plataforma;
    
    public Jogo(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfor() {
        System.out.println(titulo);
        System.out.println(plataforma);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}