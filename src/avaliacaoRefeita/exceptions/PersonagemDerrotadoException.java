package avaliacaoRefeita.exceptions;

import avaliacaoRefeita.entidades.Personagem;

public class PersonagemDerrotadoException extends Exception {
	
	public PersonagemDerrotadoException(Personagem a, Personagem b) {
		super(a + " derroutou " + b);
	}
}