package aula5.stream;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {
		
		List<Pessoa> list = new ArrayList<>();
		
		list.add(new Pessoa("João", "(48)91234-5678", LocalDate.parse("05/10/2004", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Maria", "(48)91234-5678", LocalDate.parse("05/19/2006", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.parse("03/01/2002", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Jonas", "(48)91234-5678", LocalDate.parse("05/09/2006", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Mikaela", "(48)91234-5678", LocalDate.parse("05/08/2005", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Adalberto", "(48)91234-5678", LocalDate.parse("05/17/2004", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Ana Carolina", "(48)91234-5678", LocalDate.parse("05/19/2004", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.parse("07/10/2009", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Camile", "(48)91234-5678", LocalDate.parse("06/16/2006", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
		list.add(new Pessoa("Jonah", "(48)91234-5678", LocalDate.parse("11/13/2005", DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
	
		list.stream().filter(date -> date.dataNascimento.equals("05")).sorted().forEach(System.out::print);
	}		
}