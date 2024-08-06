package aula6.outros;

public enum Calculadora1Enum {

	ADICAO("Adição", 1), 
	SUBTRACAO("Subtração", 2), 
	MULTIPLICACAO("Multiplicação", 3), 
	DIVISAO("Divisão", 4);

	private String nome;
	private int codigo;

	private Calculadora1Enum(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}
}