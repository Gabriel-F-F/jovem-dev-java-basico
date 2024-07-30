package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		new Exercicio1();
	}
	
	public Exercicio1() {
		
	double real = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número Real:"));
	
	JOptionPane.showMessageDialog(null, (int) real);

	}
}