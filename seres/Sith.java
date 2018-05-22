package seres;

import lugares.Academia;

public abstract class Sith extends Ser {

	private Academia academia;

	private String novoNome;

	private double porcentagemRaiva;

	private Poder[] poderes = new Poder[Poder.NUMERO_PODERES];

	public Sith(double porcentagemRaiva, String novoNome, Poder[] poderes, Academia academia) {
		this.porcentagemRaiva = porcentagemRaiva;
		this.novoNome = novoNome;
		this.poderes = poderes;
		this.academia = academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setNovoNome(String novoNome) {
		this.novoNome = novoNome;
	}

	public String getNovoNome() {
		return novoNome;
	}

	public void setPorcentagemRaiva(double porcentagemRaiva) {
		this.porcentagemRaiva = porcentagemRaiva;
	}

	public double getPorcentagemRaiva() {
		return porcentagemRaiva;
	}

	public void setPoderes(Poder[] poderes) {
		this.poderes = poderes;
	}

	public Poder[] getPoderes() {
		return poderes;
	}
}