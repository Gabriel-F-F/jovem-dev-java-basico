package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Exercicio4 {

	public static void main(String[] args) {
		
		List<Pessoa> list = new ArrayList<>();
		
		list.add(new Pessoa("João", "(48)91234-5678", LocalDate.of(2004, 04, 10)));
		list.add(new Pessoa("Maria", "(48)91234-5678", LocalDate.of(2006, 05, 19)));
		list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.of(2002, 03, 01)));
		list.add(new Pessoa("Jonas", "(48)91234-5678", LocalDate.of(2006, 10, 05)));
		list.add(new Pessoa("Mikaela", "(48)91234-5678", LocalDate.of(2005, 10, 18)));
		list.add(new Pessoa("Adalberto", "(48)91234-5678", LocalDate.of(2004, 05, 17)));
		list.add(new Pessoa("Ana Carolina", "(48)91234-5678", LocalDate.of(2004, 05, 19)));
		list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.of(2009, 10, 07)));
		list.add(new Pessoa("Camile", "(48)91234-5678", LocalDate.of(2006, 06, 16)));
		list.add(new Pessoa("Jonah", "(48)91234-5678", LocalDate.of(2005, 11, 13)));
	
		list.stream().filter(date -> date.getDataNascimento().getMonth() == Month.MAY).sorted(Comparator.comparing(Pessoa::getNome)).forEach(System.out::print);
	}		
}