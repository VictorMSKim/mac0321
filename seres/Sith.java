package seres;

import lugares.Academia;
import lugares.Planeta;

public abstract class Sith extends Ser {

	private Academia academia;

	private String novoNome;

	private double porcentagemRaiva;

	private Poder[] poderes = new Poder[Poder.NUMERO_PODERES];

	public Sith(String nome, String genero, String especie, String dataDeNascimento, Planeta localDeOrigem,
				double concentracaoDeMidichlorians, Academia academia, String novoNome, double porcentagemRaiva, Poder[] poderes) {
		super(nome, genero, especie, dataDeNascimento, localDeOrigem, concentracaoDeMidichlorians);
		this.academia = academia;
		this.novoNome = novoNome;
		this.porcentagemRaiva = porcentagemRaiva;
		this.poderes = poderes;
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