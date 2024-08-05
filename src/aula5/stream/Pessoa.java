package aula5.stream;

import java.time.LocalDate;

public class Pessoa {
	
	String nome;
	String telefone;
	LocalDate dataNascimento;

	public Pessoa(String nome, String telefone, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String toString() {
		return "Nome: " + nome + ", Telefone: " + telefone + ", Data de Nascimento: " + dataNascimento + "\n";
	}
}