package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome 1: ");
		String nome = sc.nextLine();
		System.out.println("Telefone 1: ");
		String telefone = sc.nextLine();
		System.out.println("Data de Nascimento 1: ");
		LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Pessoa p1 = new Pessoa(nome, telefone, dataNascimento);

		System.out.println("Nome 2: ");
		String nome2 = sc.nextLine();
		System.out.println("Telefone 2: ");
		String telefone2 = sc.nextLine();
		System.out.println("Data de Nascimento 2: ");
		LocalDate dataNascimento2 = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Pessoa p2 = new Pessoa(nome2, telefone2, dataNascimento2);

		StringBuilder sb = new StringBuilder();

		if (p1.getDataNascimento().isAfter(p2.getDataNascimento())) {
			sb.append(p2.getNome());
			sb.append(", ");
			sb.append(p2.getTelefone());
			sb.append(", ");
			sb.append(p2.getDataNascimento());
			System.out.println(sb.toString());
		} else {
			sb.append(p1.getNome());
			sb.append(", ");
			sb.append(p1.getTelefone());
			sb.append(", ");
			sb.append(p1.getDataNascimento());
			System.out.println(sb.toString());
		}

		sc.close();
	}
}