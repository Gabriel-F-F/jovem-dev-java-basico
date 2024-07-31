package collections;

import java.util.HashSet;
import java.util.Set;

public class IntroducaoSet {

	public static void main(String[] args) {
		new IntroducaoSet();
	}

	public IntroducaoSet() {

		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("Elemento 1");
		conjunto.add("Elemento 2");
		conjunto.add("Elemento 3");
		conjunto.add("Elemento 1");  //ele não adiciona ou sobrescreve objetos iguais

		System.out.println(conjunto.size());
		
		conjunto.remove("Elemento 1");
		
		System.out.println(conjunto.size());
	}
	
	//diferença entre list e set -> set: não possui ordem e não possui objetos repetidos

}