package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		new Principal();
	}

	public Principal() {
		
		String listar = "";
		
		for(int i = 0; i < 3; i++) {
		Carro c = new Carro();
		c.modelo = JOptionPane.showInputDialog("Modelo do Carro:");
		c.ano = JOptionPane.showInputDialog("Ano do Carro:");
		c.cor = JOptionPane.showInputDialog("Cor do Carro:");
		listar += "Modelo: " + c.modelo + " " + "Ano: " + c.ano + " " + "Cor: " + c.cor + "\n";
		
		}
		
		JOptionPane.showMessageDialog(null, listar);
	}
}