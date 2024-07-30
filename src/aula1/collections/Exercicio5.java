package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

//	Crie dois sets com 10 números aleatórios entre 1 e 30.
//	Mostre os dois conjuntos e, em seguida, mostre apenas
//	os elementos que estiverem presentes em ambos os
//	conjuntos.

	public static void main(String[] args) {
		new Exercicio5();
	}

	public Exercicio5() {

		Set<Integer> conjunto1 = new HashSet<>();

		Set<Integer> conjunto2 = new HashSet<>();

		Random generator = new Random();

		for (int i = 0; i < 10; i++) {
			conjunto1.add(generator.nextInt(30));
		}

		for (int i = 0; i < 10; i++) {
			conjunto2.add(generator.nextInt(30));
		}
		
		System.out.println(conjunto1);
		System.out.println(conjunto2);
	}
}