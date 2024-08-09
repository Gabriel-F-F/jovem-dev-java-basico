package avaliacao.semana2.excecao;

import avaliacao.semana2.entidades.Personagem;

public class PersonagemDerrotadoException extends Exception {

	public PersonagemDerrotadoException(Personagem a, Personagem b) {
		super(a + " foi derretado por " + b);
	}
	
	public PersonagemDerrotadoException(String mensagemException) {
		super(mensagemException);
	}
}