package lugares;

import seres.Cavaleiro;

public class Academia {

	private Ordem ordem;
    private Cavaleiro[] conselho;
    private Planeta planeta;

    public Academia(Ordem ordem, Cavaleiro[] conselho, Planeta planeta) {
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

    public void setConselho(Cavaleiro[] conselho) {
    	this.conselho = conselho;
    }

    public Cavaleiro[] getConselho() {
    	return conselho;
    }

    public void setPlaneta(Planeta planeta) {
    	this.planeta = planeta;
    }

    public Planeta getPlaneta() {
    	return planeta;
    }
    
}
