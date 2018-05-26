package batalha.controller;

import batalha.Habilidade;
import batalha.Jogador;

public class BatalhaController extends Controller {

    private Jogador mestreJedi;
    private Jogador lordeSith;


    public BatalhaController(Jogador sith, Jogador jedi) {
        lordeSith = sith;
        mestreJedi = jedi;
    }

    private class AtacaEvent extends Event {

        Jogador atacante;
        Jogador atacado;
        Habilidade ataque ;
        String resultado;

        public AtacaEvent(long eventTime, Jogador atacante, Jogador atacado) {
            super(eventTime);
            this.atacante = atacante;
            this.ataque = ((Ataque) atacante.getAcao()).getAtaque();
            this.atacado = atacado;
        }

        @Override
        public void action() {
            atacante.ataca();
            resultado = atacado.sofreAtaque(ataque);
        }

        @Override
        public String description() {
            return String.format(resultado, atacante.getNome(), atacado.getNome());
        }
    }

    private class EsquivaEvent extends Event {

        Jogador jogador;

        public EsquivaEvent(long eventTime, Jogador jogador) {
            super(eventTime);
            this.jogador = jogador;
        }

        @Override
        public void action() {
            jogador.esquiva();
        }

        @Override
        public String description() {
            return jogador + " se prepara pra esquivar.";
        }
    }

    private class PreparaRodadaEvent extends Event {

        public PreparaRodadaEvent(long eventTime) {
            super(eventTime);
        }

        @Override
        public void action() {
            //Poderia usar if (acaoJedi instanceof Ataque.java) {...} ao invés de switch(acaoJedi.getTipo()) {...}
            if (mestreJedi.getAcao().getTipo() == Acao.TipoDeAcao.esquiva) {
                if (lordeSith.getAcao().getTipo() == Acao.TipoDeAcao.esquiva) {
                    addEvent(new EsquivaEvent(System.currentTimeMillis() + 1000, mestreJedi));
                    addEvent(new EsquivaEvent(System.currentTimeMillis() + 2000, lordeSith));
                } else {
                    addEvent(new EsquivaEvent(System.currentTimeMillis() + 1000, mestreJedi));
                    addEvent(new AtacaEvent(System.currentTimeMillis() + 2000, lordeSith, mestreJedi));
                }
            } else {
                if (lordeSith.getAcao().getTipo() == Acao.TipoDeAcao.esquiva) {
                    addEvent(new EsquivaEvent(System.currentTimeMillis() + 1000, lordeSith));
                    addEvent(new AtacaEvent(System.currentTimeMillis() + 2000, mestreJedi, lordeSith));
                } else {
                    if (((Ataque) mestreJedi.getAcao()).getAtaque().getTipo() == Habilidade.TipoDeHabilidade.FORCA
                            && ((Ataque) lordeSith.getAcao()).getAtaque().getTipo() == Habilidade.TipoDeHabilidade.SABRE) {
                        addEvent(new AtacaEvent(System.currentTimeMillis() + 1000, lordeSith, mestreJedi));
                        addEvent(new AtacaEvent(System.currentTimeMillis() + 2000, mestreJedi, lordeSith));
                    } else {
                        addEvent(new AtacaEvent(System.currentTimeMillis() + 1000, mestreJedi, lordeSith));
                        addEvent(new AtacaEvent(System.currentTimeMillis() + 2000, lordeSith, mestreJedi));
                    }
                }
            }
        }

        @Override
        public String description() {
            return "Preparando rodada ...";
        }
    }
}
