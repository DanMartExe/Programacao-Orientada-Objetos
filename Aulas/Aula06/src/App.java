import java.util.ArrayList;
import jogo.Heroi;
import jogo.Vaso;
import jogo.movel.Movel;
import jogo.movel.PedraMovel;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Movel> moveis = new ArrayList<>();

        moveis.add(new PedraMovel());
        moveis.add(new Vaso());

        //((Vaso) moveis.get(1)).interagir(new Heroi());
    }
}