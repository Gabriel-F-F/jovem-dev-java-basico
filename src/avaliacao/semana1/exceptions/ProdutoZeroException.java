package avaliacao.semana1.exceptions;

public class ProdutoZeroException extends RuntimeException{

	public ProdutoZeroException() {
		super("Uma venda deve ter pelo menos um Produto!");
	}
	
	public ProdutoZeroException(String mensagemException) {
		super(mensagemException);
	}
}