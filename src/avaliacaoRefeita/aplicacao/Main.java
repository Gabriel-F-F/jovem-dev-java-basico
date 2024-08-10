package avaliacaoRefeita.aplicacao;

import java.util.ArrayList;
import java.util.List;

import avaliacaoRefeita.entidades.Arok;
import avaliacaoRefeita.entidades.Barbaro;
import avaliacaoRefeita.entidades.Mago;
import avaliacaoRefeita.entidades.Morcego;
import avaliacaoRefeita.entidades.Paladino;
import avaliacaoRefeita.entidades.Personagem;
import avaliacaoRefeita.entidades.Urso;
import avaliacaoRefeita.entidades.Vampiro;
import avaliacaoRefeita.entidades.Zumbi;

public class Main {

	public static void main(String[] args) {
		
		List<Personagem> herois = new ArrayList<>();
		herois.add(new Mago("Mago", 30, 30, 18, 23));
		herois.add(new Barbaro("Bárbaro", 100, 100, 20, 18));
		herois.add(new Paladino("Paladino", 50, 50, 20, 19));
		List<Personagem> inimigos = new ArrayList<>();
		inimigos.add(new Morcego("Morcego", 10, 10, 5, 5));
		inimigos.add(new Zumbi("Zumbi", 22, 22, 6, 6));
		inimigos.add(new Urso("Urso", 30, 30, 8, 9));
		inimigos.add(new Vampiro("Vampiro", 35, 35, 10, 10));
		inimigos.add(new Arok("Arok, Mestre Supremo", 50, 50, 20, 20));
		
		
	}
}