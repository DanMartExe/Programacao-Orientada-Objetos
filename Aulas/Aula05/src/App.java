import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Biblioteca biblioteca = new Biblioteca("Cora Coralina", "Rua dos Bobos n° 0");
        Usuario usuario = new Usuario("Joao Bobo",18);
        Livro livro = new Livro("Harry Potter e o prisioneiro de Azkaban", 12);
        livro.setEstaEmprestado(true);

        usuario.verLivros();

        biblioteca.emprestarLivro(usuario, livro);
        biblioteca.emprestarLivro(usuario, biblioteca.getLivros().get(0));

        usuario.verLivros();

        /*
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        
        System.out.println(array.size());
        
        array.add(1, 3);
        
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        */
    }
}