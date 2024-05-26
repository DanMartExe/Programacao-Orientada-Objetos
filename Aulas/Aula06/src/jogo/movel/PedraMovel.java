package jogo.movel;

public class PedraMovel implements Movel {
    private String localizacao;
    private int x;
    private int y;

    @Override
    public void mover(String direcao) {
        if (direcao.equals("Para baixo")) {
            y--;
        } else {
            System.out.println("Impossivel mover!!!");
        }
    }
}