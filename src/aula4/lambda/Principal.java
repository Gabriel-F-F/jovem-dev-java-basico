package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

//	Crie uma classe chamada Aluno, com numeroChamada, nome e dataNascimento. 
//	Em seguida, na classe Principal, crie uma lista com 5 alunos e, 
//	em seguida, utilize Comparator.comparing para ordenar os alunos por data de nascimento. 
//	Mostre a lista ordenada.

	public static void main(String[] args) {

		new Principal();
	}

	public Principal() {

		List<Aluno> alunos = new ArrayList<Aluno>();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < 5; i++) {
			Aluno a = new Aluno();
			a.numeroChamada = Integer.parseInt(JOptionPane.showInputDialog("Número Chamada: "));
			a.nome = JOptionPane.showInputDialog("Nome do Aluno: ");
			a.dataNascimento = LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento: (dd/MM/yyyy)"), formatter);

			alunos.add(a);
		}
		alunos.sort(Comparator.comparing(Aluno::getDataNascimento));

		alunos.forEach(n -> {
			System.out.println(n);
		});
	}
}