package aula4.lambda;

import java.time.LocalDate;

public class Aluno {

	int numeroChamada;
	String nome;
	LocalDate dataNascimento;
	
	@Override
	public String toString() {
		return "Número Chamada: " + numeroChamada + ", Nome: " + nome + ", Data de Nascimento: " + dataNascimento + "\n";
	}

	public LocalDate dataNascimento() {
		// TODO Auto-generated method stub
		return null;
	}
}