package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		new Principal();
	}

	public Principal() {
		
		Pessoa p1 = new Pessoa();
		p1.nome = JOptionPane.showInputDialog("Nome:");
		p1.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento:"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		String nomeMaisVelho = p1.nome;
		LocalDate dataMaisVelho = p1.dataNascimento; 
				
		Pessoa p2 = new Pessoa();
		p2.nome = JOptionPane.showInputDialog("Nome:");
		p2.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento:"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		if (dataMaisVelho.isBefore(p2.dataNascimento)) {
			
			int idade = LocalDate.now().getYear() - dataMaisVelho.getYear();
			
			JOptionPane.showMessageDialog(null, "Mais Velho:\n" + nomeMaisVelho + " com " + idade + " anos!");
		}
		
		else {
			nomeMaisVelho = p2.nome;
			dataMaisVelho = p2.dataNascimento;
			
			int idade =  LocalDate.now().getYear() - dataMaisVelho.getYear();
			
			JOptionPane.showMessageDialog(null, "Mais Velho:\n" + nomeMaisVelho + " com " + idade + " anos!");
		}

	}
}