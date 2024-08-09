package avaliacao.semana2.aplicacao;

import avaliacao.semana2.entidades.Personagem;
import avaliacao.semana2.entidades.herois.Barbaro;
import avaliacao.semana2.entidades.herois.Mago;
import avaliacao.semana2.entidades.herois.Paladino;
import avaliacao.semana2.entidades.inimigos.Arok_Mestre_Supremo;
import avaliacao.semana2.entidades.inimigos.Morcego;
import avaliacao.semana2.entidades.inimigos.Urso;
import avaliacao.semana2.entidades.inimigos.Vampiro;
import avaliacao.semana2.entidades.inimigos.Zumbi;
import avaliacao.semana2.excecao.PersonagemDerrotadoException;

public class Main {

	public static void main(String[] args) throws PersonagemDerrotadoException {

		// Heróis instanciados com seus respectivos atributos
		Mago mago = new Mago("Mago", 30, 30, 23, 18);
		Barbaro barbaro = new Barbaro("Bárbaro", 100, 100, 20, 8);
		Paladino paladino = new Paladino("Paladino", 50, 50, 20, 19);
		
		// Inimigos instanciados com seus respectivos atributos
		Morcego morcego = new Morcego("Morcego", 10, 10, 5, 5);
		Zumbi zumbi = new Zumbi("Zumbi", 22, 22, 6, 6);
		Urso urso = new Urso("Urso", 30, 30, 8, 9);
		Vampiro vampiro = new Vampiro("Vampiro", 35, 35, 10, 10);
		Arok_Mestre_Supremo arok = new Arok_Mestre_Supremo("Arok, Mestre Sumpremo", 50, 50, 20, 20);
		
		System.out.println(("***** Bem-Vindo à Against the Darkness *****"));
		System.out.println("\n>>>Jornada do Mago:\n");
		Personagem.sequenciaBatalhas(mago, morcego, zumbi, urso, vampiro, arok);
		System.out.println("\n>>>Jornada do Bárbaro:\n");
		Personagem.sequenciaBatalhas(barbaro, morcego, zumbi, urso, vampiro, arok);
		System.out.println("\n>>>Jornada do Paladino:\n");
		Personagem.sequenciaBatalhas(paladino, morcego, zumbi, urso, vampiro, arok);
	}
}