package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class NotaFiscal {

	String emitente;
	double valor;

	public double calculaValor(double valor) {

		double desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto em %"));
		
		return valor - valor * (desconto / 100);

	}
}