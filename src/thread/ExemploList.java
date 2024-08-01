package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExemploList {

	public static void main(String[] args) {
		
		new ExemploList();
	}
	
	public ExemploList() {
		
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("aaa1");
		lista.add("aaa2");
		lista.add("aaa3");
		lista.add("aaa4");
		lista.add("aaa5");
		
		lista.forEach((String s) -> {
			System.out.println(s);
		});
		
		String s1 = "ABC";
		String o = Optional.ofNullable(s1).orElseGet(() -> pegaString());
		System.out.println(o);
	}
		private String pegaString() {
			return "DEF";
		}
}