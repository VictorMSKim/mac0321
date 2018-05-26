package seres;

public class ParticipanteDeMissao {

    private Ser participante;

    public ParticipanteDeMissao(Jedi participante) {
    	this.participante = participante;
    }

    public ParticipanteDeMissao(Sith participante) {
    	this.participante = participante;
    }

    public void setParticipante(Ser participante) {
    	this.participante = participante;
    }

    public Ser getParticipante() {
    	return participante;
    }

}
