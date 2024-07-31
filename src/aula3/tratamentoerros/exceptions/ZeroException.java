package aula3.tratamentoerros.exceptions;

public class ZeroException extends ArithmeticException {

	public ZeroException() {
		super("O segundo número não pode ser zero!");
	}
}