package map.Ordenacao;

public class Eventos {
    private String nomeEvento;
    private String nomeAtracao;

    public Eventos(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    public void setNomeAtracao(String nomeAtracao) {
        this.nomeAtracao = nomeAtracao;
    }

    @Override
    public String toString() {
        return "Eventos {" +
                "nomeEvento = '" + nomeEvento +
                ", nomeAtracao = '" + nomeAtracao +
                "} \n";
    }
}
