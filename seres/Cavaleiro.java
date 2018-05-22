package seres;

import lugares.Academia;

public class Cavaleiro extends Jedi {

    private int anoDeAprovacao;
    private SabreDeLuz sabre;

    public Cavaleiro(double pazInterna, Poder[] poderes, Academia academia, int anoDeAprovacao, SabreDeLuz sabre) {
        super(pazInterna, poderes, academia);
        this.anoDeAprovacao = anoDeAprovacao;
        this.sabre = sabre;
    }

    public int getAnoDeAprovacao() {
        return anoDeAprovacao;
    }

    public void setAnoDeAprovacao(int anoDeAprovacao) {
        this.anoDeAprovacao = anoDeAprovacao;
    }

    public SabreDeLuz getSabre() {
        return sabre;
    }

    public void setSabre(SabreDeLuz sabre) {
        this.sabre = sabre;
    }
}
