package seres;

import lugares.Academia;
import lugares.Planeta;

public class Aprendiz extends Sith{

	private boolean consegueConstruirSabre;

	private Lorde lorde;

	public Aprendiz(String nome, String genero, String especie, String dataDeNascimento, Planeta localDeOrigem,
					double concentracaoDeMidichlorians, Academia academia, String novoNome, double porcentagemRaiva,
					Poder[] poderes, boolean consegueConstruirSabre, Lorde lorde) {
		super(nome, genero, especie, dataDeNascimento, localDeOrigem, concentracaoDeMidichlorians, academia, novoNome,
				porcentagemRaiva, poderes);
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