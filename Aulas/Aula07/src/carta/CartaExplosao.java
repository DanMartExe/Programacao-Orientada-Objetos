package carta;

public final class CartaExplosao extends Carta { //final na classe: não pode ser herdada

    public CartaExplosao() {
        super("Explosao"); //super: refere a superclasse, this: refere a propria classe
        //super.exibirInformacoes(); //super. posso chamar todos os métodos da superclasse
    }
    
    //@Override: anotação p/ método de uma superclasse ou interface que foi subscrito
    //método de mesma assinatura: nome e parâmetros de mesmo tipo e quantidade
    //sobreposição: (mesma assinatura)
    @Override
    public void exibirInformacoes() {
        System.out.println(String.format(
            """
            Nome: %s
            Revelada: %s

            Ação: Explode o jogador!
            """,
            getNome(),
            isRevelada()
            ));
    }

    //sobrecarga: mesmo nome, mas parametros diferentes (assinatura diferente)
    public void exibirInformacoes(boolean chamarMae) {
        if (chamarMae) {
            super.exibirInformacoes();
            return;
        }
    }

    //sobrescrever/sobreposição: (mesma assinatura)
    @Override
    public void realizarAcao() {
        System.out.println("O jogador explodiu");
    }
}