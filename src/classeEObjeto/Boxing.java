package classeEObjeto;

import java.util.ArrayList;
import java.util.List;

public class Boxing {

	public static void main(String[] args) {
	
		List<Integer> listaInt = new ArrayList<>(); // Classe Wrapper // Integer -> int
		List<Double> listaDouble = new ArrayList<>(); // Classe Wrapper // Double -> double
		List<Character> listaChar = new ArrayList<>(); // Classe Wrapper // Character -> char
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);  // Ocupam o mesmo local de memória String
		
		
		String s3 = "abc";
		String s4 = new String("abc");
		System.out.println(s3 == s4);  // Força a alocar em espaços de memórias diferentes
		System.out.println(s3.equals(s4));  // verifica a posição e ordem da String de verificação
		
		
		String s5 = null;
		String s6 = new String("abc");
		System.out.println(s5.equals(s6));  //cuidado a vericar valores nulos
		
	}
}