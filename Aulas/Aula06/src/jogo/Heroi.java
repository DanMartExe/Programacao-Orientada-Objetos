package jogo;

import java.util.ArrayList;

public class Heroi {
    private int vidaAtual;
    private int vidaMaxima;
    private int forca;
    private int level;
    private String nome;
    private ArrayList<String> iventario = new ArrayList<>();

    public ArrayList<String> getIventario() {
        return this.iventario;
    }

    public String getNome() {
        return this.nome;
    }
}
