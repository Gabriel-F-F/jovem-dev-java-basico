package avaliacaoRefeita.entidades;

import java.util.Random;

import avaliacao.semana2.excecao.PersonagemDerrotadoException;

public abstract class Personagem {

	protected String nome;
	protected int maxHP;
	protected int hp;
	protected int ataque;
	protected int defesa;

	public Personagem(String nome, int maxHP, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = maxHP;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public boolean batalhar(Personagem heroi, Personagem inimigo) {
		Random dado = new Random();

		do {
			if (heroi.ataque > inimigo.defesa) {
				inimigo.hp -= heroi.ataque + dado.nextInt(7);
				System.out.println(heroi.ataque + " atacou com " + getAtaque() + " de dano!");
				return true;
			} else {
				System.out.println(inimigo.nome + " esquivou!");
				return false;
			}

			if (inimigo.hp > 0) {
				if (inimigo.ataque > heroi.defesa) {
					heroi.hp -= inimigo.ataque + dado.nextInt(7);
					System.out.println(inimigo.nome + " atacou com " + inimigo.ataque + " de dano!");
					return true;
				} else {
					System.out.println(heroi.nome + " esquivou!");
					return false;
				}
			}
		} while (heroi.hp > 0 || inimigo.hp < 0);
	}

	public void atacar(Personagem inimigo) throws PersonagemDerrotadoException {

		if (batalhar(inimigo) == true) {
			if (inimigo.hp <= 0) {
				throw new PersonagemDerrotadoException(getNome(), inimigo.nome);
			}
		} else {
			System.out.println(inimigo + " possui " + hp + " de vida!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
}