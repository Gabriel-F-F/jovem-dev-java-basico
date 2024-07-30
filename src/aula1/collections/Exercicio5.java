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

		do {
			conjunto1.add(generator.nextInt(30));
		} while (conjunto1.size() < 10);
		
		do {
			conjunto2.add(generator.nextInt(30));
		} while (conjunto2.size() < 10);
		
		System.out.println(conjunto1);
		System.out.println(conjunto2);
		
		Set<Integer> conjuntoFinal = new HashSet<Integer>();
		
		for(Integer contagem : conjunto2) {
			if (conjunto1.contains(contagem)) {
				conjuntoFinal.add(contagem);
			}
		}
		
		System.out.println("Contagem Final: " + conjuntoFinal);
		
	}
}