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
                filme.exibirInfor();
            }
    
            if (item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                jogo.exibirInfor();
            }
        }
    }

    public T buscarItem(String titulo) {
        for (T item : acervo) {
            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                if (filme.getTitulo().equals(titulo)) {
                    System.out.println("Item encontrado no acervo: ");
                    filme.exibirInfor();
                }
            }
    
            if (item instanceof Jogo) {
                Jogo jogo = (Jogo) item;
                if (jogo.getTitulo().equals(titulo)) {
                    System.out.println("Item encontrado no acervo: ");
                    jogo.exibirInfor();
                }
            }
        }
        return null;
    }
}