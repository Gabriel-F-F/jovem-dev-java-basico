package avaliacao.semana2.entidades.inimigos;

import avaliacao.semana2.entidades.Personagem;

public class Arok_Mestre_Supremo extends Personagem{

	public Arok_Mestre_Supremo(String nome, int maxHP, int hp, int ataque, int defesa) {
		super(nome, maxHP, hp, ataque, defesa);
	}

	public String toString() {
		return "Chefão: " + nome + ", Vida Máxima: " + maxHP + ", Ataque: " + ataque + ", Defesa: " + defesa;
	}
}