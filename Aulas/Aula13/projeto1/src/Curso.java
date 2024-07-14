import java.util.List;

public class Curso {
    private int id;
    private String titulo;
    private List<Modalidade> modalidades;

    public Curso(int id, String titulo, List<Modalidade> modalidades) {
        this.id = id;
        this.titulo = titulo;
        this.modalidades = modalidades;
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

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(List<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }
}