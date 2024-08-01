package thread;

import java.util.ArrayList;
import java.util.List;

public class ExemploPredicate {

	public static void main(String[] args) {

		new ExemploPredicate();
	}

	public ExemploPredicate() { 
		
//		Predicate<T>
//		Recebe argumento T e retorna true ou false

		List<String> lista = new ArrayList<String>();

		lista.add("aaa1");
		lista.add("aaa2");
		lista.add("aaa3");
		lista.add("aaa4");
		lista.add("aaa5");

		lista.forEach((String s) -> {
			System.out.println(s);
		});

		lista.removeIf((String s) -> {
			return s.contains("3");
		});
	}
}