import java.util.ArrayList;
import java.util.List;

import carta.Carta;
import carta.CartaDesarme;
import carta.CartaExplosao;

public class App {
    public static void main(String[] args) {
        List<Carta> monteDeCompras = new ArrayList<>();

        monteDeCompras.add(new CartaExplosao());
        monteDeCompras.add(new CartaDesarme(null));
        

        // //métodos subescritos, mesmo nome mas assinaturas diferentes
        // Random random = new Random();
        // System.out.println(random.nextInt());
        // System.out.println(random.nextInt(10));
        // System.out.println(random.nextInt(5, 10));
    }
}