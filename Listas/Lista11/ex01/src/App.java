public class App {
    public static void main(String[] args) {
        Musica musica1 = new Musica(
            "New Born",
            "Muse",
            "Origin of Symmetry"
        );
        Musica musica2 = new Musica(
            "Mr. FEAR",
            "SIAMÉS",
            "BOUNCE INTO THE MUSIC"
        );

        BibliotecaMusical acervo = new BibliotecaMusical();
        acervo.adicionarMusica("New Born", musica1);
        acervo.adicionarMusica("Mr. FEAR", musica2);

        acervo.listarMusicas();

        try {
            Musica musicaBuscada = acervo.buscarMusica("Mr. fear");
            System.out.println(musicaBuscada.getAlbum());
        } catch (MusicaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao tentar buscar a música.");
        }
    }
}