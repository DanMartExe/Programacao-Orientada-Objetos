public class Musico {
    String nome;
    int idade;
    boolean ehInstrumentista;
    String instrumento;
    boolean ehCantor;

    public void imprimirDetalhes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(ehInstrumentista);
        System.out.println(instrumento);
        System.out.println(ehCantor);
    }

    public void tocarMusica() {
        if (ehInstrumentista) {
            System.out.println("Tirando um som!!!");
        } else {
            System.out.println("9546545646546");
        }
    }

    public void cantar() {
        if (ehCantor) {
            System.out.println("LALAIA LALAIA LAIA");
        } else {
            System.out.println("USAHSHAUKASDDASM");
        }
    }
}