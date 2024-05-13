public class App {
    public static void main(String[] args) throws Exception {
        /*Musica musica = new Musica();
        musica.melodia = "la lala lalaia lelele";
        musica.cifra = "G D Em C";
        musica.temLetra = true;
        musica.letraDaMusica = "Joao robou pao na casa do Joao";

        musica.musicos.add(new Musico());
        System.out.println(musica.musicos.size());

        Musico guitarrista = new Musico();
        guitarrista.ehCantor = false;
        guitarrista.idade = 13;
        guitarrista.instrumento = "Guitarra";
        guitarrista.nome = "Pedro";

        Musico cantor = new Musico();
        guitarrista.ehInstrumentista = true;
        guitarrista.idade = 13;
        guitarrista.instrumento = "Voz";
        guitarrista.nome = "Davi";

        musica.musicos.add(guitarrista);
        musica.musicos.add(cantor);

        musica.tocar();
        guitarrista.cantar();

        musica.imprimirDetalhe();*/

        Atleta atleta = new Atleta();
        atleta.forca = 5;
        atleta.habilidade = 10;
        atleta.nome = "Daniel";

        Atleta atleta2 = new Atleta(); //instanciando atletas
        atleta.forca = 4;
        atleta.habilidade = 8;
        atleta.nome = "Jó";

        Atleta atleta3 = new Atleta(); //instanciando atletas
        atleta.forca = 8;
        atleta.habilidade = 3;
        atleta.nome = "Cleiton";

        Time time = new Time();
        time.nomeDoTime = "LOUD";
        time.capitao = atleta2;
        time.atletas.add(atleta);
        time.atletas.add(atleta2);
        time.atletas.add(atleta3);

        System.out.println(String.format("O time é forte? %s", time.verificarTimeEhForte()));
    }
}