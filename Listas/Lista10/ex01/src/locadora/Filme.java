package locadora;

import java.util.List;

public class Filme implements AudioVisual {
    private String titulo;
    private String diretor;
    private List<String> atores;
    
    
    public Filme(String titulo, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }
    
    @Override
    public void exibirInfor() {
        System.out.println(this.titulo);
        System.out.println(this.diretor);
        System.out.println(this.atores);
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDiretor() {
        return diretor;
    }
    
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
    public List<String> getAtores() {
        return atores;
    }

    public void setAtores(List<String> atores) {
        this.atores = atores;
    }
}