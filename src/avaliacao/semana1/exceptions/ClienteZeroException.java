package avaliacao.semana1.exceptions;

public class ClienteZeroException extends Exception {
	
	public ClienteZeroException() {
		super("Uma venda de possuir um Cliente!");
	}
	
	public ClienteZeroException(String mensagemString) {
		super(mensagemString);
	}
}
