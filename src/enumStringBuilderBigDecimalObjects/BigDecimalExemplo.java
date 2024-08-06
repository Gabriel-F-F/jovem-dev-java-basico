package enumStringBuilderBigDecimalObjects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExemplo {

	public static void main(String[] args) {
		
		// Processadores são bons para somar números com ponto flutuante
		double d = 0.1 + 0.2;
		System.out.println(d);
		
		new BigDecimalExemplo();
	}
	
	public BigDecimalExemplo() {
		
		// BigDecimal serve justamente para somar, valueOf transforma o valor no valor "errado" que o computador consegue ler e somar
		BigDecimal b1 = BigDecimal.valueOf(0.1);
		BigDecimal b2 = BigDecimal.valueOf(0.2);
		System.out.println(b1.add(b2));
		
		
		// BigDecimal para elevar 100 a 200
		System.out.println();
		System.out.println(Math.pow(100, 200));
		System.out.println();
		BigDecimal b3 = BigDecimal.valueOf(100);
		System.out.println(b3.pow(200));
		
		// BigDecimal para dividir números que dão uma dizima
		System.out.println();
		BigDecimal b4 = BigDecimal.valueOf(2);
		BigDecimal b5 = BigDecimal.valueOf(3);
	    // System.out.println(b4.divide(b5)); -> dará erro por conta de ser uma dizima, ultrapassando o limite da string
		System.out.println(b4.divide(b5, 10, RoundingMode.HALF_EVEN));
		
		// Soma com BigDecimal, é necessario jogar o valor da soma em outra variavel
		System.out.println();
		BigDecimal b6 = BigDecimal.valueOf(2);
		BigDecimal b7 = BigDecimal.valueOf(6);
		b6.add(b7);
		System.out.println(b6);
		b6 = b6.add(b7);
		System.out.println(b6);
	}
}