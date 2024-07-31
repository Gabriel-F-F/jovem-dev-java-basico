package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		new Exercicio2();
	}
	
	public Exercicio2() {
		
		String frase1 = JOptionPane.showInputDialog("Digite uma Frase:");
		String frase2 = JOptionPane.showInputDialog("Digite outra Frase:");
		
		if (frase1.equals(frase2)) {
			JOptionPane.showMessageDialog(null, "Ambas as frases são iguais!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Frases Diferentes!");
		}
		
		JOptionPane.showMessageDialog(null, "Tamanho da 1ª Frase: " + frase1.length() + "\nTamanho da 2ª Frase: " + frase2.length());
	}
}