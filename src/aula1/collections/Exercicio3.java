package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {

		new Exercicio3();
	}

	public Exercicio3() {

		List<Integer> lista = new ArrayList<>();
		Set<Integer> listaSemRepeticoes = new HashSet<>();
		
		Random generator = new Random(); 
		
		lista.add(0, generator.nextInt(20));
		lista.add(1, generator.nextInt(20));
		lista.add(2, generator.nextInt(20));
		lista.add(3, generator.nextInt(20));
		lista.add(4, generator.nextInt(20));
		lista.add(5, generator.nextInt(20));
		lista.add(6, generator.nextInt(20));
		lista.add(7, generator.nextInt(20));
		lista.add(8, generator.nextInt(20));
		lista.add(9, generator.nextInt(20));
		
		lista.addAll(lista);
		lista.addAll(lista);
		lista.addAll(lista);
		lista.addAll(lista);
		lista.addAll(lista);
		
		listaSemRepeticoes.addAll(lista);
		
		System.out.println(listaSemRepeticoes);
	}

}