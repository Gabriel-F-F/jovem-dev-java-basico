package collections;

import java.util.ArrayList;
import java.util.List;

public class IntroducaoList { //Está no Java 1.8

	public static void main(String[] args) {
		new IntroducaoList();
	}

	public IntroducaoList() {

		List<String> lista = new ArrayList<>();		//list -> um vetor de ordem crescente 0, 1, 2, 3

		lista.add("Elemento 1");
		lista.add("Elemento 2");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		lista.remove(0);
		lista.remove("Elemento 2");			//Quando um elemento é excluido da lista, os subsequentes passam a substitui-lo
											//0- elemento1, 1- elemento2 /remove.(0)/ -> 0- elemento2
		
		System.out.println(lista.isEmpty());
	}
	
	//diferença entre list e set -> set: não possui ordem e não possui objetos repetidos

}