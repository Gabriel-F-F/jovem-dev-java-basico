package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a Circumferência de um Círculo: ");
		BigDecimal circumferencia = new BigDecimal(sc.nextInt());
		
		BigDecimal PI = new BigDecimal(Math.PI);
		BigDecimal raio = circumferencia.divide(BigDecimal.valueOf(2).multiply(PI), 4, RoundingMode.HALF_EVEN);
		System.out.println("Raio do Círculo = " + raio);
		
	}
}