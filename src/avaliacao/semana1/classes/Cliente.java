package avaliacao.semana1.classes;

import java.time.LocalDate;

public class Cliente extends Produto{

	public String nomeCliente;
	public LocalDate dataNascimento;
	
	public Cliente() {
	}

	public Cliente(String nomeCliente, LocalDate dataNascimento) {
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
	}
	
	public String toString() {
		return "Cliente: " + nomeCliente + ", Data de Nascimento: " + dataNascimento;
	}
}