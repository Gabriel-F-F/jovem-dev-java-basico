package avaliacao.semana2.entidades.herois;

import avaliacao.semana2.entidades.Personagem;

public class Paladino extends Personagem {

	public Paladino(String nome, int maxHP, int hp, int ataque, int defesa) {
		super(nome, maxHP, hp, ataque, defesa);
	}

	public String toString() {
		return "Herói: " + nome + ", Vida Máxima: " + maxHP + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}