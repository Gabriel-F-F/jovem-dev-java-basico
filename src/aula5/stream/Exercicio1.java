package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

//	Faça um programa que cria uma lista com 50 números
//	aleatórios de 1 a 100 e imprime a soma de todos os números
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		Random generator = new Random();
		
		for(int i = 0; i < 50; i++) {
			list.add(generator.nextInt(100));
		}
		
		int soma = list.stream().reduce(0, (valor1, valor2) -> valor1 + valor2);
		System.out.println(soma);
	}
}