package batalha.controller;

public interface Acao {

    TipoDeAcao getTipo();

    enum TipoDeAcao {
        ataque, esquiva
    }
}
