package jogo.interativo;

import java.util.ArrayList;
import java.util.Random;

import jogo.Heroi;

public class NPC implements Interativo {
    private ArrayList<String> falas = new ArrayList<>();
    private String localizacao;

    @Override
    public void interagir(Heroi heroi) {
        Random random = new Random();
        int indiceDaFala = random.nextInt(falas.size());

        System.out.println("Ola: " + heroi.getNome());
        System.out.println(falas.get(indiceDaFala));
    }
}