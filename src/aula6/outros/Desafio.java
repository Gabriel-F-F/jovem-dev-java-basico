package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Descrição Evento 1: ");
		String desc1 = sc.nextLine();
		System.out.print("Data Evento 1: ");
		LocalDateTime data1 = LocalDateTime.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.print("Tipo do Evento 1: \n1- SOCIAL\n2-LAZER\n3- PROFISSIONAL\n4- OUTROS");
		int tipo1 = sc.nextInt();
		Evento e1 = new Evento(desc1, data1, tipo1);
		
		
	}
}