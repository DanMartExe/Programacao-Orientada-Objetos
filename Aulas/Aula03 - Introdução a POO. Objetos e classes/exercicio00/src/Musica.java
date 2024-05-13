import java.util.ArrayList;

public class Musica {
    String melodia;
    String cifra;
    boolean temLetra;
    String letraDaMusica;
    ArrayList<Musico> musicos = new ArrayList<Musico>();

    public void tocar() {
        for (int i = 0; i < musicos.size(); i++) {
            musicos.get(i).tocarMusica();

            if (musicos.get(i).ehCantor) {
                musicos.get(i).cantar();
            } else {
                musicos.get(i).tocarMusica();
            }
        }
    }

    public void imprimirDetalhe() {
        System.out.println(melodia);
        System.out.println(cifra);
        System.out.println(temLetra);
        System.out.println(letraDaMusica); 
        
        for (Musico musico : musicos) {
            musico.imprimirDetalhes();
            System.out.println(musico.toString());
        }
    }
}