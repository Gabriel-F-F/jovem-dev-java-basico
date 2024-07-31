package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio3 {

//	Crie um programa que dispare as seguintes exceções:
//		○ ArithmeticException
//		○ NullPointerException
//		○ StringIndexOutOfBoundsException
//		○ IllegalStateException

//		Utilize o try-catch parar capturar a exceção e mostre-a usando printStackTrace().
//		Não é permitido disparar a exceção via inicialização (throw new NullPointerException(), por exemplo).
	
	public static void main(String[] args) {
		
		new Exercicio3();
	}
	
	public Exercicio3() {
		
		// ARITHMETIC EXCEPTION
		
		try {

		int divisao = 10 / 0;
		
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// NULL POINTER EXCEPTION
		
		try {

		int soma = 10 + (Integer)null;
		
		} catch (NullPointerException e) {
			System.out.println();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// STRING INDEX OUT OF BOUNDS EXCEPTION
		
		try {
			
		String nome = "Pedro";
		
		nome.substring(6, 8);
		
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println();
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		// Illegal State Exception
		
		try {
		
		List<String> letras = new ArrayList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");
		
		Iterator<String> it = letras.iterator();
		it.remove();
		
		} catch (IllegalStateException e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}