package batalha.controller;

import batalha.Habilidade;
import batalha.Jogador;

public class BatalhaController extends Controller {

    private Jogador mestreJedi;
    private Jogador lordeSith;

    public static void main (String[] args) {
        Habilidade[] habilidadesJedi = {
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 30),
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 25),
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 20),
                new Habilidade(Habilidade.TipoDeHabilidade.SABRE, 10)
        };

        Habilidade[] habilidadesSith = {
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 30),
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 25),
                new Habilidade(Habilidade.TipoDeHabilidade.FORCA, 20),
                new Habilidade(Habilidade.TipoDeHabilidade.SABRE, 10)
        };

        Jogador jedi = new Jogador("j1", 100, true, true, habilidadesJedi);
        Jogador sith = new Jogador("j2", 150, true, true, habilidadesSith);
        BatalhaController bc = new BatalhaController(sith, jedi);

        while (jedi.getVida() > 0 && sith.getVida() > 0) {
            jedi.setAcao(new Ataque(habilidadesJedi[0]));
            sith.setAcao(new Ataque(habilidadesSith[3]));
            bc.addEvent(bc.new PreparaRodadaEvent(System.currentTimeMillis()));
            bc.run();
        }
    }

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
