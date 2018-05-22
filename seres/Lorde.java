package seres;

import lugares.Academia;

public class Lorde extends Sith {

	private SabreDeLuz sabre;

	private double campoDeVidencia;

	public Lorde(double porcentagemRaiva, String novoNome, Poder[] poderes, Academia academia, SabreDeLuz sabre, double campoDeVidencia) {
		super(porcentagemRaiva, novoNome, poderes, academia);
		this.sabre = sabre;
		this.campoDeVidencia = campoDeVidencia;
	}

	public void setSabreDeLuz(SabreDeLuz sabre) {
		this.sabre = sabre;
	}

	public SabreDeLuz getSabre() {
		return sabre;
	}

	public void setCampoDeVidencia(double campoDeVidencia) {
		this.campoDeVidencia = campoDeVidencia;
	}

	public double getCampoDeVidencia() {
		return campoDeVidencia;
	}
	
}