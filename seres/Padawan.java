package seres;

import lugares.Academia;
import lugares.Planeta;

public class Padawan extends Jedi {

    private boolean consegueConstruirSabre;
    private Cavaleiro treinador;

    public Padawan(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                   double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                   boolean consegueConstruirSabre, Cavaleiro treinador) {
        super(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia);
        this.consegueConstruirSabre = consegueConstruirSabre;
        this.treinador = treinador;
    }

    public Padawan(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
                   double concentracaoDeMidichlorians, double pazInterna, Poder[] poderes, Academia academia,
                   Cavaleiro treinador) {
        this(nome, genero, especie, anoDeNascimento, localDeOrigem, concentracaoDeMidichlorians, pazInterna, poderes,
                academia, false, treinador);
    }

    public boolean isConsegueConstruirSabre() {
        return consegueConstruirSabre;
    }

    public void setConsegueConstruirSabre(boolean consegueConstruirSabre) {
        this.consegueConstruirSabre = consegueConstruirSabre;
    }

    public Cavaleiro getTreinador() {
        return treinador;
    }

    public void setTreinador(Cavaleiro treinador) {
        this.treinador = treinador;
    }

}
