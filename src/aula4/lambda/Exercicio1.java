package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

//	Faça um programa que preencha uma lista com 50 números aleatórios. 
//	A seguir, mostre essa lista usando o método forEach
	
	public static void main(String[] args) {

		new Exercicio1();
	}

	public Exercicio1() {

		List<Integer> lista = new ArrayList<Integer>();

		Random generator = new Random();

		for (int i = 0; i < 50; i++) {
			lista.add(generator.nextInt(100));
		}

		lista.forEach(n -> {
			System.out.println(n);
		});
	}
}