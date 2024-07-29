package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		new Exercicio3();
	}

	public Exercicio3() {

		List<Integer> lista = new ArrayList<>();

		Random generator = new Random();

		for (int i = 0; i < 50; i++) {
			lista.add(generator.nextInt(20));
		}
		
		Collections.sort(lista);
		
		System.out.println(lista);
	}

}