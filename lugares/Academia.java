package lugares;

import seres.Conselho;

public class Academia {

	private Ordem ordem;
    private Conselho conselho;
    private Planeta planeta;

    public Academia(Ordem ordem, Conselho conselho, Planeta planeta) {
    	this.ordem = ordem;
    	this.conselho = conselho;
    	this.planeta = planeta;
    }

    public void setOrdem(Ordem ordem) {
    	this.ordem = ordem;
    }

    public Ordem getOrdem() {
    	return ordem;
    }

    public void setConselho(Conselho conselho) {
    	this.conselho = conselho;
    }

    public Conselho getConselho() {
    	return conselho;
    }

    public void setPlaneta(Planeta planeta) {
    	this.planeta = planeta;
    }

    public Planeta getPlaneta() {
    	return planeta;
    }
    
}
