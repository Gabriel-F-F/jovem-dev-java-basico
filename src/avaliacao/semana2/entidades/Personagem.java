package avaliacao.semana2.entidades;

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

	// fiquei tão vidrado nessa função que ela ficou gigante e esqueci do outro método atacar...
	
	public static void batalhar(Personagem a, Personagem b) {

		Random generator = new Random();

			int dado = generator.nextInt(6);
			a.ataque += dado;
			if (a.ataque <= b.defesa) {
				System.out.println(a.nome + " tentou atacar " + b.nome + " com " + a.ataque + " de dano!\n" + "Mas " + b.nome + " se esquivou...");
				a.ataque -= dado;
			} else {
				System.out.println(a.nome + " atacou " + b.nome + " com " + a.ataque + " de dano!");
				b.hp -= a.ataque;
				a.ataque -= dado;
			}
			if (b.hp > 0) {
				dado = generator.nextInt(6);
				b.ataque += dado;
				if (b.ataque <= a.defesa) {
					System.out.println(b.nome + " tentou atacar " + a.nome + " com " + b.ataque + " de dano!\n" + "Mas " + a.nome + " se esquivou!");
					a.ataque -= dado;
				} else {
					System.out.println(b.nome + " atacou " + a.nome + " com " + b.ataque + " de dano!");
					a.hp -= b.ataque;
					b.ataque -= dado;
				}
			}
	}

	public static int verificaMorte(Personagem a, Personagem b) throws PersonagemDerrotadoException {
		
		if (a.hp <= 0) {
			System.out.println(a.nome + " morreu.");
		}
		if (b.hp <= 0) {
			System.out.println(b.nome + " morreu.");
		}
		if (a.hp > 0) {
			System.out.println(a.nome + " possui " + a.hp + " pontos de vida.");
		}
		if (b.hp > 0) {
			System.out.println(b.nome + " possui " + b.hp + " pontos de vida.");
		}
		return a.hp;
	} 

	public static void sequenciaBatalhas(Personagem heroi, Personagem morcego, Personagem zumbi, Personagem urso,
			Personagem vampiro, Personagem arok) throws PersonagemDerrotadoException {

		batalhar(heroi, morcego);
		verificaMorte(heroi, morcego);
		batalhar(heroi, zumbi);
		verificaMorte(heroi, zumbi);
		batalhar(heroi, urso);
		verificaMorte(heroi, urso);
		batalhar(heroi, vampiro);
		verificaMorte(heroi, vampiro);
		batalhar(heroi, arok);
		verificaMorte(heroi, arok);
	}
}