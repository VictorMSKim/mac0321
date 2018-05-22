package missao;

import lugares.Planeta;
import seres.ParticipanteDeMissao;
import seres.Ser;

import java.util.List;

public class Missao {

    private int anoDeElaboracao;
    private ParticipanteDeMissao[] criadorDaMissao;
    private String nomeDaMissao;
    private ParticipanteDeMissao[] responsavelPelaMissao;
    private boolean cumprida;
    private Planeta local;
    private String proposito;
    private List<Ser> envolvidos;

    public Missao(int anoDeElaboracao, ParticipanteDeMissao[] criadorDaMissao, String nomeDaMissao, ParticipanteDeMissao[] responsavelPelaMissao, boolean cumprida,
                  Planeta local, String proposito, List<Ser> envolvidos) {
        this.anoDeElaboracao = anoDeElaboracao;
        this.criadorDaMissao = criadorDaMissao;
        this.nomeDaMissao = nomeDaMissao;
        this.responsavelPelaMissao = responsavelPelaMissao;
        this.cumprida = cumprida;
        this.local = local;
        this.proposito = proposito;
        this.envolvidos = envolvidos;
    }

    public Missao(int anoDeElaboracao, ParticipanteDeMissao[] criadorDaMissao, String nomeDaMissao,ParticipanteDeMissao[] responsavelPelaMissao, Planeta local,
                  String proposito, List<Ser> envolvidos) {
       this(anoDeElaboracao, criadorDaMissao, nomeDaMissao, responsavelPelaMissao, false, local, proposito, envolvidos);
    }

    public int getAnoDeElaboracao() {
        return anoDeElaboracao;
    }

    public void setAnoDeElaboracao(int anoDeElaboracao) {
        this.anoDeElaboracao = anoDeElaboracao;
    }

    public ParticipanteDeMissao[] getCriadorDaMissao() {
        return criadorDaMissao;
    }

    public void setCriadorDaMissao(ParticipanteDeMissao[] criadorDaMissao) {
        this.criadorDaMissao = criadorDaMissao;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public ParticipanteDeMissao[] getResponsavelPelaMissao() {
        return responsavelPelaMissao;
    }

    public void setResponsavelPelaMissao(ParticipanteDeMissao[] responsavelPelaMissao) {
        this.responsavelPelaMissao = responsavelPelaMissao;
    }

    public boolean isCumprida() {
        return cumprida;
    }

    public void setCumprida(boolean cumprida) {
        this.cumprida = cumprida;
    }

    public Planeta getLocal() {
        return local;
    }

    public void setLocal(Planeta local) {
        this.local = local;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public List<Ser> getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(List<Ser> envolvidos) {
        this.envolvidos = envolvidos;
    }
}
