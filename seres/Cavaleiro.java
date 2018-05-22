package seres;

import lugares.Academia;
import lugares.Planeta;

public class Cavaleiro extends Jedi {

    private int anoDeAprovacao;
    private SabreDeLuz sabre;

    public Cavaleiro(String nome, String genero, String especie, String dataDeNascimento, Planeta localDeOrigem,
                     double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                     int anoDeAprovacao, SabreDeLuz sabre) {
        super(nome, genero, especie, dataDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia);
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
