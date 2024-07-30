package aula1.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		new Exercicio4();
	}

	public Exercicio4() {

//		Faça um programa que peça para o usuário digitar
//		uma frase. Em seguida, mostre a quantidade de vezes
//		que cada caractere aparece na frase. Utilize a coleção
//		HashMap para esta tarefa.
		
		Map<Integer, Character> mapa = new HashMap<>();

		String palavra = JOptionPane.showInputDialog("Digite uma Frase:");
		
		for(int i = 0; i < palavra.length(); i++) {
			mapa.put(i, palavra.charAt(i));
		}
		
		System.out.println(Collections.frequency(mapa.values(), "a"));
	}
}
