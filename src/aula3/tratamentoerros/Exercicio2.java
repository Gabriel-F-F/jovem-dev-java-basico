package aula3.tratamentoerros;

import javax.swing.JOptionPane;
import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	
//	Crie uma função que receba dois números inteiros e divida o primeiro pelo segundo. 
//	Caso o segundo seja zero, dispare uma exceção chamada ZeroException com a mensagem “O segundo número não pode ser zero”.
//	Capture essa exceção e mostre seu conteúdo ao usuário.

	public static void main(String[] args) {
		
		new Exercicio2();
	}
	
	public Exercicio2() {
		
		int numero1 = 0;
		int numero2 = 0;

		try {
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro"));
		
		if (numero2 == 0) {
			throw new ZeroException();
		}
		
		} catch (ZeroException e) {
			JOptionPane.showMessageDialog(null, "Segundo valor é 0");
			e.printStackTrace();
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null, "Valor Inválido!");
		}
		JOptionPane.showMessageDialog(null, "Divisão dos Valores: " + numero1 / numero2);
	}
}