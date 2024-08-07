package aula5.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {

	private List<String> lista;
	private static Exercicio5 exercicio;
	
	@BeforeAll
	static void init() {
		exercicio = new Exercicio5();
	}
	
	@BeforeEach
	void setup() {
		lista = new ArrayList<>();		
	}
	
	@DisplayName("Se houver mais de um nome terminado em Berto, retornar o primeiro")
	@Test
	void buscaPrimeiroNomeTerminadoEmBerto() {

		lista.add("João");
		lista.add("Berto");
		lista.add("Alberto");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(lista);
		
		assertEquals("Alberto", retorno);
	}
	
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeListaVazia() {
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(lista));
	}
	
	@DisplayName("Se houve um elemento nulo e houver um Berto, deve trazer o Berto")
	@Test
	void deveTrazerNomeMesmoComElementoNulo() {
		
		lista.add(null);
		lista.add("Carlos");
		lista.add("Alberto");
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(lista);
		
		assertEquals("Alberto", retorno);
	}
	
	@DisplayName("Se não houver um berto na lista, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeNaoHouverBerto() {

		lista.add("João");
		lista.add("Carlos");
		lista.add("Pedro");
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(lista));
	}
}