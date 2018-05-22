package seres;

import lugares.Academia;

public class Mestre extends Cavaleiro {

    private double campoDeVidencia;
    private boolean imortalidade;

    public Mestre(double pazInterna, Poder[] poderes, Academia academia, int anoDeAprovacao, double campoDeVidencia, boolean imortalidade, SabreDeLuz sabre) {
        super(pazInterna, poderes, academia, anoDeAprovacao, sabre);
        this.campoDeVidencia = campoDeVidencia;
        this.imortalidade = imortalidade;
    }

    public Mestre(double pazInterna, Poder[] poderes, Academia academia, int anoDeAprovacao, double campoDeVisao, SabreDeLuz sabre) {
        this(pazInterna, poderes, academia, anoDeAprovacao, campoDeVisao, false, sabre);
    }

    public double getCampoDeVidencia() {
        return campoDeVidencia;
    }

    public void setCampoDeVidencia(double campoDeVidencia) {
        this.campoDeVidencia = campoDeVidencia;
    }

    public boolean isImortalidade() {
        return imortalidade;
    }

    public void setImortalidade(boolean imortalidade) {
        this.imortalidade = imortalidade;
    }
}
