package aula6.outros;

public class Exercicio2 {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		
		for(Calculadora1Enum c : Calculadora1Enum.values()) {
			int resultado = c.executarOperacao(a, b);
			System.out.println(c.getNome() + ": " + a + " e " + b + " = " + resultado);
			
		}
		
	}
}