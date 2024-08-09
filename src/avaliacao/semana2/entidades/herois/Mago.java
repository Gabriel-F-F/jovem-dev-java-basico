package avaliacao.semana2.entidades.herois;

import avaliacao.semana2.entidades.Personagem;

public class Mago extends Personagem {

	public Mago(String nome, int maxHP, int hp, int ataque, int defesa) {
		super(nome, maxHP, hp, ataque, defesa);
	}
	
	public String toString() {
		return "Herói: " + nome + ", Vida Máxima: " + maxHP + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}