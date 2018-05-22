package seres;

import lugares.Academia;

public class Padawan extends Jedi {

    private boolean consegueConstruirSabre;
    private Cavaleiro treinador;

    public Padawan(double pazInterna, Poder[] poderes, Academia academia, boolean consegueConstruirSabre, Cavaleiro treinador) {
        super(pazInterna, poderes, academia);
        this.consegueConstruirSabre = consegueConstruirSabre;
        this.treinador = treinador;
    }

    public Padawan(double pazInterna, Poder[] poderes, Academia academia, Cavaleiro treinador) {
        this(pazInterna, poderes, academia, false, treinador);
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
