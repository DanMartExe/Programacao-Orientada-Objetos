public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean ehPremiado;
    double pesoKg;

    public void imprimirDetalhes() {
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(paginas);
        System.out.println(ehPremiado);
        System.out.println(pesoKg);
    }

    public void olharCapaDoLivro() {
        System.out.println(titulo);
        System.out.println("~Imagem legal e conceitual~");
        if (ehPremiado) {
            System.out.println("Premio Jabuti 202x");
        }
        System.out.println(autor);
    }

    public void folearLivro() {
        System.out.println("~Paragrafos e dialogos sem contexto~");
        System.out.println(paginas);
    }

    public void pegarLivro() {
        System.out.println("Ao pegar:");
        if (pesoKg <= 0.150) {
            System.out.println("Isso eh um livro ou um tabloide?");
        } else if (pesoKg <= 0.600) {
            System.out.println("Ok...");
        } else {
            System.out.println("Uma enciclopedia?");
        }
    }
}