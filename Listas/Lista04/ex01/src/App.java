public class App {
    public static void main(String[] args) {
        Rock rock = new Rock();
        rock.ehFamoso = true;
        rock.instrumentos.add("Guitarra");
        rock.instrumentos.add("Bateria");
        rock.instrumentos.add("Baixo");
        rock.subgenero = "Prog metal";

        rock.tocarRock(rock.ehFamoso);
        rock.imprimirDetalhes();

        Livro livro = new Livro();
        livro.autor = "Julio Cortazar";
        livro.ehPremiado = false;
        livro.paginas = 300;
        livro.pesoKg = 0.4;
        livro.titulo = "O jogo da Amarelinha";

        livro.imprimirDetalhes();

        Arvore arvore = new Arvore();
        arvore.habitat = "Deserto";
        arvore.idade = 300;
        arvore.tamanhoMetros = 10000;

        arvore.imprimirDetalhes();
    }
}