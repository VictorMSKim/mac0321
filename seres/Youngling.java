package seres;

import lugares.Academia;
import lugares.Planeta;

public class Youngling extends Jedi {

    private String clan;
    private Mestre mestre;
    private boolean JaColheuCristais;

    public Youngling(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                     double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                     String clan, Mestre mestre, boolean jaColheuCristais) {
        super(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia);
        this.clan = clan;
        this.mestre = mestre;
        JaColheuCristais = jaColheuCristais;
    }

    public Youngling(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                     double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                     String clan, Mestre mestre) {
        this(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia, clan, mestre, false);
    }

    public String getClan() {
        return clan;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    public Mestre getMestre() {
        return mestre;
    }

    public void setMestre(Mestre mestre) {
        this.mestre = mestre;
    }

    public boolean isJaColheuCristais() {
        return JaColheuCristais;
    }

    public void setJaColheuCristais(boolean jaColheuCristais) {
        JaColheuCristais = jaColheuCristais;
    }
}
