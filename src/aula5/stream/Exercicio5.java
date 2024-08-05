package aula5.stream;

import java.util.ArrayList;
import java.util.List;
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
		
		System.out.println(list);
		
		try {
			System.out.println(
			list.stream().filter(name -> name.endsWith("berto")).findAny().orElseThrow(ZeroBertoException::new)
			);
		} catch (ZeroBertoException e) {
			e.printStackTrace();
			System.out.println("Não há nenhum Berto!");
		}
	}
}