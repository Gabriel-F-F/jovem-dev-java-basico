package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

//	Faça um programa que peça para o usuário digitar um número inteiro. 
//	Se ele digitar algo diferente disso, exiba a mensagem "Você digitou um valor não reconhecido", 
//	até que ele digite um valor válido. Em seguida, mostre esse valor.
	
	public static void main(String[] args) {

		new Exercicio1();
	}

	public Exercicio1() {

		int inteiro = 0;
		boolean inteiroConfirma = false;

		do {
		try {
			inteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
			if (inteiro == (int)inteiro) {
				inteiroConfirma = true;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Você digitou um valor inválido!");
			} 
		} while (inteiroConfirma == false);
	}
}