package missao;

import lugares.Planeta;
import seres.LiderDeMissao;
import seres.Ser;

import java.util.List;

public class Missao {

    private int anoDeElaboracao;
    private int criadorDaMissao;
    private LiderDeMissao ResponsavelPelaMissao;
    private boolean cumprida;
    private Planeta local;
    private List<Ser> envolvidos;

    public Missao(int anoDeElaboracao, int criadorDaMissao, LiderDeMissao responsavelPelaMissao, boolean cumprida,
                  Planeta local, List<Ser> envolvidos) {
        this.anoDeElaboracao = anoDeElaboracao;
        this.criadorDaMissao = criadorDaMissao;
        ResponsavelPelaMissao = responsavelPelaMissao;
        this.cumprida = cumprida;
        this.local = local;
        this.envolvidos = envolvidos;
    }

    public Missao(int anoDeElaboracao, int criadorDaMissao, LiderDeMissao responsavelPelaMissao, Planeta local,
                  List<Ser> envolvidos) {
       this(anoDeElaboracao, criadorDaMissao, responsavelPelaMissao, false, local, envolvidos);
    }

    public int getAnoDeElaboracao() {
        return anoDeElaboracao;
    }

    public void setAnoDeElaboracao(int anoDeElaboracao) {
        this.anoDeElaboracao = anoDeElaboracao;
    }

    public int getCriadorDaMissao() {
        return criadorDaMissao;
    }

    public void setCriadorDaMissao(int criadorDaMissao) {
        this.criadorDaMissao = criadorDaMissao;
    }

    public LiderDeMissao getResponsavelPelaMissao() {
        return ResponsavelPelaMissao;
    }

    public void setResponsavelPelaMissao(LiderDeMissao responsavelPelaMissao) {
        ResponsavelPelaMissao = responsavelPelaMissao;
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

    public List<Ser> getEnvolvidos() {
        return envolvidos;
    }

    public void setEnvolvidos(List<Ser> envolvidos) {
        this.envolvidos = envolvidos;
    }
}
