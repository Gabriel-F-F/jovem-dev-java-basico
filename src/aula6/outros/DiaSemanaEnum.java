package aula6.outros;

public enum DiaSemanaEnum {

	SEGUNDA_FEIRA("Segunda-Feira", false),
	TERCA_FEIRA("Terça-Feira", false),
	QUARTA_FEIRA("Quarta-Feira", false),
	QUINTA_FEIRA("Quinta-Feira", false),
	SEXTA_FEIRA("Sexta-Feira", false),
	SABADO("Sábado", true),
	DOMINGO("Domingo", true);
	
	private String nome;
	private boolean isFimDeSemana;
	
	private DiaSemanaEnum(String nome, boolean isFimDeSemana) {
		this.nome = nome;
		this.isFimDeSemana = isFimDeSemana;
	}

	public String getNome() {
		return nome;
	}

	public boolean isFimDeSemana() {
		return isFimDeSemana;
	}
}