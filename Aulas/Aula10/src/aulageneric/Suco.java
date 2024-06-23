package aulageneric;
public class Suco implements Liquido {
    private String sabor = "Limao";
    private boolean ehNatural = true;

    public boolean isEhNatural() {
        return ehNatural;
    }

    public String getSabor() {
        return sabor;
    }
}
