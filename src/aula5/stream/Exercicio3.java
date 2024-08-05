package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Random generator = new Random();
		for(int i = 0; i < 50; i++) {
			list.add(generator.nextInt(100));
		}
		
		long sum = list.stream().filter(numero -> numero.equals(25)).count();
		
		System.out.println(list);
		System.out.println(sum);
	}
}