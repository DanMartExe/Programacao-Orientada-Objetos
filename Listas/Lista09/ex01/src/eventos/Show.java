package eventos;

import java.util.ArrayList;
import java.util.List;

public class Show extends Evento {
    private List<String> artistas = new ArrayList<>();
    
    public Show(String nome, String local, String data, List<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println(getNome());
        System.out.println(getLocal());
        System.out.println(getData());
        System.out.println(getArtistas());
    }
    
    @Override
    public void comecarEvento() {
        System.out.println("WELCOME TO HELL \\m/");
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos) {
            System.out.println("WELCOME TO HELL \\m/");
            System.out.println("~muitos aplausos e gritaria");
        } else {
            System.out.println("WELCOME TO HELL \\m/");
        }
    }
    
    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }
}