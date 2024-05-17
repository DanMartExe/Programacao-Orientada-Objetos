import java.util.ArrayList;

public class Rock {
    String subgenero;
    ArrayList<String> instrumentos = new ArrayList<>();
    boolean ehFamoso;

    public void imprimirDetalhes() {
        System.out.println(subgenero);
        System.out.println(instrumentos);
        System.out.println(ehFamoso);
    }

    public void gravarRock(ArrayList<String> instrumentos) {
        for (String instrumento : instrumentos) {
            System.out.println(instrumento + "tocando!");
        }
    }

    public void tocarRock(boolean ehFamoso) {
        if (ehFamoso) {
            System.out.println("~Pessoas ao redor cantando");
        } else {
            System.out.println("~Pessoas assustadas o.O");
        }
    }
}