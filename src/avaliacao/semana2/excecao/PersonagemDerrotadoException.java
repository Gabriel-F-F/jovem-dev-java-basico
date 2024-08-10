package avaliacao.semana2.excecao;

import avaliacao.semana2.entidades.Personagem;

public class PersonagemDerrotadoException extends Exception {

	public PersonagemDerrotadoException(String nome1, String nome2) {
		super(nome1 + " foi derretado por " + nome2);
	}
	
	public PersonagemDerrotadoException(String mensagemException) {
		super(mensagemException);
	}
}