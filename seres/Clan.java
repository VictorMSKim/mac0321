package seres;

public class Clan {
	
	private Mestre mestre;
	private int anoDeCriacao;
	private int anoDeExtincao;

	public Clan(Mestre mestre, int anoDeCriacao, int anoDeExtincao) {
		this.mestre = mestre;
		this.anoDeCriacao = anoDeCriacao;
		this.anoDeExtincao = anoDeExtincao;
	}

	public Clan(Mestre mestre, int anoDeCriacao) {
		this.mestre = mestre;
		this.anoDeCriacao = anoDeCriacao;
	}

	public void setMestre(Mestre mestre) {
		this.mestre = mestre;
	}

	public Mestre getMestre() {
		return mestre;
	}

	public void setAnoDeCriacao(int anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}

	public int getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeExtincao(int anoDeExtincao) {
		this.anoDeExtincao = anoDeExtincao;
	}

	public int getAnoDeExtincao() {
		return anoDeExtincao;
	}

}