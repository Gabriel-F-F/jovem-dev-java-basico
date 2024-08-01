package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

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
		
		for(int i = 0; i < 2; i++) {
		Aluno a = new Aluno();
		a.numeroChamada = Integer.parseInt(JOptionPane.showInputDialog("Número Chamada: " + (i + 1)));
		a.nome = JOptionPane.showInputDialog("Nome do Aluno: " + (i + 1));
		a.dataNascimento = Date.valueOf(JOptionPane.showInputDialog("Data de Nascimento: " + (i + 1)));
		alunos.add(a);
		}
		
		System.out.println(alunos);
		
		alunos.sort(Comparator.comparing(Aluno::dataNascimento));
		

		System.out.println(alunos);
	}
}