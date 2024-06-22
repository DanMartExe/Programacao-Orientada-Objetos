package eventos;

public final class StandUp extends Evento {
    private String comediante;

    public StandUp(String nome, String local, String data, String comediante) {
        super(nome, local, data);
        this.comediante = comediante;
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println(getNome());
        System.out.println(getLocal());
        System.out.println(getData());
        System.out.println(getComediante());
    }

    @Override
    public void comecarEvento() {
        System.out.println("EH AGORA, COM VOCES " + getComediante());
    }

    public void comecarEvento(String piada) {
        System.out.println(piada);
        System.out.println("EH AGORA, COM VOCES " + getComediante());
    }
    
    public String getComediante() {
        return comediante;
    }

    public void setComediante(String comediante) {
        this.comediante = comediante;
    }
}