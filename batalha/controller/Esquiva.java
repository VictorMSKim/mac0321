package batalha.controller;

public class Esquiva implements Acao {
    @Override
    public TipoDeAcao getTipo() {
        return TipoDeAcao.esquiva;
    }
}
