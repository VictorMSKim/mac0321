package batalha;

public class Habilidade {

    private TipoDeHabilidade tipo;
    private int dano;

    public Habilidade(TipoDeHabilidade tipo, int dano) {
        this.tipo = tipo;
        this.dano = dano;
    }

    public TipoDeHabilidade getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeHabilidade tipo) {
        this.tipo = tipo;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public enum TipoDeHabilidade {
        FORCA, SABRE
    }

}
