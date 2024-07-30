package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		new Principal();
	}

	public Principal() {

		NotaFiscal n1 = new NotaFiscal();
		n1.emitente = JOptionPane.showInputDialog("Nome do Emitente:");
		n1.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da Compra:"));
		
		JOptionPane.showMessageDialog(null, n1.emitente + " R$" + n1.calculaValor(n1.valor));
		
		NotaFiscal n2 = new NotaFiscal();
		n2.emitente = JOptionPane.showInputDialog("Nome do Emitente:");
		n2.valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da Compra:"));
		
		JOptionPane.showMessageDialog(null, n2.emitente + " R$" + n2.calculaValor(n2.valor));
	}
}