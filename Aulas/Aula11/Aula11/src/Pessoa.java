public class Pessoa {
    private String cpf;
    
    private String nome;
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //p verificar se pessoa é igual a partir do CPF
    //equals de object compara por endereço
    @Override
    public boolean equals(Object object) {
        if (object instanceof Pessoa pessoa) {
            if (pessoa.cpf.equals(this.cpf)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Integer.parseInt(this.cpf);
    }
    
    //override de toString p/ n retornar endereço
    @Override
    public String toString() {
        return String.format(
            """
                Nome: %s   
                CPF: %s   
                """,
                this.nome,
                this.cpf
        );
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
