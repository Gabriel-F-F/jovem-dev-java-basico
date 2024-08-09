package avaliacao.semana2.entidades.inimigos;

import avaliacao.semana2.entidades.Personagem;

public class Zumbi extends Personagem {

	public Zumbi(String nome, int maxHP, int hp, int ataque, int defesa) {
		super(nome, maxHP, hp, ataque, defesa);
	}

	public String toString() {
		return "Inimgo: " + nome + ", Vida Máxima: " + maxHP + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}
