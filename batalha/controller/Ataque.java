package batalha.controller;

import batalha.Habilidade;

public class Ataque implements Acao {

    private Habilidade ataque;

    public Ataque (Habilidade ataque) {
        this.ataque = ataque;
    }

    public Habilidade getAtaque() {
        return ataque;
    }

    public TipoDeAcao getTipo() {
        return null;
    }
}
