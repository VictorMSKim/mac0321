package seres;

import lugares.Academia;
import lugares.Planeta;

public class Mestre extends Cavaleiro {

    private double campoDeVidencia;
    private boolean imortalidade;

    public Mestre(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                  double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                  int anoDeAprovacao, SabreDeLuz sabre, double campoDeVidencia, boolean imortalidade) {
        super(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia, anoDeAprovacao, sabre);
        this.campoDeVidencia = campoDeVidencia;
        this.imortalidade = imortalidade;
    }

    public Mestre(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                  double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                  int anoDeAprovacao, SabreDeLuz sabre, double campoDeVidencia) {
        this(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia, anoDeAprovacao, sabre, campoDeVidencia, false);
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
