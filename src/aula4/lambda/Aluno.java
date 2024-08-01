package aula4.lambda;

import java.util.Date;

public class Aluno {

	int numeroChamada;
	String nome;
	Date dataNascimento;
	
	@Override
	public String toString() {
		return "Número Chamada: " + numeroChamada + ", Nome: " + nome + ", Data de Nascimento: " + dataNascimento + "\n";
	}
}