package veiculos;

public class Carro implements Veiculo {
    private String nomeBatismo;
    private String modelo;

    public Carro(String nomeBatismo, String modelo) {
        setNomeBatismo(nomeBatismo);
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("VRUUUMMMM!!!");
    }

    public void frear() {
        System.out.println("RRRRRRRRR!!!");
    }

    public void setNomeBatismo(String nomeBatismo) {
        String primeiraLetraNome = String.valueOf(nomeBatismo.charAt(0));
        String nomeSemInicial = nomeBatismo.substring(1);

        this.nomeBatismo = primeiraLetraNome.toUpperCase() + nomeSemInicial.toLowerCase();
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