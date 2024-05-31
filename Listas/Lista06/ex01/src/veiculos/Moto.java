package veiculos;

public class Moto implements Veiculo {
    private String nomeBatismo;
    private String modelo;

    public Moto(String nomeBatismo, String modelo) {
        this.nomeBatismo = nomeBatismo;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("prum prummm pruuuummm!!!");
    }

    public void frear() {
        System.out.println("rrrrrrrrrrrrrrrrr!!!");
    }

    public void setNomeBatismo(String nomeBatismo) {
        this.nomeBatismo = nomeBatismo;
    }

    public String getNomeBatismo() {
        return this.nomeBatismo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }
}