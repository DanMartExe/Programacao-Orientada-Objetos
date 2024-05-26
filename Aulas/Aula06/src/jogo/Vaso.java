package jogo;

import jogo.interativo.Interativo;
import jogo.movel.Movel;

public class Vaso implements Movel, Interativo {
    private String localizacao;
    private int x;
    private int y;
    private String item;

    @Override
    public void mover(String direcao) {
        if (direcao.equals("para baixo")) {
            y--;
        } else if (direcao.equals("para cima")) {
            y++;
        } else if (direcao.equals("para direita")) {
            x++;
        } else {
            x--;
        }
    }

    @Override
    public void interagir(Heroi heroi) {
        System.out.println("Quebrou!!");
        heroi.getIventario().add(item);
    }
}