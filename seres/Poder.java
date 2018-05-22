package seres;

public class Poder {

    public final static int NUMERO_PODERES = 3;
    private TipoDePoder tipo;

    public Poder(TipoDePoder tipo) {
    	this.tipo = tipo;
    }

    public void setTipo(TipoDePoder tipo) {
    	this.tipo = tipo;
    }

    public TipoDePoder getTipo() {
    	return tipo;
    }

    private enum TipoDePoder {
    	telepatia, telecinese, persuasao
    }
}
