package aula5.stream.exceptions;

public class ZeroBertoException extends Exception {

	public ZeroBertoException() {
		super("Não há nenhum Berto");
	}
	public ZeroBertoException(String mensagemException) {
		super(mensagemException);
	}
}