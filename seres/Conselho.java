package seres;

public class Conselho {

	private Ser[] conselho;

	public Conselho(Sith[] conselhoDeSiths) {
		this.conselho = conselhoDeSiths;
	}

	public Conselho(Jedi[] conselhoDeJedis) {
		this.conselho = conselhoDeJedis;
	}

	public void setConselho(Ser[] conselho) {
		this.conselho = conselho;
	}

	public Ser[] getConselho() {
		return conselho;
	}

}