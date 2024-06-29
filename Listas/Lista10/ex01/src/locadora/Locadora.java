package locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora<T extends AudioVisual> {
    private List<T> acervo;

    public Locadora() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        acervo.add(item);
    }
    
    public void listarItens() {
        for (T item : acervo) {
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println(filme.getTitulo());
                System.out.println(filme.getDiretor());
                System.out.println(filme.getAtores());
            }
    
            if (item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                System.out.println(jogo.getTitulo());
                System.out.println(jogo.getPlataforma());
            }
        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                if (filme.getTitulo().equals(titulo)) {
                    System.out.println("Item encontrado no acervo: ");
                    System.out.println(filme.getTitulo());
                    System.out.println(filme.getDiretor());
                    System.out.println(filme.getAtores());
                }
            }
    
            if (item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                if (jogo.getTitulo().equals(titulo)) {
                    System.out.println("Item encontrado no acervo: ");
                    System.out.println(jogo.getTitulo());
                    System.out.println(jogo.getPlataforma());
                }
            }
        }
        return null;
    }
}