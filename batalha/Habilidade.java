package batalha;

public class Habilidade {

    private TipoDeHabilidade tipo;
    private int dano;

    public Habilidade() {
        if (geraHabilidade() == 0) {
            this.tipo = TipoDeHabilidade.SABRE;
            this.dano = geraDanoSabre();
        } else {
            this.tipo = TipoDeHabilidade.FORCA;
            this.dano = geraDanoForca();
        }

    }

    public TipoDeHabilidade getTipoHabilidade() {
        return tipo;
    }

    public int getDano() {
        return dano;
    }

    public int geraDanoSabre() {
        return (20 + (int)(3 + Math.random() * 3) * 10);
    }

    public int geraDanoForca() {
        return (10 + (int)(Math.random() * 6) * 5);
    }

    public int geraHabilidade() {
        return (int)(Math.random() * 2);
    }

    public enum TipoDeHabilidade {
        FORCA, SABRE
    }

}
