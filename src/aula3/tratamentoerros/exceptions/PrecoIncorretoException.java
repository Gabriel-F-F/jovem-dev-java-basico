package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends RuntimeException {

	public PrecoIncorretoException() {
		super("O valor deve ser maior que 0!");
	}

}
