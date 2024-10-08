package aula6.outros;

public enum Calculadora1Enum {

	ADICAO("Adição", (a, b) -> a + b), 
	SUBTRACAO("Subtração", (a, b) -> a - b), 
	MULTIPLICACAO("Multiplicação", (a, b) -> a * b), 
	DIVISAO("Divisão", (a, b) -> a / b);

	private final String nome;
	private final CalculoInterface operacao;

	private Calculadora1Enum(String nome, CalculoInterface operacao) {
		this.nome = nome;
		this.operacao = operacao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int executarOperacao(int a, int b) {
		return operacao.calcula(a, b);
	}
}