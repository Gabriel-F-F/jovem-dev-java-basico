package streamAndOptional;

import java.time.LocalDateTime;
import java.util.Optional;

public class OptionalTeste {

	public static void main(String[] args) {

//		● Evitar NullPointerException
//		● Fim das verificações de null
//		● Legibilidade

		new OptionalTeste();
	}

	public OptionalTeste() {
		String s = getString();

		Optional<String> opt = Optional.ofNullable(s);

		//orElse(T)
		
		System.out.println(opt.orElse("Não Encontrou!"));

//		if (s != null) {
//		System.out.println(s.toUpperCase());
//	} else {
//		System.out.println("Não retornou valor");
//	}

		//orElseGet(Supplier<T>)
		System.out.println(opt.orElseGet(() -> "Não encontrou")); // orElseGet(Supplier<T>), espera um String
		System.out.println(opt.orElse(getStringAlternativo()));	// o orElse Só será chamado caso o opt for null
		System.out.println(opt.orElseGet(() -> getStringAlternativo())); 

		
		//orElseThrows(Supplier<X>)
		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("Valor Nulo"))); //ele verifica se está nulo, caso sim, é disparado uma exceção
		
		
		//ifPresent()
		opt.ifPresent(s1 -> System.out.println(s1));
		
	}

	private String getString() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}

	private String getStringAlternativo() {
		System.out.println("Chamou o método getStringAlternativo");
		return "String Alternativo";
	}
}