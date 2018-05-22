package seres;

public class Conselho {

	private Conselho conselho;

	public Conselho(Sith conselhoDeSiths) {
		this.conselho = conselhoDeSiths;
	}

	public Conselho(Jedi conselhoDeJedis) {
		this.conselho = conselhoDeJedis;
	}

	public void setConselho(Conselho conselho) {
		this.conselho = conselho;
	}

	public Conselho getConselho() {
		return conselho;
	}

}