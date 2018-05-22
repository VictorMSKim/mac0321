package seres;

import lugares.Academia;

public class Aprendiz extends Sith{

	private boolean consegueConstruirSabre;

	private Lorde lorde;

	public Aprendiz(double porcentagemRaiva, String novoNome, Poder[] poderes, Academia academia, boolean consegueConstruirSabre, Lorde lorde) {
		super(porcentagemRaiva, novoNome, poderes, academia);
		this.consegueConstruirSabre = consegueConstruirSabre;
		this.lorde = lorde;
	}

	public void setConsegueContruirSabre(boolean consegueConstruirSabre) {
		this.consegueConstruirSabre = consegueConstruirSabre;
	}

	public boolean getConsegueConstruirSabre() {
		return consegueConstruirSabre;
	}

	public void setLorde(Lorde lorde) {
		this.lorde = lorde;
	}

	public Lorde getLorde() {
		return lorde;
	}

}