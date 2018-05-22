package seres;

import lugares.Academia;
import lugares.Planeta;

public class Lorde extends Sith implements LiderDeMissao {

    private SabreDeLuz sabre;

    private double campoDeVidencia;

    public Lorde(String nome, String genero, String especie, String dataDeNascimento, Planeta localDeOrigem,
                 double concentracaoDeMidichlorians, Academia academia, String novoNome, double porcentagemRaiva,
                 Poder[] poderes, SabreDeLuz sabre, double campoDeVidencia) {
        super(nome, genero, especie, dataDeNascimento, localDeOrigem, concentracaoDeMidichlorians, academia, novoNome,
                porcentagemRaiva, poderes);
        this.sabre = sabre;
        this.campoDeVidencia = campoDeVidencia;
    }

    public void setSabreDeLuz(SabreDeLuz sabre) {
        this.sabre = sabre;
    }

    public SabreDeLuz getSabre() {
        return sabre;
    }

    public void setCampoDeVidencia(double campoDeVidencia) {
        this.campoDeVidencia = campoDeVidencia;
    }

    public double getCampoDeVidencia() {
        return campoDeVidencia;
    }

    @Override
    public void LideraMissao() {
        //TODO
    }
}