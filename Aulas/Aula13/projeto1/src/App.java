import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Curso> instituto = new ArrayList<>();
        List<Modalidade> modalidades = 
            new ArrayList<>(List.of(
                Modalidade.PRESENCIAL,
                Modalidade.EAD
            ));
        // Adicionando cursos
        {
            instituto.add(
                new Curso(
                    0,
                    "Ciência da Computação",
                    modalidades
                )
            );

            instituto.add(
                new Curso(
                    1,
                    "Matemática Aplicada",
                    new ArrayList<>(List.of(Modalidade.PRESENCIAL))
                )
            );

            instituto.add(
                new Curso(
                    2,
                    "Quimica",
                    new ArrayList<>(List.of(Modalidade.EAD))
                )
            );
        }

        System.out.println("Presenciais\n");
        for(int i = 0; i < instituto.size(); i++) {
            if (instituto.get(i).getModalidades().contains(Modalidade.PRESENCIAL)) {
                System.out.println(instituto.get(i).getTitulo());
            }
        }

        System.out.println("\n\nEAD\n");
        for (Curso curso : instituto) {
            if (curso.getModalidades().contains(Modalidade.EAD)) {
                System.out.println(curso.getTitulo());
            }
        }
    }
}