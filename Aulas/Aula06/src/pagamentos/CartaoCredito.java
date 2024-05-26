package pagamentos;

public class CartaoCredito implements FormaPagamento {
    private String numeroCartao;
    private double limite;
    private double limiteUsado;
    
    @Override
    public double receberPagamento(String chave, double valor) {
        if ((this.limiteUsado + valor) < limite) {
            System.out.println("Compra aprovada!");
            this.limiteUsado = this.limiteUsado + valor;
            return valor;
        }

        System.out.println("Conpra reprovada!");
        return 0.0;
    }

    @Override
    public double reembolsar(double valor) {
        this.limiteUsado = this.limiteUsado - valor;
        return valor;
    }

    @Override
    public String emitirComprovante() {
        return "Comprovante!";
    }
}