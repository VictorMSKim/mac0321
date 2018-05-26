package seres;

import lugares.Planeta;

public class Ser {
	
	private String nome;
	private String genero;
	private String especie;
	private int anoDeNascimento;
	private Planeta localDeOrigem;
	private double concentracaoDeMidichlorians;
	
	public Ser(String nome, String genero, String especie, int anoDeNascimento, Planeta localDeOrigem,
               double concentracaoDeMidichlorians) {
		this.nome = nome;
		this.genero = genero;
		this.especie = especie;
		this.anoDeNascimento = anoDeNascimento;
		this.localDeOrigem = localDeOrigem;
		this.concentracaoDeMidichlorians = concentracaoDeMidichlorians;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	
	public void setAnoDeNascimento(int anoDeNascimento) {
		this.anoDeNascimento = anoDeNascimento;
	}
	
	public int getAnoDeNascimento() {
		return anoDeNascimento;
	}
	

	public void setLocalDeOrigem(Planeta localDeOrigem) {
		this.localDeOrigem = localDeOrigem;
	}

	public Planeta getLocalDeOrigem() {
		return localDeOrigem;
	}

	
	public void setConcentracaoDeMC(double concentracao) {
		this.concentracaoDeMidichlorians = concentracao;
	}

	public double getConcentracaoDeMC() {
		return concentracaoDeMidichlorians;
	}


}

