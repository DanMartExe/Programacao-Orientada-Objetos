import animais.Gato;
import animais.Serpente;

public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato("Pudim", "Siamês");
        Serpente serpente = new Serpente("Basilisco", 50);

        gato.comer();
        gato.emitirSom();

        serpente.comer();
        serpente.emitirSom();
    }
}