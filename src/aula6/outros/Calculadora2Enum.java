package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {

	ADICAO("Adição", (a, b) -> a + b), 
	SUBTRACAO("Subtração", (a, b) -> a - b), 
	MULTIPLICACAO("Multiplicação", (a, b) -> a * b), 
	DIVISAO("Divisão", (a, b) -> a / b);

	private final String nome;
	private final BiFunction<Integer, Integer, Integer> calcula;

	private Calculadora2Enum(String nome, BiFunction<Integer, Integer, Integer> calcula) {
		this.nome = nome;
		this.calcula = calcula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int executarOperacao(int a, int b) {
		return calcula.apply(a, b);
	}
}