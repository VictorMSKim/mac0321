package seres;

public class ParticipanteDeMissao {

    private ParticipanteDeMissao participante;

    public ParticipanteDeMissao(Jedi participante) {
    	this.participante = participante;
    }

    public ParticipanteDeMissao(Sith participante) {
    	this.participante = participante;
    }

    public void setParticipante(ParticipanteDeMissao participante) {
    	this.participante = participante;
    }

    public ParticipanteDeMissao getParticipante() {
    	return participante;
    }

}
