package aula7.testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Desafio;
import aula5.stream.Pessoa;

class Exercicio1Test {

	@DisplayName("lista vazia, deverá retornar NullPointerException")
	@Test
	void listaVazia() {
		List<Pessoa> list = null;
		Desafio desafio = new Desafio();
		
		assertThrows(NullPointerException.class, () -> desafio.resultado(list));
	}
	
	@DisplayName("Será realizado o teste com uma lista com elementos")
	@Test
	void listaComElementos() {
		List<Pessoa> list = new ArrayList<>();
		list.add(new Pessoa("João", "(48)91234-5678", LocalDate.of(1998, 04, 10)));
		list.add(new Pessoa("Maria", "(48)91234-5678", LocalDate.of(1997, 05, 19)));
		list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.of(1996, 03, 01)));
		Desafio desafio = new Desafio();
		
		String retorno = desafio.resultado(list);
		
		assertEquals("Pedro", retorno);
	}
}