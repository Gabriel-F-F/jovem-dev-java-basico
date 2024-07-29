package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		new Exercicio4();
	}

	public Exercicio4() {

		Map<Integer, Character> mapa = new HashMap<>();

		String palavra = JOptionPane.showInputDialog("Digite uma Frase:");
		
		for(int i = 0; i < palavra.length(); i++){
			mapa.put(i, palavra.charAt(i));
		}
		
		
		
		System.out.println(mapa);
		
	}
}
