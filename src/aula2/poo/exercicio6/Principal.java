package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		new Principal();
	}
	
	public Principal() {
		
		Pessoa p = new Pessoa();
		p.nome = JOptionPane.showInputDialog("Nome:");
		p.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento:"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		String nomeMaisNovo = p.nome;
		LocalDate dataMaisNovo = p.dataNascimento;
		
		PessoaFisica pf = new PessoaFisica();
		pf.nome = JOptionPane.showInputDialog("Nome:");
		pf.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento:"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		pf.cpf = JOptionPane.showInputDialog("CPF:");
		
		if (dataMaisNovo.isAfter(pf.dataNascimento)) {
			
			JOptionPane.showMessageDialog(null, "Mais Novo: " + nomeMaisNovo + "\n// Data de Nascimento: " 
			+ dataMaisNovo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		
		else {
			
			nomeMaisNovo = pf.nome;
			dataMaisNovo = pf.dataNascimento;
			
			JOptionPane.showMessageDialog(null, "Mais Novo: " + nomeMaisNovo + "\n// Data de Nascimento: " 
			+ dataMaisNovo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " // CPF: " + pf.cpf);
		}
		
	}
}