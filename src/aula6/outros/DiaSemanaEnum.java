package aula6.outros;

public enum DiaSemanaEnum {

	SEGUNDA_FEIRA("Segunda-Feira", false) {
		boolean isFimDeSemana() {
			return false;
		}
	},
	TERCA_FEIRA("Terça-Feira", false) {
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUARTA_FEIRA("Quarta-Feira", false) {
		boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA_FEIRA("Quinta-Feira", false) {
		boolean isFimDeSemana() {
			return false;
		}	
	},
	SEXTA_FEIRA("Sexta-Feira", false) {
		boolean isFimDeSemana() {
			return false;
		}
	},
	SABADO("Sábado", true) {
		boolean isFimDeSemana() {
			return true;
		}
	},
	DOMINGO("Domingo", true) {
		boolean isFimDeSemana() {
			return true;
		}
	};
	
	private String nome;
	abstract boolean isFimDeSemana();
	
	private DiaSemanaEnum(String nome, boolean isFimDeSemana) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}