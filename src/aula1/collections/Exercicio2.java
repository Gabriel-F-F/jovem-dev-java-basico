package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

//	Faça um programa que crie uma lista com 50 números
//	inteiros aleatórios e depois exiba-os ordenados do
//	maior para o menor
	
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {

		List<Integer> lista = new ArrayList<>();

		Random generator = new Random();

		for (int i = 0; i < 50; i++) {
			lista.add(generator.nextInt(100));
		}
		
		Collections.sort(lista);
		Collections.reverse(lista);
		System.out.println(lista);
	}
}