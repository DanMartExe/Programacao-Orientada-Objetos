import veiculos.Carro;
import veiculos.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Florinda", "New Beetle");
        Moto moto = new Moto("Hortência", "Harley");

        moto.acelerar();
        carro.acelerar();

        moto.frear();
        carro.frear();
    }
}