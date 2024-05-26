package pagamentos;

import java.time.LocalDate;

public class Pix implements FormaPagamento {
    private String chave;
    private double valor;
    private String data = LocalDate.now().toString();

    @Override //pra indicar que esse meótodo ta vindo de outro lugar. herdado/implementado
    public double receberPagamento(String chave, double valor) {
        this.chave = chave;
        this.valor = valor;
        System.out.println("Recebido de: " + this.chave + " Valor: " + this.valor);
        return this.valor;
    }

    @Override
    public double reembolsar(double valor) {
        System.out.println("Enviando para a chave: " + this.chave);
        return valor;
    }

    @Override
    public String emitirComprovante() {
        return String.format("Valor: %s%n Data: %s", this.valor, this.data);
    }
}