package seres;

public class SabreDeLuz {

    private String cor;
    private TipoDeSabre tipo;

    public SabreDeLuz(String cor, TipoDeSabre tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public TipoDeSabre getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeSabre tipo) {
        this.tipo = tipo;
    }

    private enum TipoDeSabre {
        espada, lanca, chicote, tonfa
    }
}
