import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new LinkedHashSet<>();

        for (int i = 0; i <= 15; i++) {
            pessoas.add(new Pessoa("123987", "Champson"));
        }

        pessoas.remove(new Pessoa("123987", "Davi"));
        pessoas.size();
        pessoas.isEmpty();
        pessoas.contains(new Pessoa("123987", "Davi"));
        // pessoas.removeAll();

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }





        Map<String, Pessoa> map = new HashMap<>();

        Pessoa pessoa = new Pessoa("123654", "Joao");
        map.put(pessoa.getCpf(), pessoa);

        map.size();
        map.get("123654");
        // map.remove();
        

        // for (Pessoa pessoa : map.values()) {
        // }

        Set<String> chaves = map.keySet();

        //p iterar com valor e chave
        for(Entry<String, Pessoa> entrada : map.entrySet()) {
            System.out.println("Chave " + entrada.getKey());
            System.out.println("Valor " + entrada.getValue());
        }



        Pessoa pessoa1 = new Pessoa("123456", "Joao");
        Pessoa pessoa2 = new Pessoa("123556", "oao");
        Pessoa pessoa3 = new Pessoa("153456", "Jao");
        Pessoa pessoa4 = new Pessoa("125456", "Joa");

        Turma turma = new Turma();

        turma.adicionarAluno(1, pessoa1);
        turma.adicionarAluno(2, pessoa2);
        turma.adicionarAluno(3, pessoa3);
        turma.adicionarAluno(4, pessoa4);

        try {
            System.out.println(turma.buscarAluno(13));
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        turma.listarAlunos();
    }
}