package revisaoheranca;
public abstract class Animal {
    private String nomeCientifico;
    private String nomeNaoCientifico;
    private String especie;
    
    public Animal(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }
    
    public String getNomeCientifico() {
        return nomeCientifico;
    }
    
    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }
    
    public String getNomeNaoCientifico() {
        return this.nomeNaoCientifico;
    }
    
    public void setNomeNaoCientifico(String nomeNaoCientifico) {
        this.nomeNaoCientifico = nomeNaoCientifico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}