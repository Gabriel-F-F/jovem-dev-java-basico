package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Desafio {

	public static void main(String[] args) {
	
	List<Pessoa> list = new ArrayList<>();
	
	list.add(new Pessoa("João", "(48)91234-5678", LocalDate.of(1998, 04, 10)));
	list.add(new Pessoa("Maria", "(48)91234-5678", LocalDate.of(1997, 05, 19)));
	list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.of(1996, 03, 01)));
	list.add(new Pessoa("Jonas", "(48)91234-5678", LocalDate.of(1995, 10, 05)));
	list.add(new Pessoa("Mikaela", "(48)91234-5678", LocalDate.of(1994, 10, 18)));
	list.add(new Pessoa("Adalberto", "(48)91234-5678", LocalDate.of(1993, 05, 17)));
	list.add(new Pessoa("Ana Carolina", "(48)91234-5678", LocalDate.of(1992, 05, 19)));
	list.add(new Pessoa("Pedro", "(48)91234-5678", LocalDate.of(1991, 10, 07)));
	list.add(new Pessoa("Camile", "(48)91234-5678", LocalDate.of(1990, 06, 16)));
	list.add(new Pessoa("Jonah", "(48)91234-5678", LocalDate.of(1989, 11, 13)));
	
	String resultado = list.stream().filter(r -> r.getDataNascimento().isLeapYear() || comecaVogal(r.getNome()))
			.sorted(Comparator.comparing(Pessoa::getNome).reversed()).map(Pessoa::getNome).collect(Collectors.joining("; "));
	
	System.out.println(resultado);
	}
	
	public static boolean comecaVogal(String vogal) {
		vogal = vogal.toLowerCase();
		return Stream.of("a", "e", "i", "o", "u").anyMatch(vogal::startsWith);
	}
	
}