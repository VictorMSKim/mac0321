package batalha;

public class Habilidade {

    private TipoDeHabilidade tipo;
    private double prioridade;
    private double deltaPrioridade;
    private double dano;

    public Habilidade(TipoDeHabilidade tipo, double deltaPrioridade,double dano) {
        this.tipo = tipo;
        switch (tipo) {
            case SABRE:
                this.prioridade = 0.0 + deltaPrioridade;
                break;
            case FORCA:
                this.prioridade = 1.0 + deltaPrioridade;
                break;
        }
        this.dano = dano;
    }

    public TipoDeHabilidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeHabilidade tipo) {
        this.tipo = tipo;

    }

    public double getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(double prioridade) {
        this.prioridade = prioridade;
    }


    public double getDeltaPrioridade() {
        return deltaPrioridade;
    }

    public void setDeltaPrioridade(double deltaPrioridade) {
        this.deltaPrioridade = deltaPrioridade;
    }

    public double getDano() {
        return dano;
    }

    public void setDano(double dano) {
        this.dano = dano;
    }
}
