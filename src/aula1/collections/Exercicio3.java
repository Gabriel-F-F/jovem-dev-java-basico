package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

//	Faça um programa que crie uma lista com 50 números
//	inteiros com valor máximo 20. Mostre a lista e, em
//	seguida, mostre apenas os números contidos na lista,
//	sem repetição. Não utilize nenhuma estrutura de
//	repetição para fazer essa tarefa.

	
	public static void main(String[] args) {

		new Exercicio3();
	}

	public Exercicio3() {

		List<Integer> lista = new ArrayList<>();
		Set<Integer> listaSemRepeticoes = new HashSet<>();
		
		Random generator = new Random(); 
		
		for(int i = 0; i < 50; i++) {
			lista.add(generator.nextInt(20));
		}
		
		Collections.sort(lista);
		
		listaSemRepeticoes.addAll(lista);

		System.out.println(listaSemRepeticoes);
	}

}