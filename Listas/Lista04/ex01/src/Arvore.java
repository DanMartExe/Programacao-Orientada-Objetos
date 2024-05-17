public class Arvore {
    int idade;
    double tamanhoMetros;
    String habitat;

    public void imprimirDetalhes() {
        System.out.println(idade);
        System.out.println(tamanhoMetros);
        System.out.println(habitat);
    }

    public void regarArvore(double tamanhoMetros) {
        System.out.println("A arvore cresceu, agora tem " + (tamanhoMetros + 0.2) + "m!");
    }

    public void sePendurarNaArvore(int idade) {
        if (idade < 1) {
            System.out.println("A arvore se despedaçou");
        } else if (idade < 10) {
            System.out.println("A arvore balancou");
        } else
        System.out.println("...");
    }
}