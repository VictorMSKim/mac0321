package seres;

import lugares.Academia;
import lugares.Planeta;

public abstract class Jedi extends Ser implements UsuarioDaForca {

    private double pazInterna;
    private Poder[] poderes = new Poder[Poder.NUMERO_PODERES];
    private Academia academia;

    public Jedi(String nome, String genero, String especie, String dataDeNascimento, Planeta localDeOrigem,
                double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia) {
        super(nome, genero, especie, dataDeNascimento, localDeOrigem, concentracaoDeMidichlorians);
        this.pazInterna = pazInterna;
        this.poderes = poderes;
        this.academia = academia;
    }

    public double getPazInterna() {
        return pazInterna;
    }

    public void setPazInterna(double pazInterna) {
        this.pazInterna = pazInterna;
    }

    public Poder[] getPoderes() {
        return poderes;
    }

    public void setPoderes(Poder[] poderes) {
        this.poderes = poderes;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }
}
