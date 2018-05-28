package batalha.controller;

public class Esquiva implements Acao {
    @Override
    public TipoDeAcao getTipoAcao() {
        return TipoDeAcao.esquiva;
    }
}
