package batalha;

import batalha.controller.Acao;
import batalha.controller.Ataque;
import batalha.controller.Esquiva;

public class Jogador {

    private final int gerador =  4 + (int)(Math.random() * 4);
    private String nome;
    private int vida;
    private double dominioForca;
    private double dominioSabre;
    private Habilidade[] habilidades = new Habilidade[10];
    private Acao acao;
    private Estado estado;

    public Jogador(String nome, int vida, double dominioForca, double dominioSabre) {
        this.nome = nome;
        this.vida = vida;
        this.dominioForca = dominioForca / 100;
        this.dominioSabre = dominioSabre / 100;
        this.habilidades = criaHabilidades();
        this.estado = Estado.ataca;
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
//
//    public double getDominioForca() {
//        return dominioForca;
//    }
//
//    public double getDominioSabre() {
//        return dominioSabre;
//    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao() {
        int x = (int)(Math.random() * 3);
        if(x > 0) {
            acao = new Ataque(this.habilidades[(int)(Math.random() * this.gerador)]);
        } else {
            acao = new Esquiva();
        }
    }

    public String sofreAtaque(Habilidade habilidade) {
        if ((this.estado == Estado.esquiva && habilidade.getTipoHabilidade() == Habilidade.TipoDeHabilidade.FORCA)
                || this.estado == Estado.ataca) {
            setVida(this.vida - habilidade.getDano());
            return "%s atacou %s sofreu ataque (Dano do golpe: " + habilidade.getDano() + ", Vida do atacado: " + getVida() + ")";
        }
        else { return "%s tentou atacar e %s esquivou com sucesso!"; }
    }

    public void esquiva() { this.estado = Estado.esquiva; }

    public void ataca() { this.estado = Estado.ataca; }

    public Habilidade[] criaHabilidades() {
        for (int i = 0; i < this.gerador; i++) {
            habilidades[i] = new Habilidade();
        }
        return habilidades;
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }

    private enum Estado {
        esquiva, ataca
    }

}
