package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

//	Crie uma lista com 5 alunos e, em seguida, remova da lista
//	todos os alunos cujo nome começa com a letra T e termine com a letra O.
	
	public static void main(String[] args) {
		
		new Exercicio3();
	}
	
	public Exercicio3() {
		
		List<String> lista = new ArrayList<String>();
		
		String a = "João";
		lista.add(a);
		String b = "Maria";
		lista.add(b);
		String c = "Teodoro";
		lista.add(c);
		String d = "Carlos";
		lista.add(d);
		String e = "Pitolomeo";
		lista.add(e);
		
		System.out.println(lista);

		lista.removeIf(a1 -> a1.startsWith("T"));
		lista.removeIf(a1 -> a1.endsWith("o"));
		
		System.out.println(lista);
	}
}