package aula1.collections;

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
		
		Map<Character, Integer> mapa = new HashMap<>();

		String palavra = JOptionPane.showInputDialog("Digite uma Frase:");
		
		for(char caractere : palavra.toCharArray()) {
			if(mapa.containsKey(caractere)) {
				mapa.put(caractere, mapa.get(caractere) + 1);
			}
			else {
				mapa.put(caractere, 1);	
			}
		}
		
		for(Map.Entry<Character, Integer> entrada : mapa.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
	}
}
