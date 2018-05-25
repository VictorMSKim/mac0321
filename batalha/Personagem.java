package batalha;

public class Personagem {

    private double vida;
    private boolean dominioForca;
    private boolean dominioSabre;
    private Habilidade[] habilidades;

    public Personagem(double vida, boolean dominioForca, boolean dominioSabre, Habilidade[] habilidades) {
        this.vida = vida;
        this.dominioForca = dominioForca;
        this.dominioSabre = dominioSabre;
        this.habilidades = habilidades;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public boolean isDominioForca() {
        return dominioForca;
    }

    public void setDominioForca(boolean dominioForca) {
        this.dominioForca = dominioForca;
    }

    public boolean isDominioSabre() {
        return dominioSabre;
    }

    public void setDominioSabre(boolean dominioSabre) {
        this.dominioSabre = dominioSabre;
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidade[] habilidades) {
        this.habilidades = habilidades;
    }

}
