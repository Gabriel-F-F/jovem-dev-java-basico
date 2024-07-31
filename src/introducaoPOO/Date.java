package introducaoPOO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();		//apenas permite funções utilitarias da classe LocalDate
		System.out.println(ld);				//ela nao depende que exista um objeto do tipo LocalDate
											//na propria classe LocalDate, ela ja instancia o objeto
		
		LocalDate ld1 = LocalDate.of(1984, 6, 28);
		System.out.println(ld1);
		
		LocalDate ld2 = LocalDate.parse("1999-05-13");
		System.out.println(ld2);
		System.out.println();
		
//		LocalDate ld3 = LocalDate.parse("13/05/2004");	//segue o formato americano, por isso da erro
		LocalDate ld3 = LocalDate.parse("13/05/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));	//lembrando mm = minutes // MM = months
		System.out.println(ld3);
		System.out.println(ld3.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));	//formatação do print da data
		
		
		System.out.println();
		System.out.println("Mais 300 Dias");
		System.out.println(ld.plusDays(300)); //Já leva em base meses com 28, 31 dias
		System.out.println("Menos 300 Dias");
		System.out.println(ld.minusDays(300)); //Já leva em base meses com 28, 31 dias
		
		
		System.out.println();
		System.out.println("LocalDateTime");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
}