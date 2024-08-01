package thread;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		new MethodReference();
	}

	public MethodReference() {

		List<String> lista = new ArrayList<String>();

		lista.add("aaa1");
		lista.add("aaa2");
		lista.add("aaa3");
		lista.add("aaa4");
		lista.add("aaa5");

		lista.forEach((String s) -> {
			System.out.println(s);
		});

		lista.forEach(s -> {
			System.out.print(s);
		});

		lista.forEach(System.out::print);

	}
}