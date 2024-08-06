package enumStringBuilderBigDecimalObjects;

import java.util.function.Function;

public enum FormaPagamento {

	//Variáveis Globais imutáveis
	CARTAO_DE_CREDITO(1, "Cartão de Crédito", vd -> vd),
	CARTAO_DE_DEBITO(2, "Cartão de Débito", vd -> vd),
	DINHEIRO(3, "Dinheiro", vd -> vd * 0.8),
	PIX(17, "PIX", vd -> 0.9);
	
	//Atribuição Valores para os Enums (via Construtor)
	private int codigo;
	private String descricao;
	private Function<Double, Double> desconto;
	
	private FormaPagamento(int codigo, String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
	}

	//Acesso Global aos Atributos dos Enums
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Function<Double, Double> getDesconto() {
		return desconto;
	}
}