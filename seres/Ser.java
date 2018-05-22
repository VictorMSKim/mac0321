package seres;

public class Ser {
	
	private String nome;
	
	private String genero;
	
	private String especie;
	
	private String dataDeNascimento;
	
	private String localDeOrigem;
	
	private double concentracaoDeMidichlorians;
	

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
	
	
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	

	public void setLocalDeOrigem(String localDeOrigem) {
		this.localDeOrigem = localDeOrigem;
	}

	public String getLocalDeOrigem() {
		return localDeOrigem;
	}

	
	public void setConcentracaoDeMC(double concentracao) {
		this.concentracaoDeMidichlorians = concentracao;
	}

	public double getConcentracaoDeMC() {
		return concentracaoDeMidichlorians;
	}


}

