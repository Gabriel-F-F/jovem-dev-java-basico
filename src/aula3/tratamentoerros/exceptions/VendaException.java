package aula3.tratamentoerros.exceptions;

public class VendaException extends Exception {

	public VendaException() {
		super("A quantidade de Itens deve ser entre 1 e 10!");
	}
	
	public VendaException(String mensagemExcecao) {
		super(mensagemExcecao);
	}
}