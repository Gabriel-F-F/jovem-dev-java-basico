package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

//	Crie uma interface funcional chamada Mostrador, que deve conter um
//	método chamado mostra que recebe uma string
//	Na sua classe principal, crie uma lista com 5 strings. Implemente a
//	interface funcional Mostrador para que ela exiba uma string em
//	maiúsculas. Utilize o forEach da lista para chamar essa função.
	
	public static void main(String[] args) {
		
		new Desafio();
	}
	
	public Desafio() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("joão");
		list.add("pedro");
		list.add("jorge");
		list.add("maria");
		list.add("pitolomeu");
		
		System.out.println(list);
		
		list.forEach(l -> {
		System.out.println(Mostrador.mostrar(l).toUpperCase());
		});
	}
}