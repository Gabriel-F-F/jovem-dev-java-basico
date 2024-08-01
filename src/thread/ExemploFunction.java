package thread;

import java.util.ArrayList;
import java.util.List;

public class ExemploFunction {

	public static void main(String[] args) {

		new ExemploFunction();
	}

	public ExemploFunction() {

		List<String> lista = new ArrayList<String>();

		lista.add("aaa1");
		lista.add("aaa2");
		lista.add("aaa3");
		lista.add("aaa4");
		lista.add("aaa5");

		lista.forEach((String s) -> {
			System.out.println(s);
		});

		lista.stream().map(s -> s.toUpperCase()).forEach(System.out::println); //map() é uma função que recebe um argumento e retorna outra
	}
}
