package avaliacao.semana2.entidades.inimigos;

import avaliacao.semana2.entidades.Personagem;

public class Urso extends Personagem {

	public Urso(String nome, int maxHP, int hp, int ataque, int defesa) {
		super(nome, maxHP, hp, ataque, defesa);
	}
	
	public String toStringHeroi() {
		return "Inimigo: " + nome + ", Vida Máxima: " + maxHP + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}
