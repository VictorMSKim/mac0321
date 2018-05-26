package batalha;

import batalha.controller.Acao;

public class Jogador {

    private String nome;
    private int vida;
    private boolean dominioForca;
    private boolean dominioSabre;
    private Habilidade[] habilidades;
    private Acao acao;
    private Estado estado;

    public Jogador(String nome, int vida, boolean dominioForca, boolean dominioSabre, Habilidade[] habilidades) {
        this.nome = nome;
        this.vida = vida;
        this.dominioForca = dominioForca;
        this.dominioSabre = dominioSabre;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isDominioForca() {
        return dominioForca;
    }

    public void setDominioForca(boolean dominioForca) {
        this.dominioForca = dominioForca;
    }

    public boolean isDominioSabre() {
        return dominioSabre;
    }

    public void setDominioSabre(boolean dominioSabre) {
        this.dominioSabre = dominioSabre;
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidade[] habilidades) { this.habilidades = habilidades; }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public String sofreAtaque(Habilidade habilidade) {
        if ((this.estado == Estado.esquiva && habilidade.getTipo() == Habilidade.TipoDeHabilidade.FORCA)
                || this.estado == Estado.ataca) {
            setVida(this.vida - habilidade.getDano());
            return "%s atacou " + "%s sofreu ataque (Dano: " + habilidade.getDano() + ", Vida: " + getVida() + ")";
        }
        else { return "%s tentou atacar e %s esquivou com sucesso!"; }
    }

    public void esquiva() { this.estado = Estado.esquiva; }

    public void ataca() { this.estado = Estado.ataca; }

    private enum Estado {
        esquiva, ataca
    }

}
