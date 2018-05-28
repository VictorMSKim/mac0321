package batalha.controller;

public interface Acao {

    TipoDeAcao getTipoAcao();

    enum TipoDeAcao {
        ataque, esquiva
    }
}
