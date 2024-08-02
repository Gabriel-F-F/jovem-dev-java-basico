package avaliacao.semana1.exceptions;

public class QuantidadeDiferenteException extends Exception {

	public QuantidadeDiferenteException() {
		super("A quantidade deve ser Maior que 0 e Menor que 50");
	}
	
	public QuantidadeDiferenteException(String mensagemExcecao) {
		super(mensagemExcecao);
	}
}