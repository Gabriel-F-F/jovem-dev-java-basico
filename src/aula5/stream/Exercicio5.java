package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("João");
		list.add("Berto");
		list.add("Alberto");
		list.add("Jonas");
		list.add("Camile");
		list.add("Rodrigo");
		list.add("Alberto");
		list.add("Adamastor");
		list.add("Carlos");
		list.add("Joelma");

		System.out.println(new Exercicio5().buscaPrimeiroNomeTerminadoEmBerto(list));
	}

	public String buscaPrimeiroNomeTerminadoEmBerto(List<String> lista) {
		return lista.stream().filter(Objects::nonNull).filter(name -> name.endsWith("berto")).findFirst().orElseThrow(() -> new ZeroBertoException("Não há nenhum Berto!"));

	}
}
