package aula2.poo.exercicio8;

import javax.swing.JOptionPane;

public class Principal extends Automovel{

	public static void main(String[] args) {
		
		new Principal();
	}
	
	public Principal() {
		
		Automovel a = new Automovel();
		
		a.nome = JOptionPane.showInputDialog("Nome do Automóvel:");
		a.cor = JOptionPane.showInputDialog("Cor do Automóvel:");
		a.velocidade = Integer.parseInt(JOptionPane.showInputDialog("Velocidade do Automóvel:"));
		
		JOptionPane.showMessageDialog(null, "Nome: " + a.nome + "\nCor: " + a.cor + "\nVelocidade: " + a.velocidade + "Km/H");
		a.acelerar();
	}
}