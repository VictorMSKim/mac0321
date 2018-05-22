package lugares;

public class Planeta {

	private String cor;
	private Ordem ordem;
	private String sistema;
	private double diametro;
	private String capital;

	public Planeta(String cor, Ordem ordem, String sistema, double diametro, String capital) {
		this.cor = cor;
		this.ordem = ordem;
		this.sistema = sistema;
		this.diametro = diametro;
		this.capital = capital;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}

	public Ordem getOrdem() {
		return ordem;
	}

	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCapital() {
		return capital;
	}
}
